package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;

import java.util.List;

public interface IBuildingService {
    List<BuildingDTO> findAll();
    BuildingDTO save(BuildingDTO buildingDTO);
    void delete(Integer[] integers);
    BuildingDTO findOne(Long id);

}
