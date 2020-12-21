package com.laptrinhjavaweb.repository.custom;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;

import java.util.List;

public interface BuildingRepositoryCustom {
    List<BuildingEntity> findAll();
    List<BuildingEntity> findSearch(BuildingDTO buildingDTO);
    void saveBuilding(BuildingEntity buildingEntity);

}
