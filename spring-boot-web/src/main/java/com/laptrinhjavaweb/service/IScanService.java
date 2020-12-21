package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.ScanDTO;

import java.util.List;

public interface IScanService  {
    List<ScanDTO> findAll();
}
