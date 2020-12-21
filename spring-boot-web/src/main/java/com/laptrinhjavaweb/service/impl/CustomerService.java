package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.CustomerConverter;
import com.laptrinhjavaweb.dto.CustormerDTO;
import com.laptrinhjavaweb.entity.CustormerEntity;
import com.laptrinhjavaweb.repository.CustomerRepository;
import com.laptrinhjavaweb.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CustomerConverter customerConverter;
    @Override
    public List<CustormerDTO> findAll() {
        List<CustormerEntity> custormerEntityList = customerRepository.findAll();
        List<CustormerDTO> custormerDTOList = new ArrayList<>();
        for(CustormerEntity custormerEntity: custormerEntityList)
        {
            custormerDTOList.add(customerConverter.convertToDto(custormerEntity));
        }
        return custormerDTOList;
    }

    @Override
    public List<CustormerDTO> findAllByEmailAndAndFullname(String email, String fullname) {
        List<CustormerEntity> custormerEntityList = customerRepository.findAllByEmailAndAndFullname(email,fullname);
        List<CustormerDTO> custormerDTOList = new ArrayList<>();
        for(CustormerEntity custormerEntity: custormerEntityList)
        {
            custormerDTOList.add(customerConverter.convertToDto(custormerEntity));
        }
        return custormerDTOList;
    }

    @Override
    //@Transactional
    public CustormerDTO save(CustormerDTO custormerDTO) {
        return customerConverter.convertToDto(customerRepository.save(customerConverter.convertToEntity(custormerDTO)));
    }

    @Override
   // @Transactional
    public void delete(Integer[] integers) {
        for(Integer integer: integers)
        {
            customerRepository.delete(Long.valueOf(integer));
        }


    }

    @Override
    public CustormerDTO findOne(Integer id) {
        return customerConverter.convertToDto(customerRepository.findOne(Long.valueOf(id))) ;
    }
}
