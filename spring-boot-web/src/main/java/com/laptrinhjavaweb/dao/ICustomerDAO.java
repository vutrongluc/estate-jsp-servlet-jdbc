package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.dto.CustormerDTO;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface ICustomerDAO extends IGenericDAO<CustormerDTO> {
    List<CustormerDTO> findAll();
    Long save(CustormerDTO custormerDTO);
    CustormerDTO findOne(Long id);
    void update(CustormerDTO custormerDTO);
    void  delete(Integer id);
    public List<CustormerDTO> findSearch(CustormerDTO custormerDTO);
}
