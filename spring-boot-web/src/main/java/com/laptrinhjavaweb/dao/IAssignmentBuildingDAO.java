package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.dto.AssignmentBuildingDTO;

import java.util.List;
import java.util.Map;

public interface IAssignmentBuildingDAO {
    List<AssignmentBuildingDTO> findbyBuildingID(Integer buildingid);
    void save (AssignmentBuildingDTO assignmentBuildingDTO);
    void delete( Integer buildingid);
    List<AssignmentBuildingDTO> findAll();
}
