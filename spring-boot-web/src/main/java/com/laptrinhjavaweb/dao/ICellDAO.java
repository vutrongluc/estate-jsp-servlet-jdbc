package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.dto.CellDTO;

import java.util.List;

public interface ICellDAO {
    List<CellDTO> findAll();
}
