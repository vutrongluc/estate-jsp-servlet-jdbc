package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuildingConverter {
    @Autowired
    private ModelMapper modelMapper;

    public BuildingDTO convertToDto (BuildingEntity buildingEntity){
        BuildingDTO result = modelMapper.map(buildingEntity, BuildingDTO.class);
        return result;
    }

    public BuildingEntity convertToEntity (BuildingDTO buildingDTO){
        BuildingEntity result = modelMapper.map(buildingDTO, BuildingEntity.class);
        return result;
    }
}
