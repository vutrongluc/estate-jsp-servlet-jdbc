package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.EnumObject.DistrictEnum;
import com.laptrinhjavaweb.dto.DistrictDTO;
import com.laptrinhjavaweb.service.IDistrict;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class District implements IDistrict {
    @Override
    public List<DistrictDTO> Disttricts() {
        List<DistrictDTO> districtDTOS= new ArrayList<>();
        for(DistrictEnum districtEnum: DistrictEnum.values())
        {
            DistrictDTO districtDTO = new DistrictDTO();
            districtDTO.setNameDistrict(districtEnum.getNameQuan());
            districtDTO.setCodeDistrict(districtEnum.getCodeQuan());
            districtDTOS.add(districtDTO)  ;
        }
        return districtDTOS;
    }
}
