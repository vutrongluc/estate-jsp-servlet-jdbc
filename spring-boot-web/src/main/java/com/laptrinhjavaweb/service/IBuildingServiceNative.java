package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.BuildingDTO;

import java.util.List;

public interface IBuildingServiceNative {
    List<BuildingDTO> findSearch(BuildingDTO buildingDTO);
    List<BuildingDTO> findAll();
    void save(BuildingDTO buildingDTO);
}
