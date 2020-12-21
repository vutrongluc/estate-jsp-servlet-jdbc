package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.EnumObject.BuildingTypeEnum;
import com.laptrinhjavaweb.EnumObject.DistrictEnum;
import com.laptrinhjavaweb.dto.BuildingTypeDTO;
import com.laptrinhjavaweb.dto.DistrictDTO;
import com.laptrinhjavaweb.service.IBuildingType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BuildingType implements IBuildingType {
    @Override
    public List<BuildingTypeDTO> findAllBuildingType() {
        List<BuildingTypeDTO> buildingTypeDTOList= new ArrayList<>();
        for(BuildingTypeEnum buildingTypeEnum: BuildingTypeEnum.values())
        {
            BuildingTypeDTO buildingTypeDTO = new BuildingTypeDTO();
            buildingTypeDTO.setNameBuildingType(buildingTypeEnum.getNameBuildingType());
            buildingTypeDTO.setCodeBuildingType(buildingTypeEnum.getCodeBuildingType());
            buildingTypeDTOList.add(buildingTypeDTO)  ;
        }
        return buildingTypeDTOList;

    }
}
