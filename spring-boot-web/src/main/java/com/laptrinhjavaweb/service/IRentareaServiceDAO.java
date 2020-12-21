package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.RentareaDTO;

import java.util.List;

public interface IRentareaServiceDAO {
    List<RentareaDTO> findRentareaByBuildingId(Integer id);
    Long Save(RentareaDTO rentareaDTO);
    void Delete(Integer[] id);

}
