package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.AssignmentBuildingDTO;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Map;

public interface IAssignmentBuildingServiceDAO {
    List<AssignmentBuildingDTO> findbyBuildingid (Integer id);
    Integer[] findbyBuildingidReturnIDstaffs (Integer id);
    void save (List<AssignmentBuildingDTO> assignmentBuildingDTOS);
    List<AssignmentBuildingDTO> findAll ();
    void delete(Integer id);
}
