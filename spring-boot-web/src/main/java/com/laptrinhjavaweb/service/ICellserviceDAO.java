package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.CellDTO;

import java.util.List;

public interface ICellserviceDAO {
    List<CellDTO> findAll();
}
