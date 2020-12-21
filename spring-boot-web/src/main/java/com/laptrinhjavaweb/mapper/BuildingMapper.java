package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.dto.BuildingDTO;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuildingMapper implements RowMapper<BuildingDTO> {
    @Override
    public BuildingDTO mapRow(ResultSet resultSet) {
        try {
            BuildingDTO buildingDTO = new BuildingDTO();

            Integer a = resultSet.getInt("id");
           buildingDTO.setId((long) resultSet.getInt("id"));

            Date date = resultSet.getDate("createddate");
            buildingDTO.setCreateddate(resultSet.getDate("createddate"));

            buildingDTO.setCreatedby(resultSet.getString("createdby"));
            buildingDTO.setModifieddate(resultSet.getTime("modifieddate"));
            buildingDTO.setModifiedby(resultSet.getString("modifiedby"));
            buildingDTO.setAvatar(resultSet.getString("avatar"));
            buildingDTO.setBrokeragetee(resultSet.getString("brokeragetee"));
            buildingDTO.setDecorationtime(resultSet.getString("decorationtime"));
            buildingDTO.setDeposit(resultSet.getString("deposit"));
            buildingDTO.setDistrict(resultSet.getString("district"));
            buildingDTO.setElectricityfee(resultSet.getString("electricityfee"));
            buildingDTO.setFloorarea(resultSet.getInt("floorarea"));
            buildingDTO.setLevel(resultSet.getString("level"));
            buildingDTO.setLinkofbuilding(resultSet.getString("linkofbuilding"));
            buildingDTO.setMap(resultSet.getString("map"));
            buildingDTO.setMotofee(resultSet.getString("motofee"));
            buildingDTO.setName(resultSet.getString("name"));
            buildingDTO.setNumberofbasement(resultSet.getInt("numberofbasement"));
            buildingDTO.setOvertimefee(resultSet.getString("overtimefee"));
            buildingDTO.setPayment(resultSet.getString("payment"));
            buildingDTO.setRentprice(resultSet.getInt("rentprice"));
            buildingDTO.setRentpricedescription(resultSet.getString("rentpricedescription"));
            buildingDTO.setRenttime(resultSet.getString("renttime"));
            buildingDTO.setServicefee(resultSet.getString("servicefee"));
            buildingDTO.setStreet(resultSet.getString("street"));
            buildingDTO.setStructure(resultSet.getString("structure"));
            buildingDTO.setType(resultSet.getString("type"));
            buildingDTO.setWard(resultSet.getString("ward"));
            buildingDTO.setWaterfee(resultSet.getString("waterfee"));

            return buildingDTO;
        }
        catch (SQLException e) {
            return null;
        }
        // TODO Auto-generated method stub

    }

    }

