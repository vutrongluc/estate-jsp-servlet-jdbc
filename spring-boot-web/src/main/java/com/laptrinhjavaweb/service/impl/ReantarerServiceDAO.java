package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.IRentareaDAO;
import com.laptrinhjavaweb.dto.RentareaDTO;
import com.laptrinhjavaweb.service.IRentareaServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReantarerServiceDAO implements IRentareaServiceDAO {

    @Autowired
    IRentareaDAO rentareaDAO;

    @Override
    public List<RentareaDTO> findRentareaByBuildingId(Integer id) {
        return rentareaDAO.findRentareaByBuildingId(id);

    }

    @Override
    public Long Save(RentareaDTO rentareaDTO) {
        return rentareaDAO.Save(rentareaDTO);
    }

    @Override
    public void Delete(Integer[] id) {
        for(Integer item:id)
        {
            rentareaDAO.Delete(item);
        }

    }
}
