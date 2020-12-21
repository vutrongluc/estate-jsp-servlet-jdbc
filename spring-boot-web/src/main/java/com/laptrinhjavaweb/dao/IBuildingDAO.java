package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.dto.BuildingDTO;

import java.util.List;

public interface IBuildingDAO extends IGenericDAO<BuildingDTO> {
    List<BuildingDTO> findAll();
    Long save(BuildingDTO buildingDTO);
    BuildingDTO findOneById(Integer id);
    void  Delete(Integer mangId);
    public List<BuildingDTO> findSearch(BuildingDTO buildingDTO);
}
