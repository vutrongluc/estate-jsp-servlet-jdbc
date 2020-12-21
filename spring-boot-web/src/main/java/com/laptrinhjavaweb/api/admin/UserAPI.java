package com.laptrinhjavaweb.api.admin;

import com.laptrinhjavaweb.converter.UserConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.UserRepository;
import com.laptrinhjavaweb.service.ICustomerServiceDAO;
import com.laptrinhjavaweb.service.IUserService;
import com.laptrinhjavaweb.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "userAPIOfAdmin")
public class UserAPI {

    @Autowired
    IUserService userService;

    @Autowired
    UserConverter userConverter;

    @PostMapping("/api/user")
    public UserDTO InsertBuilding(@RequestBody UserDTO userDTO) {
        userService.deleteRole(userDTO);
        userService.saverole(userDTO);
        return userService.saveuser(userDTO);
    }


}
