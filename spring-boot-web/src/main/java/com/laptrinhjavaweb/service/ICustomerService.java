package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.CustormerDTO;

import java.util.List;

public interface ICustomerService {
    List<CustormerDTO> findAll();
    List<CustormerDTO>findAllByEmailAndAndFullname(String email, String fullname);
    CustormerDTO save(CustormerDTO custormerDTO);
    void delete(Integer[] integers);
    CustormerDTO findOne (Integer id);
}
