/**
 * @Company:Sure_li  
 * @Title:AddressController.java 
 * @Author:lishuo  
 * @Date:2021-1-3 16:21:05     
 */ 
package com.sureli.b2cmarket.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.address.service.AddressService;

/** 
 * @ClassName:AddressController 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Controller
@RequestMapping("Address")
public class AddressController {
	@Autowired
	private AddressService addressService;
	
	@RequestMapping("addAddress")
	public ModelAndView doAddAddress(ModelAndView modelAndView){
		
		return modelAndView;
	}
}
