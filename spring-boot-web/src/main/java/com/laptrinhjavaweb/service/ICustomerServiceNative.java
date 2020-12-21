package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.CustormerDTO;

import java.util.List;

public interface ICustomerServiceNative {
    List<CustormerDTO> findSearch(CustormerDTO custormerDTO);
    List<CustormerDTO> findAll();
    void save(CustormerDTO custormerDTO);
}
