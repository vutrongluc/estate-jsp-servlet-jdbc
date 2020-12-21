package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.converter.CustomerConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.dto.CustormerDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.entity.CustormerEntity;
import com.laptrinhjavaweb.repository.custom.BuildingRepositoryCustom;
import com.laptrinhjavaweb.repository.custom.CustomerRepositoryCustom;
import com.laptrinhjavaweb.service.ICustomerServiceNative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerServiceNative implements ICustomerServiceNative {
    @Autowired
    CustomerRepositoryCustom customerRepositoryCustom;

    @Autowired
    CustomerConverter customerConverter;

    @Override
    public List<CustormerDTO> findSearch(CustormerDTO custormerDTO) {
        List<CustormerDTO> custormerDTOList = new ArrayList<>();
        for (CustormerEntity custormerEntity : customerRepositoryCustom.findSearch(custormerDTO)) {
            custormerDTOList.add(customerConverter.convertToDto(custormerEntity));
        }
        return custormerDTOList;
    }

    @Override
    public List<CustormerDTO> findAll() {
        List<CustormerDTO> custormerDTOList = new ArrayList<>();
        for (CustormerEntity custormerEntity : customerRepositoryCustom.findAll()) {
            custormerDTOList.add(customerConverter.convertToDto(custormerEntity));
        }
        return custormerDTOList;
    }

    @Override
    @Transactional
    public void save(CustormerDTO custormerDTO) {
        customerRepositoryCustom.saveCustomer(customerConverter.convertToEntity(custormerDTO));
    }
}
