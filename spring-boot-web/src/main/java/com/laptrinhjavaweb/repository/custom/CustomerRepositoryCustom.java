package com.laptrinhjavaweb.repository.custom;

import com.laptrinhjavaweb.dto.CustormerDTO;
import com.laptrinhjavaweb.entity.CustormerEntity;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<CustormerEntity> findSearch(CustormerDTO custormerDTO);
    List<CustormerEntity> findAll();
    void saveCustomer(CustormerEntity custormerEntity);

}
