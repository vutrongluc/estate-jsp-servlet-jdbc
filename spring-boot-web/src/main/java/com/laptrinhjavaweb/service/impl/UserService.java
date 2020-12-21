package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.UserConverter;
import com.laptrinhjavaweb.dao.IUser_roleDAO;
import com.laptrinhjavaweb.dao.IUsersDAO;
import com.laptrinhjavaweb.dao.impl.UserDAO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.dto.User_roleDTO;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.UserRepository;
import com.laptrinhjavaweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService implements IUserService {

    @Autowired UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Autowired
    IUsersDAO userDAO;

    @Autowired
    IUser_roleDAO user_roleDAO;


    @Override
    public UserDTO findOneByUserNameAndStatus(String name, int status) {
        return userConverter.convertToDto(userRepository.findOneByUserNameAndStatus(name, status));
    }

    @Override
    public Map<Long, String> getStaffMaps() {
        Map<Long, String> Mapstaffs = new HashMap<>();

        for(UserEntity userEntity:userRepository.findByStatusAndRoles_Code(1,"STAFF"))
        {
            Mapstaffs.put(userConverter.convertToDto(userEntity).getId(), userConverter.convertToDto(userEntity).getFullName());
        }
        return Mapstaffs;
    }

    @Override
    public List<UserDTO> findUsersByRoleAndStatus() {
        return userDAO.findUserByStatusAndRole();
    }

    @Override
    public List<UserDTO> findAll() {
        List<UserDTO> a= new ArrayList<>();
        for(UserEntity userEntity:userRepository.findAll())
        {
            a.add(userConverter.convertToDto(userEntity));
        }
        return a;

    }

    @Override
    public List<UserDTO> findAlldao() {
        List<UserDTO> a = userDAO.findAll();
        return a;
    }

    @Override
    public UserDTO findById(Integer id) {
        List<UserEntity> a = userRepository.findById(Long.valueOf(id));
        return userConverter.convertToDto(a.get(0));
    }

    @Override
    public List<User_roleDTO> findRoleById(Integer id) {
        return user_roleDAO.findByUserId(id);
    }



    @Override
    public UserDTO saveuser(UserDTO userDTO) {
        return userConverter.convertToDto(userRepository.save(userConverter.convertToEntity(userDTO)));
    }

    @Override
    public void deleteuser(Integer[] id) {
        for(Integer integer:id)
        {
            userRepository.delete(Long.valueOf(integer));
        }
    }

    @Override
    public void saverole(UserDTO userDTO) {
        for(Long roleid : userDTO.getListRole())
        {
            user_roleDAO.save(userDTO.getId(), roleid );
        }

    }

    @Override
    public void deleteRole(UserDTO userDTO) {
        user_roleDAO.delete(userDTO.getId());

    }
}
