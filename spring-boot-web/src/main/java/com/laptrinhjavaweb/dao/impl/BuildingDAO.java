package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.IBuildingDAO;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.mapper.BuildingMapper;
import com.laptrinhjavaweb.mapper.RowMapper;
import com.laptrinhjavaweb.util.CreateSqlSearchBuilding;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BuildingDAO extends AbstractDAO<BuildingDTO> implements IBuildingDAO {
    @Override
    public List<BuildingDTO> findAll() {
        List<BuildingDTO> results = new ArrayList<BuildingDTO>();
        String sql = "Select * from building";
        results = query(sql, new BuildingMapper());
        return results;

    }


    @Override
    public Long save(BuildingDTO buildingDTO) {
     /*   String sql = "Insert into building (createddate, createdby, modifieddate, modifiedby, avatar," +
                "brokeragetee,carfee,decorationtime, deposit, direction , district, electricityfee, " +
                "floorarea, level, linkofbuilding, map, motofee, name, numberofbasement, overtimefee," +
                "payment, rentprice, rentpricedescription, renttime, servicefee, street, structure, " +
                "type, ward, waterfee ) value (?,?,?,?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return insert(sql, buildingDTO.getCreateddate(), buildingDTO.getCreateddy(), buildingDTO.getModifieddate(),
                buildingDTO.getAvatar(), buildingDTO.getBrokeragetee(), buildingDTO.getCarfee(), buildingDTO.getDecorationtime(),
                buildingDTO.getDeposit(), buildingDTO.getDirection(), buildingDTO.getDistrict(), buildingDTO.getElectricityfee(),
                buildingDTO.getFloorarea(), buildingDTO.getLevel(), buildingDTO.getLinkofbuilding(), buildingDTO.getMap(), buildingDTO.getMotofee(),
                buildingDTO.getName(),buildingDTO.getNumberofbasement(), buildingDTO.getOvertimefee(), buildingDTO.getPayment(),
                buildingDTO.getRentprice(), buildingDTO.getRentpricedescription(), buildingDTO.getRenttime(), buildingDTO.getServicefee(),
                buildingDTO.getStreet(), buildingDTO.getStructure(), buildingDTO.getType(), buildingDTO.getWard(), buildingDTO.getWaterfee());*/
        String sql = "Insert into building ( name, numberofbasement, " +
                " street, " +
                " ward) value (?,?,?,?)";
        return insert(sql,
                buildingDTO.getName(), buildingDTO.getNumberofbasement(),
                buildingDTO.getStreet(), buildingDTO.getWard());
    }

    @Override
    public BuildingDTO findOneById(Integer id) {
        String Sql = "Select * from building where id = ?";
        return query(Sql, new BuildingMapper(), id).get(0);
    }


    @Override
    public void Delete(Integer Id) {
        String sql = "Delete from building where id =?";
        delete(sql, Id);

    }


    @Override
    public List<BuildingDTO> findSearch(BuildingDTO buildingDTO) {
        List<BuildingDTO> results = new ArrayList<BuildingDTO>();
        String sql = CreateSqlSearchBuilding.CreatSQLSearch(buildingDTO);
        results = query(sql, new BuildingMapper());
        return results;
    }


}
