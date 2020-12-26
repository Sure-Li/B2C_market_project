/**
 * @Company:Sure_li  
 * @Title:CommodityController.java 
 * @Author:lishuo  
 * @Date:2020-12-26 11:35:38     
 */ 
package com.sureli.b2cmarket.commodity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.commodity.pojo.Commodity;
import com.sureli.b2cmarket.commodity.service.CommodityService;

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
//	@GetMapping("/form")
//	public ModelAndView goAddForm(ModelAndView modelAndView) {
//		modelAndView.setViewName("admin/user/user_add");
//		return modelAndView;
//	}
//	@PostMapping
//	public Integer doAddUser(User user, HttpSession session) {
//		String createBy = ServletUtil.getUserCodeBySession(session);
//		user.setCreateBy(createBy);
//		return userService.doRegister(user);
//	}
//	
//	@ResponseBody
//	@GetMapping("/delete/{rowId}")
//	public Integer doDelete(@PathVariable Long rowId) {
//		System.out.println("@PathVariable Long rowId" +rowId);
//		return orderService.delete(rowId);
//	}
//	@GetMapping("/edit/{rowId}")
//	public ModelAndView goUserEdit(@PathVariable Long rowId, ModelAndView modelAndView) {
//		System.out.println(rowId);
//		Order order = orderService.findOne(rowId);
//		System.out.println(order);
//		modelAndView.addObject("order", order);
//		modelAndView.setViewName("admin/order/order_edit");
//		return modelAndView;
//	}
//	@ResponseBody
//	@PostMapping("/doedit")
//	public Integer doUserEdit(User user) {
//		int result = userService.update(user);
//		return result;	
//	}
}
