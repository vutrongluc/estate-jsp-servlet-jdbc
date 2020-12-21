package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.BuildingDTO;

import java.util.List;

public interface IBuildingServiceDAO {
    List<BuildingDTO> findSearch(BuildingDTO buildingDTO);
    List<BuildingDTO> findAll();
    Long save(BuildingDTO buildingDTO);
    BuildingDTO findById(Integer id);
    void delete(Integer[] id);


}
