package com.laptrinhjavaweb.controller.admin;

import com.laptrinhjavaweb.dao.ICustomerDAO;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.dto.CustormerDTO;
import com.laptrinhjavaweb.service.ICustomerServiceDAO;
import com.laptrinhjavaweb.service.ICustomerServiceNative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "customerControllerOfAdmin")
public class CustomerControler {

    @Autowired
    ICustomerServiceNative customerServiceNative;

    @Autowired
    ICustomerServiceDAO customerServiceDAO;




    @RequestMapping(value = "/admin/customer", method = RequestMethod.GET)
    public ModelAndView homePage(@ModelAttribute("modelSearch") CustormerDTO custormerDTO) {
        ModelAndView mav = new ModelAndView("admin/listCustomer");
        mav.addObject("modelSearch", custormerDTO);
        mav.addObject("model", customerServiceNative.findAll());
    /* *//*   gọi bằng customerServiceDAO*//*
        mav.addObject("model", customerServiceDAO.findAll());*/
        return mav;
    }


    @RequestMapping(value = "/admin/listserchcustomer", method = RequestMethod.GET)
    public ModelAndView homePage2(@ModelAttribute("modelSearchcus") CustormerDTO custormerDTO) {
        ModelAndView mav = new ModelAndView("admin/listCustomer");
        mav.addObject("modelSearchcus", custormerDTO);
        mav.addObject("model", customerServiceNative.findSearch(custormerDTO));
        /*gọi bằng customerServiceDAO;
        mav.addObject("model", customerServiceDAO.findSearch(custormerDTO));*/

        return mav;
    }



    @RequestMapping(value = "/admin/editCustomer", method = RequestMethod.GET)
    public ModelAndView homePageEdit(@ModelAttribute("modelSearch") CustormerDTO custormerDTO, @RequestParam(defaultValue = "-1") Integer id) {
        ModelAndView mav = new ModelAndView("admin/editCustomer");

        if(id != -1)
        {
            mav.addObject("findoneCustomer",customerServiceDAO.findone(id));

        }
      /*  if(!(custormerDTO.getFullname()==null) && !(custormerDTO.getFullname().equals("")))
        {
            //customerServiceDAO.save(custormerDTO);
            customerServiceNative.save(custormerDTO);
            mav.addObject("alert_info", "ok");
        }*/

        return mav;
    }






}
