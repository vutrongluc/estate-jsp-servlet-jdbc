package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.BuildingTypeDTO;

import java.util.List;

public interface IBuildingType {
    List<BuildingTypeDTO> findAllBuildingType();
}
