package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.dto.ScanDTO;
import com.laptrinhjavaweb.dto.User_roleDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ScanMapper implements RowMapper<ScanDTO>{
    @Override
    public ScanDTO mapRow(ResultSet resultSet) {
        try {
            ScanDTO scanDTO = new ScanDTO();
            scanDTO.setLatitude( resultSet.getDouble("latitude"));
            scanDTO.setLongitude( resultSet.getDouble("longitude"));
            scanDTO.setPsc( resultSet.getDouble("psc"));
            scanDTO.setUarfcn( resultSet.getDouble("uarfcn"));
            return scanDTO;
        }
        catch (SQLException e) {
            return null;
        }
    }
}
