package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.dto.ScanDTO;

import java.util.List;

public interface IScanDAO {
    List<ScanDTO> findAll();

}
