package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.dto.AssignmentBuildingDTO;
import com.laptrinhjavaweb.dto.RentareaDTO;
import com.laptrinhjavaweb.dto.UserDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AssignmentBuildingMapper  implements RowMapper<AssignmentBuildingDTO>{
    @Override
    public AssignmentBuildingDTO mapRow(ResultSet resultSet) {
        try {
            AssignmentBuildingDTO assignmentBuildingDTO = new AssignmentBuildingDTO();
            assignmentBuildingDTO.setUserid(resultSet.getInt("userid"));
            assignmentBuildingDTO.setBuildingid(resultSet.getInt("buildingid"));
            return assignmentBuildingDTO;
        }
        catch (SQLException e) {
            return null;
        }
    }
}
