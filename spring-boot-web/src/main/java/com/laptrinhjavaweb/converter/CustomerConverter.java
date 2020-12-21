package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.dto.CustormerDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.entity.CustormerEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter {
    @Autowired
    private ModelMapper modelMapper;

    public CustormerDTO convertToDto (CustormerEntity custormerEntity){
        CustormerDTO result = modelMapper.map(custormerEntity, CustormerDTO.class);
        return result;
    }

    public CustormerEntity convertToEntity (CustormerDTO custormerDTO){
        CustormerEntity result = modelMapper.map(custormerDTO, CustormerEntity.class);
        return result;
    }
}
