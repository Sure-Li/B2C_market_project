/**
 * @Company:Sure_li  
 * @Title:AddressController.java 
 * @Author:lishuo  
 * @Date:2021-1-3 16:21:05     
 */
package com.sureli.b2cmarket.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.address.pojo.Address;
import com.sureli.b2cmarket.address.service.AddressService;
import com.sureli.b2cmarket.area.pojo.Area;
import com.sureli.b2cmarket.area.service.AreaService;

/**
 * @ClassName:AddressController
 * @Description:(这里用一句话描述这个类的作用)
 */
@Controller
@RequestMapping("address")
public class AddressController {
	@Autowired
	private AddressService addressService;
	@Autowired
	private AreaService areaService;

	@ResponseBody
	@GetMapping("/goAddAddress/{rowId}")
	public ModelAndView doAddAddress(@PathVariable Long rowId, ModelAndView modelAndView) {
		List<Area> provinceList = areaService.findByParentCode(-1L);
		modelAndView.addObject("provinceList", provinceList);
		modelAndView.addObject("getUserId", rowId);
		System.out.println("test");
		modelAndView.setViewName("market/address/address_add");
		return modelAndView;
	}
	
	@ResponseBody
	@PostMapping
	public Integer doAddAddress(Address address) {
//		System.out.println("------address"+address);
		return addressService.save(address);
	}
	
	@ResponseBody
	@GetMapping("/delete/{rowId}")
	public Integer doDelete(@PathVariable Long rowId) {
		return addressService.delete(rowId);
	}
	
	@ResponseBody
	@GetMapping("/edit/{rowId}")
	public ModelAndView goEdit(@PathVariable Long rowId,ModelAndView modelAndView) {
//		System.out.println(rowId);
		List<Area> provinceList = areaService.findByParentCode(-1L);
		modelAndView.addObject("provinceList", provinceList);
		Address address =  addressService.findOne(rowId);
		modelAndView.addObject("getAddress", address);
		modelAndView.setViewName("market/address/address_edit");
		return modelAndView;
	}
	@ResponseBody
	@GetMapping("/doedit")
	public Integer doEdit(Address address) {
		
		return addressService.doEdit(address);	
	}
}
