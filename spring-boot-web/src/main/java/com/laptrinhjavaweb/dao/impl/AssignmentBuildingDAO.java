package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.IAssignmentBuildingDAO;
import com.laptrinhjavaweb.dto.AssignmentBuildingDTO;
import com.laptrinhjavaweb.mapper.AssignmentBuildingMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class AssignmentBuildingDAO extends AbstractDAO<AssignmentBuildingDTO> implements IAssignmentBuildingDAO {
    @Override
    public List<AssignmentBuildingDTO> findbyBuildingID(Integer buildingid) {
        String sql = "SELECT * from assignmentbuilding WHERE buildingid = ?";
        return query(sql, new AssignmentBuildingMapper(), buildingid);
    }

    @Override
    public void save(AssignmentBuildingDTO assignmentBuildingDTO) {
        String sql = "INSERT INTO assignmentbuilding (buildingid, userid) value(?,?)";
        insert(sql,assignmentBuildingDTO.getBuildingid(), assignmentBuildingDTO.getUserid());


    }

    @Override
    public void delete(Integer buildingid) {
        String sql = "Delete from assignmentbuilding where buildingid = ?";
        delete(sql,buildingid);

    }

    @Override
    public List<AssignmentBuildingDTO> findAll() {
        String sql = "SELECT * from assignmentbuilding";
        return query(sql, new AssignmentBuildingMapper());
    }


}
