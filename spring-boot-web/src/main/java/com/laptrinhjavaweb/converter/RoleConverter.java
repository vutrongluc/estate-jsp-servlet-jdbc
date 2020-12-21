package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.RoleDTO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.RoleEntity;
import com.laptrinhjavaweb.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter {
    @Autowired
    private ModelMapper modelMapper;

    public RoleDTO convertToDto (RoleEntity entity){
        return modelMapper.map(entity, RoleDTO.class);
    }

    public RoleEntity convertToEntity (RoleDTO dto){
        return  modelMapper.map(dto, RoleEntity.class);

    }
}
