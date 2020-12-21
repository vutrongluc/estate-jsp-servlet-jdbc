package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.dto.CellDTO;
import com.laptrinhjavaweb.dto.CustormerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CellMapper implements RowMapper<CellDTO>{
    @Override
    public CellDTO mapRow(ResultSet resultSet) {
        try {
            CellDTO cellDTO = new CellDTO();
            cellDTO.setCellname(resultSet.getString("cellname"));
            cellDTO.setNodename(resultSet.getString("nodename"));
            cellDTO.setLat(resultSet.getDouble("lat"));
            cellDTO.setLon(resultSet.getDouble("lon"));
            cellDTO.setAzimuth(resultSet.getDouble("azimuth"));
            cellDTO.setPscrambcode(resultSet.getDouble("pscrambcode"));
            cellDTO.setUarfcndownlink(resultSet.getDouble("uarfcndownlink"));
            return cellDTO;
        }
        catch (SQLException e) {
            return null;
        }
    }
}
