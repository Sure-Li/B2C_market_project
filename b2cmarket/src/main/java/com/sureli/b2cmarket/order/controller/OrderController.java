/**
 * @Company:Sure_li  
 * @Title:OrderController.java 
 * @Author:lishuo  
 * @Date:2020-12-26 8:22:08     
 */ 
package com.sureli.b2cmarket.order.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.order.pojo.Order;
import com.sureli.b2cmarket.order.service.OrderService;

/** 
 * @ClassName:OrderController 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@RestController
@RequestMapping("order/")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@GetMapping("/list")
	public ModelAndView getUserList(Order searchOrder, ModelAndView modelAndView) {
		List<Order> orderList = orderService.findBySearch(searchOrder);
		System.out.println(searchOrder);
		System.out.println(orderList);
		modelAndView.addObject("orderList", orderList);
		modelAndView.setViewName("admin/order/order_list");
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
	@ResponseBody
	@GetMapping("/delete/{rowId}")
	public Integer doDelete(@PathVariable Long rowId) {
		System.out.println("@PathVariable Long rowId" +rowId);
		return orderService.delete(rowId);
	}
	@GetMapping("/edit/{rowId}")
	public ModelAndView goUserEdit(@PathVariable Long rowId, ModelAndView modelAndView) {
		System.out.println(rowId);
		Order order = orderService.findOne(rowId);
		System.out.println(order);
		modelAndView.addObject("order", order);
		modelAndView.setViewName("admin/order/order_edit");
		return modelAndView;
	}
//	@ResponseBody
//	@PostMapping("/doedit")
//	public Integer doUserEdit(User user) {
//		int result = userService.update(user);
//		return result;	
//	}
}
