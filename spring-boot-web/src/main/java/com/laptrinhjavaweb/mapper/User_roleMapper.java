package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.dto.User_roleDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User_roleMapper implements RowMapper<User_roleDTO>{
    @Override
    public User_roleDTO mapRow(ResultSet resultSet) {
        try {
            User_roleDTO user_roleDTO = new User_roleDTO();
            user_roleDTO.setUser_id( resultSet.getInt("user_id"));
            user_roleDTO.setRole_id( resultSet.getInt("role_id"));
            return user_roleDTO;
        }
        catch (SQLException e) {
            return null;
        }
    }
}