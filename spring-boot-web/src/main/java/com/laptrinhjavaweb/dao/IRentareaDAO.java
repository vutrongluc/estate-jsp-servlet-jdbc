package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.dto.RentareaDTO;

import java.util.List;

public interface IRentareaDAO {
    List<RentareaDTO> findRentareaByBuildingId (Integer id);
    Long Save(RentareaDTO rentareaDTO);
    void Delete(Integer id);
    void DeletebyBuildingid(Integer id);
}
