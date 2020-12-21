package com.laptrinhjavaweb.controller.admin;

import com.laptrinhjavaweb.dto.AssignmentBuildingDTO;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller(value = "homeUserOfAdmin")
public class UserControler {
    @Autowired
    IBuildingService buildingService;
    @Autowired
    IDistrict iDistrict;

    @Autowired
    IUserService userService;
    @Autowired
    IRoleService roleService;






    @RequestMapping(value = "/admin/listuser", method = RequestMethod.GET)
    public ModelAndView homePage(@ModelAttribute("modelSearch") UserDTO userDTO, @RequestParam(defaultValue = "-1") Integer id, @RequestParam(defaultValue = "false") String status ) {
        ModelAndView mav = new ModelAndView("admin/listuser");
        mav.addObject("modelSearch", userDTO);
        BuildingDTO buildingDTO1 = new BuildingDTO();
        mav.addObject("model", userService.findAlldao());



        return mav;
    }


    @RequestMapping(value = "/admin/edituser", method = RequestMethod.GET)
    public ModelAndView edituser(@RequestParam(defaultValue = "-1") Integer id, @RequestParam(defaultValue = "false") String status ) {
        ModelAndView mav = new ModelAndView("admin/useredit");
        mav.addObject("role", roleService.fillAll());

        if(id != -1)
        {
            mav.addObject("modelbyId", userService.findById(id));
            mav.addObject("user_roleById", userService.findRoleById(id));
        }
        return mav;
    }



}
