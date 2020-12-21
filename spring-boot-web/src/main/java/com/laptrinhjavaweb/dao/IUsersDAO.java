package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.dto.UserDTO;

import java.util.List;

public interface IUsersDAO {
    List<UserDTO> findUserByStatusAndRole();
    List<UserDTO> findAll();
}
