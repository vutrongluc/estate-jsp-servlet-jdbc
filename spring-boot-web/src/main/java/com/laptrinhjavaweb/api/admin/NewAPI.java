package com.laptrinhjavaweb.api.admin;

import com.laptrinhjavaweb.controller.admin.HomeController;
import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.converter.UserConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.dto.CustormerDTO;
import com.laptrinhjavaweb.dto.RentareaDTO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.UserRepository;
import com.laptrinhjavaweb.service.IBuildingServiceNative;
import com.laptrinhjavaweb.service.ICustomerServiceDAO;
import com.laptrinhjavaweb.service.ICustomerServiceNative;
import com.laptrinhjavaweb.service.IRentareaServiceDAO;
import com.laptrinhjavaweb.service.impl.BuildingService;
import com.laptrinhjavaweb.service.impl.BuildingServiceDAO;
import com.laptrinhjavaweb.service.impl.BuildingServiceNative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController(value = "newAPIOfAdmin")
public class NewAPI {
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


  /*  @Autowired
    UserRepository userRepository;

    @Autowired
    UserConverter userConverter;

    @PostMapping("/api/user")
    public UserEntity InsertBuilding(@RequestBody UserDTO userDTO) {
        return userRepository.save(userConverter.convertToEntity(userDTO));
    }*/



    @PostMapping("/api/building")
    public void InsertBuilding(@RequestBody BuildingDTO buildingDTO) {
      //  buildingService.save(buildingDTO);
      //  buildingServiceNative.save(buildingDTO);
        buildingService.save(buildingDTO);
       // return buildingConverter.convertToDto(buildingService.save(buildingDTO));
    }


    @PutMapping("/api/building")
    public void UpdateBuilding(/*@ModelAttribute("modelSearch") BuildingDTO buildingDTO,*/ @RequestBody BuildingDTO buildingDTO1) {
        //  buildingService.save(buildingDTO);
        buildingService.save(buildingDTO1);

        // return buildingConverter.convertToDto(buildingService.save(buildingDTO));
    }




    @DeleteMapping("/api/building")
    public void DeleteBuilding(@RequestBody BuildingDTO buildingDTO) {
        //  buildingService.save(buildingDTO);
        buildingServiceDAO.delete(buildingDTO.getBuildingid());
        // return buildingConverter.convertToDto(buildingService.save(buildingDTO));
    }

    @PostMapping("/api/customer")
    public void InsertCustomer(@RequestBody CustormerDTO custormerDTO) {
        //  buildingService.save(buildingDTO);
        customerServiceNative.save(custormerDTO);
        // return buildingConverter.convertToDto(buildingService.save(buildingDTO));
    }

    @DeleteMapping("/api/customer")
    public void DeleteCustomer(@RequestBody CustormerDTO custormerDTO) {
        //  buildingService.save(buildingDTO);
        customerServiceDAO.delete(custormerDTO.getListid());
        // return buildingConverter.convertToDto(buildingService.save(buildingDTO));
    }

    @PutMapping("/api/customer")
    public void update(@RequestBody CustormerDTO custormerDTO) {
        //  buildingService.save(buildingDTO);
        customerServiceDAO.update(custormerDTO);
        // return buildingConverter.convertToDto(buildingService.save(buildingDTO));
    }



    @PostMapping("/api/rentarea")
    public void InsertRentarea(@RequestBody RentareaDTO rentareaDTO) {
        //  buildingService.save(buildingDTO);
        rentareaServiceDAO.Save(rentareaDTO);
        // return buildingConverter.convertToDto(buildingService.save(buildingDTO));
    }

    @DeleteMapping("/api/rentarea")
    public void DeleteRentarea(@RequestBody RentareaDTO rentareaDTO) {
        //  buildingService.save(buildingDTO);
        rentareaServiceDAO.Delete(rentareaDTO.getMangId());
        // return buildingConverter.convertToDto(buildingService.save(buildingDTO));
    }

}
