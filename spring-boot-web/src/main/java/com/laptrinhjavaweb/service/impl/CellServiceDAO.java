package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.impl.CellDAO;
import com.laptrinhjavaweb.dto.CellDTO;
import com.laptrinhjavaweb.service.ICellserviceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CellServiceDAO implements ICellserviceDAO {
    @Autowired
    CellDAO cellDAO;

    @Override
    public List<CellDTO> findAll() {
        return cellDAO.findAll();
    }
}
