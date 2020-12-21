package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.dto.User_roleDTO;

import java.util.List;
import java.util.Map;

public interface IUserService {
    UserDTO findOneByUserNameAndStatus(String name, int status);
    Map<Long, String> getStaffMaps();

    List<UserDTO> findUsersByRoleAndStatus();
    List<UserDTO> findAll();
    List<UserDTO> findAlldao();
    UserDTO findById(Integer id);
    List<User_roleDTO> findRoleById(Integer id);
    UserDTO saveuser(UserDTO userDTO);
    void deleteuser(Integer[] id);

    void saverole(UserDTO userDTO);
    void deleteRole (UserDTO userDTO);






}
