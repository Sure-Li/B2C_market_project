/**
 * @Company:Sure_li  
 * @Title:OrderController.java 
 * @Author:lishuo  
 * @Date:2020-12-26 8:22:08     
 */ 
package com.sureli.b2cmarket.order.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.codecount.pojo.CodeCount;
import com.sureli.b2cmarket.codecount.service.CodeCountService;
import com.sureli.b2cmarket.order.pojo.Order;
import com.sureli.b2cmarket.order.service.OrderService;
import com.sureli.b2cmarket.orderdatecount.pojo.OrderDateCount;
import com.sureli.b2cmarket.orderdatecount.service.OrderDateCountService;
import com.sureli.b2cmarket.util.ConfigUtil;
import com.sureli.b2cmarket.util.ServletUtil;

/** 
 * @ClassName:OrderController 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@RestController
@RequestMapping("order/")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private CodeCountService codeCountService;
	@Autowired
	private OrderDateCountService OrderDateCountService;
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
	@ResponseBody
	@PostMapping("/doedit")
	public Integer doUserEdit(Order order) {
		int result = orderService.update(order);
		return result;	
	}
	@ResponseBody
	@PostMapping("/add")
	public Integer doAdd(double priceSum,Integer addressId,Integer orderPayMethod,ModelAndView modelAndView,HttpSession session){
		System.out.println("priceSum"+priceSum+"addressId"+addressId+"orderPayMethod"+orderPayMethod);
		int orderCodeCount = codeCountService.getCodeCount(1L);
		Order order = new Order(new SimpleDateFormat("yyyyMMdd").format(new Date())+ConfigUtil.numHandle(orderCodeCount), ServletUtil.getUserCodeBySession(session), priceSum, addressId.toString(), 1, orderPayMethod);
		//当天订单第一单 所以要创建codeDateCount 记录
		if(orderCodeCount==0) {
			OrderDateCount orderDateCount = new OrderDateCount(Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())), Integer.parseInt(new SimpleDateFormat("MM").format(new Date())), Integer.parseInt(new SimpleDateFormat("dd").format(new Date())),1 );
			orderDateCount.setActiveFlag(ConfigUtil.ACTIVE_FLAG_YES);
			orderDateCount.setCreateBy(ServletUtil.getUserBySession(session).getUserName());
			orderDateCount.setCreateDate(new Date());
			OrderDateCountService.save(orderDateCount);
		}else {
			OrderDateCount orderDateCount = new OrderDateCount(Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())), Integer.parseInt(new SimpleDateFormat("MM").format(new Date())), Integer.parseInt(new SimpleDateFormat("dd").format(new Date())),1 );
			OrderDateCount orderDateCountGet = OrderDateCountService.findOneByDate(orderDateCount);
			orderDateCountGet.setOrderCount(orderDateCountGet.getOrderCount()+1);
			orderDateCountGet.setUpdateBy(ServletUtil.getUserBySession(session).getUserName());
			orderDateCountGet.setUpdateDate(new Date());
			OrderDateCountService.update(orderDateCountGet);
		}
		CodeCount codeCount = new CodeCount();
		codeCount.setRowId(1L);
		codeCountService.update(codeCount);
		order.setCreateBy(ServletUtil.getUserBySession(session).getUserName());
		return orderService.save(order);
	}
	@PostMapping("/pay/{rowId}")
	public Integer doPay(@PathVariable Long rowId){
		System.out.println(rowId);
		Order order = orderService.findOne(rowId);
		if (order.getOrderState()==1) {
			order.setOrderState(2);
		}		
		return orderService.update(order);
	}
	@PostMapping("/cancel/{rowId}")
	public Integer doCancel(@PathVariable Long rowId){
		System.out.println(rowId+"cancel");
		return orderService.delete(rowId);	
	}
	@PostMapping("/delivergoods/{rowId}")
	public Integer doDeliverGoods(@PathVariable Long rowId){
		System.out.println(rowId);
		Order order = orderService.findOne(rowId);
		if (order.getOrderState()==2) {
			order.setOrderState(3);
		}		
		return orderService.update(order);
	}
	@PostMapping("/evaluate/{rowId}")
	public Integer doEvaluate(@PathVariable Long rowId){
		System.out.println(rowId);
		Order order = orderService.findOne(rowId);
		if (order.getOrderState()==4) {
			order.setOrderState(5);
		}		
		return orderService.update(order);
	}
	@PostMapping("/getgoods/{rowId}")
	public Integer doGetGoods(@PathVariable Long rowId){
		System.out.println(rowId);
		Order order = orderService.findOne(rowId);
		if (order.getOrderState()==3) {
			order.setOrderState(4);
		}		
		return orderService.update(order);
	}
	
}
