package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.dto.CustormerDTO;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<CustormerDTO>  {
    @Override
    public CustormerDTO mapRow(ResultSet resultSet) {
        try {
            CustormerDTO custormerDTO = new CustormerDTO();
            custormerDTO.setId((long) resultSet.getInt("id"));
            custormerDTO.setCreateddate(resultSet.getDate("createddate"));
            custormerDTO.setCreatedby(resultSet.getString("createdby"));
            custormerDTO.setModifieddate(resultSet.getTime("modifieddate"));
            custormerDTO.setModifiedby(resultSet.getString("modifiedby"));
            custormerDTO.setEmail(resultSet.getString("email"));
            custormerDTO.setFullname(resultSet.getString("fullname"));
            custormerDTO.setPhone(resultSet.getString("phone"));
            return custormerDTO;
        }
        catch (SQLException e) {
            return null;
        }
    }
}
