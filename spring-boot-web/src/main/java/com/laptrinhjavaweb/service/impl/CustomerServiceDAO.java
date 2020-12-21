package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.ICustomerDAO;
import com.laptrinhjavaweb.dto.CustormerDTO;
import com.laptrinhjavaweb.service.ICustomerServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceDAO implements ICustomerServiceDAO {

    @Autowired
    ICustomerDAO customerDAO;

    @Override
    public List<CustormerDTO> findSearch(CustormerDTO custormerDTO) {
        return customerDAO.findSearch(custormerDTO);

    }



    @Override
    public List<CustormerDTO> findAll() {
        return customerDAO.findAll();
    }

    @Override
    public Long save(CustormerDTO custormerDTO) {
        return customerDAO.save(custormerDTO);
    }

    @Override
    public void delete(Integer[] id) {
        for(Integer item:id)
        {
            customerDAO.delete(item);

        }
    }

    @Override
    public void update(CustormerDTO custormerDTO) {
        CustormerDTO custormerDTOold  = customerDAO.findOne(custormerDTO.getId());
        if(!custormerDTO.getFullname().isEmpty() && !(custormerDTO.getFullname() == null))
            custormerDTOold.setFullname(custormerDTO.getFullname());

        if(!custormerDTO.getEmail().isEmpty() && !(custormerDTO.getEmail()==null))
            custormerDTOold.setEmail(custormerDTO.getEmail());

        if(!custormerDTO.getPhone().isEmpty() && !(custormerDTO.getPhone()==null))
            custormerDTOold.setPhone(custormerDTO.getPhone());

        if(!(custormerDTO.getCreateddate()==null))
            custormerDTOold.setCreateddate(custormerDTO.getCreateddate());
        if(!(custormerDTO.getModifieddate()==null))
            custormerDTOold.setModifieddate(custormerDTO.getModifieddate());

     /*   if(!custormerDTO.getModifiedby().isEmpty() && !(custormerDTO.getModifiedby()==null))
            custormerDTOold.setModifiedby(custormerDTO.getModifiedby());

        if(!custormerDTO.getCreatedby().isEmpty() && !(custormerDTO.getCreatedby()==null))
            custormerDTOold.setCreatedby(custormerDTO.getCreatedby());*/

        customerDAO.update(custormerDTOold);

    }

    @Override
    public CustormerDTO findone(Integer id) {
        return customerDAO.findOne(Long.valueOf(id));
    }


}
