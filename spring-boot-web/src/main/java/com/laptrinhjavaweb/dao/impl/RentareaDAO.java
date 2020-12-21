package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.IRentareaDAO;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.dto.RentareaDTO;
import com.laptrinhjavaweb.mapper.BuildingMapper;
import com.laptrinhjavaweb.mapper.RentareaMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RentareaDAO extends AbstractDAO<RentareaDTO> implements IRentareaDAO {

    @Override
    public List<RentareaDTO> findRentareaByBuildingId(Integer id) {
        String sql = "SELECT * FROM test.rentarea where buildingid = ?";
        return query(sql, new RentareaMapper(), id);
    }

    @Override
    public Long Save(RentareaDTO rentareaDTO) {
       String sql =  "INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ( ?, ?)";
        return insert(sql, rentareaDTO.getValue(),rentareaDTO.getBuildingid());

    }

    @Override
    public void Delete(Integer id) {
        String sql = "DELETE FROM `test`.`rentarea` WHERE id = ? ";
        delete(sql,id);
    }

    @Override
    public void DeletebyBuildingid(Integer id) {
        String sql = "DELETE FROM `test`.`rentarea` WHERE buildingid = ? ";
        delete(sql,id);
    }
}
