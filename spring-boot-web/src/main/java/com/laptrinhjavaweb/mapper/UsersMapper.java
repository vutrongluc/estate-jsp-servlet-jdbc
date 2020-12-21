package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.dto.RentareaDTO;
import com.laptrinhjavaweb.dto.UserDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersMapper implements RowMapper<UserDTO>{
    @Override
    public UserDTO mapRow(ResultSet resultSet) {
        try {
            UserDTO userDTO = new UserDTO();
            userDTO.setId((long) resultSet.getInt("id"));
            userDTO.setFullName(resultSet.getString("full_name"));
            userDTO.setEmail(resultSet.getString("email"));
            userDTO.setUserName(resultSet.getString("user_name"));
            userDTO.setPhone(resultSet.getString("phone"));
            userDTO.setStatus(resultSet.getInt("status"));

            return userDTO;
        }
        catch (SQLException e) {
            return null;
        }
    }
}
