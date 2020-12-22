package com.laptrinhjavaweb.controller.admin;

import com.laptrinhjavaweb.dto.CustormerDTO;
import com.laptrinhjavaweb.dto.InputDTO;
import com.laptrinhjavaweb.service.ICellserviceDAO;
import com.laptrinhjavaweb.service.IScanService;
import com.laptrinhjavaweb.service.ISwapCellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "cellControllerOfAdmin")
public class CellControler {

    @Autowired
    ISwapCellService swapCellService;

    @Autowired
    ICellserviceDAO cellserviceDAO;

    @Autowired
    IScanService scanService;

    @RequestMapping(value = "/admin/cell", method = RequestMethod.GET)
    public ModelAndView homePage(@ModelAttribute("modelSearch") InputDTO inputDTO) {
        ModelAndView mav = new ModelAndView("admin/cell");
        mav.addObject("modelSearch", inputDTO);
      //  mav.addObject("model", swapCellService.FindSwapCell(inputDTO.getD(), inputDTO.getDiempv(), inputDTO.getBw(), cellserviceDAO.findAll(), scanService.findAll()));
        /* *//*   gọi bằng customerServiceDAO*//*
        mav.addObject("model", customerServiceDAO.findAll());*/
        return mav;
    }

    @RequestMapping(value = "/admin/findcell", method = RequestMethod.GET)
    public ModelAndView homePage2(@ModelAttribute("modelSearch") InputDTO inputDTO) {
        ModelAndView mav = new ModelAndView("admin/cell");
        mav.addObject("modelSearch", inputDTO);
        mav.addObject("model", swapCellService.FindSwapCell(inputDTO.getD(), inputDTO.getDiempv(), inputDTO.getBw(), cellserviceDAO.findAll(), scanService.findAll()));
        /* *//*   gọi bằng customerServiceDAO*//*
        mav.addObject("model", customerServiceDAO.findAll());*/
        return mav;
    }


}
