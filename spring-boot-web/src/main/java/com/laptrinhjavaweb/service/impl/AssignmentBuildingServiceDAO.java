package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.IAssignmentBuildingDAO;
import com.laptrinhjavaweb.dto.AssignmentBuildingDTO;
import com.laptrinhjavaweb.service.IAssignmentBuildingServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Map;

@Service
public class AssignmentBuildingServiceDAO implements IAssignmentBuildingServiceDAO {
    @Autowired
    IAssignmentBuildingDAO assignmentBuildingDAO;

    @Override
    public List<AssignmentBuildingDTO> findbyBuildingid(Integer id) {


        return assignmentBuildingDAO.findbyBuildingID(id);
    }

    @Override
    public Integer[] findbyBuildingidReturnIDstaffs(Integer id) {
        List<AssignmentBuildingDTO> Idstaffs = assignmentBuildingDAO.findbyBuildingID(id);
        Integer[] idStaffs= new Integer[Idstaffs.size()];
        int dem =0;
        for(AssignmentBuildingDTO item : Idstaffs)
        {
            idStaffs[dem] = item.getUserid();
            dem++;
        }
        return idStaffs;
    }


    @Override
    public void save(List<AssignmentBuildingDTO> assignmentBuildingDTOS) {
        for (AssignmentBuildingDTO assignmentBuildingDTO1: assignmentBuildingDTOS)
        {
            assignmentBuildingDAO.save(assignmentBuildingDTO1);
        }

    }

    @Override
    public List<AssignmentBuildingDTO> findAll() {
        return assignmentBuildingDAO.findAll();
    }

    @Override
    public void delete(Integer id) {
        assignmentBuildingDAO.delete(id);
    }
}
