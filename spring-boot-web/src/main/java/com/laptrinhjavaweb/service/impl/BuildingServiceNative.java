package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.BuildingRepository;
import com.laptrinhjavaweb.repository.custom.BuildingRepositoryCustom;
import com.laptrinhjavaweb.service.IBuildingServiceNative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingServiceNative implements IBuildingServiceNative {
    @Autowired
    BuildingRepositoryCustom buildingRepositoryCustom;

    @Autowired
    BuildingConverter buildingConverter;

    @Override
    public List<BuildingDTO> findSearch(BuildingDTO buildingDTO) {

        List<BuildingDTO> buildingDTOList = new ArrayList<>();
        for (BuildingEntity buildingEntity : buildingRepositoryCustom.findSearch(buildingDTO)) {
            buildingDTOList.add(buildingConverter.convertToDto(buildingEntity));
        }
        return buildingDTOList;

    }

    @Override
    public List<BuildingDTO> findAll() {
        List<BuildingDTO> buildingDTOList = new ArrayList<>();
        for (BuildingEntity buildingEntity : buildingRepositoryCustom.findAll()) {
            buildingDTOList.add(buildingConverter.convertToDto(buildingEntity));
        }
        return buildingDTOList;
    }

    @Override
    @Transactional
    public void save(BuildingDTO buildingDTO) {
        buildingRepositoryCustom.saveBuilding(buildingConverter.convertToEntity(buildingDTO));
    }
}
