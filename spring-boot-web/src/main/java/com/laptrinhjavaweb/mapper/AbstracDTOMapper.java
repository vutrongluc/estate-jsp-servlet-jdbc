package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.dto.AbstractDTO;
import com.laptrinhjavaweb.dto.BuildingDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AbstracDTOMapper implements RowMapper<AbstractDTO> {
    @Override
    public AbstractDTO mapRow(ResultSet resultSet) {
        try {
            AbstractDTO abstractDTO = new AbstractDTO();

            abstractDTO.setId((long) resultSet.getInt("id"));

            abstractDTO.setCreateddate(resultSet.getTime("createddate"));

            abstractDTO.setCreatedby(resultSet.getString("createdby"));
            abstractDTO.setModifieddate(resultSet.getTime("modifieddate"));
            abstractDTO.setModifiedby(resultSet.getString("modifiedby"));

            return abstractDTO;
        }
        catch (SQLException e) {
            return null;
        }
        // TODO Auto-generated method stub

    }




}
