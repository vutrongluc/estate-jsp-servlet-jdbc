package com.laptrinhjavaweb.controller.admin;

import com.laptrinhjavaweb.constant.BuildingTypeConstant;
import com.laptrinhjavaweb.constant.DistrictConstant;
import com.laptrinhjavaweb.constant.TransactionTypeConstant;
import com.laptrinhjavaweb.dto.*;
import com.laptrinhjavaweb.service.*;
import com.laptrinhjavaweb.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller(value = "homeControllerOfAdmin")
public class HomeController {

    @Autowired
    IBuildingService buildingService;
    @Autowired
    IDistrict iDistrict;

    @Autowired
    IUserService userService;

    @Autowired
    IBuildingType buildingType;

    @Autowired
    IBuildingServiceNative buildingServiceNative;

    @Autowired
    IBuildingServiceDAO buildingServiceDAO;

    @Autowired
    ICustomerServiceNative customerServiceNative;

    @Autowired
    IRentareaServiceDAO rentareaServiceDAO;

    @Autowired
    IAssignmentBuildingServiceDAO assignmentBuildingServiceDAO;



    @RequestMapping(value = "/admin/list", method = RequestMethod.GET)
    public ModelAndView homePage(@ModelAttribute("modelSearch") BuildingDTO buildingDTO, @RequestParam(defaultValue = "-1") Integer id,  @RequestParam(defaultValue = "false") String status ) {
        ModelAndView mav = new ModelAndView("admin/list");
        mav.addObject("modelSearch", buildingDTO);
        BuildingDTO buildingDTO1 = new BuildingDTO();

       // buildingDTOSofStaffid(buildingServiceNative.findAll(),assignmentBuildingServiceDAO.findAll() );
       // buildingDTO1.setBuildingDTOList(buildingService.findAll());
        //xuat toan bo bang native
        //buildingDTO1.setBuildingDTOList(buildingServiceNative.findAll());
        mav.addObject("model", buildingDTOSofStaffid(buildingServiceNative.findAll(),assignmentBuildingServiceDAO.findAll() ));

        //List<BuildingDTO> buildingDTOList= buildingService.findAll();
        //  mav.addObject("model", buildingDTO1);
        mav.addObject("district", iDistrict.Disttricts());

       // List<CellDTO> cellDTOList = cellserviceDAO.findAll();
       // List<ScanDTO> scanDTOList = scanService.findAll();

       // mav.addObject("cell", cellserviceDAO.findAll());
        //mav.addObject("scan", scanService.findAll());
       // mav.addObject("cellswap", swapCellService.FindSwapCell(5.D,10.D, 40.D, cellDTOList, scanDTOList) );
        //dòng dưới là load district theo constant
        mav.addObject("districtconstant", DistrictConstant.loadDistrictConstant().getMap());
        mav.addObject("staffs", userService.getStaffMaps());

        List<UserDTO> aa = userService.findUsersByRoleAndStatus();
        mav.addObject("ListUser", aa);

        mav.addObject("buildingrentType", buildingType.findAllBuildingType());

        //dòng dưới là load buildingtype theo constant
        mav.addObject("buildingrentTypeConstant", BuildingTypeConstant.loadBuildingTypeConstant().getMap());
        mav.addObject("status", status);
        //dòng dưới là load transtactiontype theo constant
        mav.addObject("TransactionTypeConstant", TransactionTypeConstant.loadTran().getMap());

       /* if(id != -1)
        {
            List<AssignmentBuildingDTO> bb = assignmentBuildingServiceDAO.findbyBuildingid(id);
            mav.addObject("ListAssignment", bb);
        }*/


      /*  if(id!=null)
        {
            mav.addObject("rentareaByBuildingId", rentareaServiceDAO.findRentareaByBuildingId((Long)id));
        }*/

        return mav;
    }





    @RequestMapping(value = "/admin/listserch", method = RequestMethod.GET)
    public ModelAndView homePage2(@ModelAttribute("modelSearch") BuildingDTO buildingDTO ) {
        ModelAndView mav = new ModelAndView("admin/list");
        mav.addObject("modelSearch", buildingDTO);
        BuildingDTO buildingDTO1 = new BuildingDTO();
       // buildingDTO1.setBuildingDTOList(buildingServiceDAO.findSearch(buildingDTO));
        //search bằng native
      //  buildingDTO1.setBuildingDTOList(buildingServiceNative.findSearch(buildingDTO));

        mav.addObject("model", buildingDTOSofStaffid(buildingServiceNative.findSearch(buildingDTO),assignmentBuildingServiceDAO.findAll() ));
        //List<BuildingDTO> buildingDTOList= buildingService.findAll();
        //  mav.addObject("model", buildingDTO1);
        mav.addObject("district", iDistrict.Disttricts());
        //dòng dưới là load district theo constant
        mav.addObject("districtconstant", DistrictConstant.loadDistrictConstant().getMap());
        mav.addObject("staffs", userService.getStaffMaps());

        List<UserDTO> aa = userService.findUsersByRoleAndStatus();
        mav.addObject("ListUser", aa);

        mav.addObject("buildingrentType", buildingType.findAllBuildingType());

        //dòng dưới là load buildingtype theo constant
        mav.addObject("buildingrentTypeConstant", BuildingTypeConstant.loadBuildingTypeConstant().getMap());

        //dòng dưới là load transtactiontype theo constant
        mav.addObject("TransactionTypeConstant", TransactionTypeConstant.loadTran().getMap());
        return mav;
    }

    @RequestMapping(value = "/admin/edit", method = RequestMethod.GET)
    public ModelAndView homePageEdit(@ModelAttribute("modelSearch") BuildingDTO buildingDTO, @RequestParam(defaultValue = "-1") Integer id, @RequestParam(defaultValue = "false") String status) {
        ModelAndView mav = new ModelAndView("admin/edit");
        mav.addObject("district", iDistrict.Disttricts());
        mav.addObject("staffs", userService.getStaffMaps());
        mav.addObject("buildingrentType", buildingType.findAllBuildingType());

      //  BuildingDTO buildingDTO1=new BuildingDTO();
       // buildingDTO1.setId((long) -1);
      //  mav.addObject("modelSearch", buildingDTO1);
        if(id!=-1)
        {
            mav.addObject("modelSearch", buildingService.findOne(Long.valueOf(id)));
            mav.addObject("rentareaByBuildingId", rentareaServiceDAO.findRentareaByBuildingId(id));
            mav.addObject("buildingById", buildingServiceDAO.findById(id));
            mav.addObject("assigmentBuilding",assignmentBuildingServiceDAO.findbyBuildingidReturnIDstaffs(id));
            mav.addObject("giaonha", status);
        }
        return mav;
    }




    @RequestMapping(value = "/admin/rentarea", method = RequestMethod.GET)
    public ModelAndView Rentarea(@RequestParam(defaultValue = "1") Integer id) {
        ModelAndView mav = new ModelAndView("admin/rentarea");
       // mav.addObject("modelSearch", buildingDTO);
        BuildingDTO buildingDTO1 = new BuildingDTO();

        mav.addObject("rentareaByBuildingId", rentareaServiceDAO.findRentareaByBuildingId(id));
        mav.addObject("buildingById", buildingServiceDAO.findById(id));
        return mav;
    }

    public static List<BuildingDTO> buildingDTOSofStaffid(List<BuildingDTO> buildingDTOS, List<AssignmentBuildingDTO> assignmentBuildingDTOS)
    {
        for(BuildingDTO buildingDTO:buildingDTOS)
        {
            for(AssignmentBuildingDTO assignmentBuildingDTO:assignmentBuildingDTOS)
            {
                if(Long.valueOf(assignmentBuildingDTO.getBuildingid())== buildingDTO.getId())
                {
                    buildingDTO.getStaffidlist().add(assignmentBuildingDTO.getUserid());
                }
            }
        }
        return  buildingDTOS;
    }



}
