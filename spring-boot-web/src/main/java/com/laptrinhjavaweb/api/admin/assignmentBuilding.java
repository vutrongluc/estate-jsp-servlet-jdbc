package com.laptrinhjavaweb.api.admin;

import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.dto.AssignmentBuildingDTO;
import com.laptrinhjavaweb.dto.AssignmentDTO;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.service.IAssignmentBuildingServiceDAO;
import com.laptrinhjavaweb.service.ICustomerServiceDAO;
import com.laptrinhjavaweb.service.ICustomerServiceNative;
import com.laptrinhjavaweb.service.IRentareaServiceDAO;
import com.laptrinhjavaweb.service.impl.BuildingService;
import com.laptrinhjavaweb.service.impl.BuildingServiceDAO;
import com.laptrinhjavaweb.service.impl.BuildingServiceNative;
import com.laptrinhjavaweb.util.ConvertAssignmentDTOtoAssignmentBuildingDTOs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "assignmentBuildingOfAdmin")
public class assignmentBuilding {
    @Autowired
    BuildingService buildingService;
    @Autowired
    BuildingConverter buildingConverter;

    @Autowired
    BuildingServiceNative buildingServiceNative;


    @Autowired
    BuildingServiceDAO buildingServiceDAO;

    @Autowired
    ICustomerServiceNative customerServiceNative;


    @Autowired
    IRentareaServiceDAO rentareaServiceDAO;

    @Autowired
    ICustomerServiceDAO customerServiceDAO;

    @Autowired
    IAssignmentBuildingServiceDAO assignmentBuildingServiceDAO;

    @PostMapping("/api/assignment")
    public void InsertBuilding(@RequestBody AssignmentDTO assignmentDTO) {
        //  buildingService.save(buildingDTO);
        //  buildingServiceNative.save(buildingDTO);
        assignmentBuildingServiceDAO.delete(assignmentDTO.getBuildingid());

        assignmentBuildingServiceDAO.save(ConvertAssignmentDTOtoAssignmentBuildingDTOs.convert(assignmentDTO));

        // return buildingConverter.convertToDto(buildingService.save(buildingDTO));
    }


}
