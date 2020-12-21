package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.IScanDAO;
import com.laptrinhjavaweb.dto.ScanDTO;
import com.laptrinhjavaweb.service.IScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScanService implements IScanService {

    @Autowired
    IScanDAO scanDAO;
    @Override
    public List<ScanDTO> findAll() {
        return scanDAO.findAll();
    }
}
