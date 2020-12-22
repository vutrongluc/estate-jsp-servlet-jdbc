package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.CellDTO;
import com.laptrinhjavaweb.dto.ScanDTO;

import java.util.List;

public interface ISwapCellService {
    List<CellDTO> FindSwapCell(double d, double diempv, double bw, List<CellDTO> cellDTOList, List<ScanDTO> scanDTOList);
}
