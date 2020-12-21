package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.RoleConverter;
import com.laptrinhjavaweb.dto.RoleDTO;
import com.laptrinhjavaweb.entity.RoleEntity;
import com.laptrinhjavaweb.repository.RoleRepository;
import com.laptrinhjavaweb.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService implements IRoleService {

    @Autowired
    RoleConverter roleConverter;

    @Autowired
    RoleRepository roleRepository;


    @Override
    public List<RoleDTO> fillAll() {
        List<RoleDTO> roleDTOS= new ArrayList<>();
        for(RoleEntity roleEntity: roleRepository.findAll() )
        {
            roleDTOS.add(roleConverter.convertToDto(roleEntity));
        }
        return roleDTOS;
    }
}
