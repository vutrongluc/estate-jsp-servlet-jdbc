package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.dto.CustormerDTO;
import com.laptrinhjavaweb.dto.RentareaDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RentareaMapper implements RowMapper<RentareaDTO> {
    @Override
    public RentareaDTO mapRow(ResultSet resultSet) {
        try {
            RentareaDTO rentareaDTO = new RentareaDTO();
            rentareaDTO.setId((long) resultSet.getInt("id"));
            rentareaDTO.setCreateddate(resultSet.getDate("createddate"));
            rentareaDTO.setCreatedby(resultSet.getString("createdby"));
            rentareaDTO.setModifieddate(resultSet.getTime("modifieddate"));
            rentareaDTO.setModifiedby(resultSet.getString("modifiedby"));
            rentareaDTO.setBuildingid(resultSet.getInt("buildingid"));
            rentareaDTO.setValue(resultSet.getInt("value"));
            return rentareaDTO;
        }
        catch (SQLException e) {
            return null;
        }
    }
}
