package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.BuildingRepository;
import com.laptrinhjavaweb.service.IBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BuildingService implements IBuildingService {
    @Autowired
    BuildingRepository buildingRepository;
    @Autowired
    private BuildingConverter buildingConverter;

    @Override
    public List<BuildingDTO> findAll() {
        List<BuildingDTO> buildingDTOList = new ArrayList<>();


        for(BuildingEntity buildingEntity:buildingRepository.findAll())
        {
            buildingDTOList.add(buildingConverter.convertToDto(buildingEntity));

        }

        return buildingDTOList;
    }

    @Override
    public BuildingDTO save(BuildingDTO buildingDTO) {
        return buildingConverter.convertToDto(buildingRepository.save(buildingConverter.convertToEntity(buildingDTO))) ;
    }

    @Override
    public void delete(Integer[] integers) {
        for(Integer integer:integers)
        {
            buildingRepository.delete(Long.valueOf(integer));
        }
    }

    @Override
    public BuildingDTO findOne(Long id) {
        return buildingConverter.convertToDto(buildingRepository.findOne(id));
    }


}
