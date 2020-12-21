package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.ICustomerDAO;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.dto.CustormerDTO;
import com.laptrinhjavaweb.mapper.BuildingMapper;
import com.laptrinhjavaweb.mapper.CustomerMapper;
import com.laptrinhjavaweb.util.CreateSqlSearchBuilding;
import com.laptrinhjavaweb.util.CreateSqlSearchCustomer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerDAO extends AbstractDAO<CustormerDTO> implements ICustomerDAO {
    @Override
    public List<CustormerDTO> findAll() {
        List<CustormerDTO> results = new ArrayList<CustormerDTO>();
        String sql = "Select * from customer";
        results = query(sql, new CustomerMapper());
        return results;
    }

    @Override
    public Long save(CustormerDTO custormerDTO) {
        String sql = "INSERT INTO `test`.`custormer` (`email`, `fullname`, `phone`) VALUES (?,?,?)";
        return  insert(sql, custormerDTO.getEmail(),custormerDTO.getFullname(), custormerDTO.getPhone());
       // return null;
    }

    @Override
    public CustormerDTO findOne(Long id)
    {

        String sql = "Select * from custormer where id =?";
        return query(sql, new CustomerMapper(), id).get(0);
    }

    @Override
    public void update(CustormerDTO custormerDTO) {
        String sql = "UPDATE custormer SET fullname = ?, phone = ?, email = ?  WHERE (`id` = ?)";

        update(sql, custormerDTO.getFullname(), custormerDTO.getPhone(), custormerDTO.getEmail(),
               custormerDTO.getId()  );
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM custormer WHERE id = ?";
        delete(sql,id);

    }


    @Override
    public List<CustormerDTO> findSearch(CustormerDTO custormerDTO) {
        List<CustormerDTO> results = new ArrayList<CustormerDTO>();
        String sql = CreateSqlSearchCustomer.CreatSQLSearch(custormerDTO);
        results = query(sql, new CustomerMapper());
        return results;
    }
}
