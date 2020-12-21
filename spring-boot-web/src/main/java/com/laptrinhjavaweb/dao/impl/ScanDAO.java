package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.IScanDAO;
import com.laptrinhjavaweb.dto.ScanDTO;
import com.laptrinhjavaweb.mapper.ScanMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScanDAO extends AbstractDAO<ScanDTO> implements IScanDAO {
    @Override
    public List<ScanDTO> findAll() {
        String sql ="select * from scan";

        return query(sql, new ScanMapper());
    }
}
