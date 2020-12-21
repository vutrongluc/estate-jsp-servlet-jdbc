package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.IBuildingDAO;
import com.laptrinhjavaweb.dao.IRentareaDAO;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.service.IAssignmentBuildingServiceDAO;
import com.laptrinhjavaweb.service.IBuildingServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingServiceDAO implements IBuildingServiceDAO {
    @Autowired
    private IBuildingDAO buildingDAO;

    @Autowired
    private IAssignmentBuildingServiceDAO assignmentBuildingServiceDAO;

    @Autowired
    private IRentareaDAO rentareaDAO;
    @Override
    public List<BuildingDTO> findSearch(BuildingDTO buildingDTO) {
        return buildingDAO.findSearch(buildingDTO);
    }

    @Override
    public List<BuildingDTO> findAll() {
        return buildingDAO.findAll();
    }

    @Override
    public Long save(BuildingDTO buildingDTO) {
        return buildingDAO.save(buildingDTO) ;
    }

    @Override
    public BuildingDTO findById(Integer id) {
        return buildingDAO.findOneById(id);
    }

    @Override
    public void delete(Integer[] id) {
        for( Integer item :id) {
            rentareaDAO.DeletebyBuildingid(item);
        }

        for( Integer item :id) {
            assignmentBuildingServiceDAO.delete(item);
        }
        for( Integer item :id)
        {
            buildingDAO.Delete(item);
        }

    }
}
