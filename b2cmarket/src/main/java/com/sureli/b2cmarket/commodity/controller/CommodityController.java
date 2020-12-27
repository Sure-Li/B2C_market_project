/**
 * @Company:Sure_li  
 * @Title:CommodityController.java 
 * @Author:lishuo  
 * @Date:2020-12-26 11:35:38     
 */ 
package com.sureli.b2cmarket.commodity.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.commodity.pojo.Commodity;
import com.sureli.b2cmarket.commodity.service.CommodityService;
import com.sureli.b2cmarket.util.ServletUtil;

/** 
 * @ClassName:CommodityController 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Controller
@RequestMapping("commodity")
public class CommodityController {
	@Autowired
	private CommodityService commodityService;
	@GetMapping("/list")
	public ModelAndView getUserList(Commodity searchCommodity, ModelAndView modelAndView) {
		List<Commodity> commodityList = commodityService.findBySearch(searchCommodity);
		System.out.println(searchCommodity);
		System.out.println("commodityList"+commodityList);
		modelAndView.addObject("commodityList", commodityList);
		modelAndView.setViewName("admin/commodity/commodity_list");
		return modelAndView;
	}
	@GetMapping("/form")
	public ModelAndView goAddForm(ModelAndView modelAndView) {
		modelAndView.setViewName("admin/commodity/commodity_add");
		return modelAndView;
	}
	@ResponseBody
	@PostMapping
	public Integer doAddUser(Commodity commodity, HttpSession session) {
		String createBy = ServletUtil.getUserCodeBySession(session);
		commodity.setCreateBy(createBy);
		return commodityService.doRegister(commodity);
	}
	
	@ResponseBody
	@GetMapping("/delete/{rowId}")
	public Integer doDelete(@PathVariable Long rowId) {
		System.out.println("@PathVariable Long rowId" +rowId);
		return commodityService.delete(rowId);
	}
	@GetMapping("/edit/{rowId}")
	public ModelAndView goUserEdit(@PathVariable Long rowId, ModelAndView modelAndView) {
		System.out.println(rowId);
		Commodity commodity = commodityService.findOne(rowId);
		System.out.println(commodity);
		modelAndView.addObject("commodity", commodity);
		modelAndView.setViewName("admin/commodity/commodity_add");
		return modelAndView;
	}
	@ResponseBody
	@PostMapping("/doedit")
	public Integer doUserEdit(Commodity commodity) {
		System.out.println("commodity"+commodity);
		int result = commodityService.update(commodity);
		return result;	
	}
}
