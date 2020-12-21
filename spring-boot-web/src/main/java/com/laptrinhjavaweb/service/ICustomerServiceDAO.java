package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.CustormerDTO;

import java.util.List;

public interface ICustomerServiceDAO {
    List<CustormerDTO> findSearch(CustormerDTO custormerDTO);
    List<CustormerDTO> findAll();
    Long save(CustormerDTO custormerDTO);
    void delete(Integer[] id);
    void update (CustormerDTO custormerDTO);
    CustormerDTO findone(Integer id);
}
