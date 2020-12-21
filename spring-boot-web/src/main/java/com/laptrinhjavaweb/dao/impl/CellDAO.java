package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.ICellDAO;
import com.laptrinhjavaweb.dao.ICustomerDAO;
import com.laptrinhjavaweb.dto.CellDTO;
import com.laptrinhjavaweb.dto.CustormerDTO;
import com.laptrinhjavaweb.mapper.CellMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CellDAO  extends AbstractDAO<CellDTO> implements ICellDAO {
    @Override
    public List<CellDTO> findAll() {
        String sql ="select * from cell";
        return query(sql,new CellMapper());
    }
}
