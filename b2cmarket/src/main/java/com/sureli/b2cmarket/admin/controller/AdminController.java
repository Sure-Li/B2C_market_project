/**
 * @Company:Sure_li  
 * @Title:AdminController.java 
 * @Author:lishuo  
 * @Date:2020-12-25 10:28:08     
 */
package com.sureli.b2cmarket.admin.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.orderdatecount.service.OrderDateCountService;

/**
 * @ClassName:AdminController
 * @Description:(后台管理页面跳转各个模块)
 */
@Controller
public class AdminController {
	@Autowired
	private OrderDateCountService orderDateCountService;
	

	@RequestMapping("userManage")
	public ModelAndView goUserManageIndex(ModelAndView modelAndView) {
		modelAndView.setViewName("admin/user/user_index");
		return modelAndView;
	}

	@RequestMapping("orderManage")
	public ModelAndView goOrderManageIndex(ModelAndView modelAndView) {
		modelAndView.setViewName("admin/order/order_index");
		return modelAndView;
	}
	
	@RequestMapping("commodityManage")
	public ModelAndView goCommodityManageIndex(ModelAndView modelAndView) {
		modelAndView.setViewName("admin/commodity/commodity_index");
		return modelAndView;
	}
	@RequestMapping("catalogueManage")
	public ModelAndView goCatalogueManageIndex(ModelAndView modelAndView) {
		modelAndView.setViewName("admin/catalogue/catalogue_index");
		return modelAndView;
	}
	
	@RequestMapping("orderdateCountManage")
	public ModelAndView goOrderDateCountManageIndex(ModelAndView modelAndView) {
		//年
		List<Integer> yearDataList = orderDateCountService.findAllYear();
		modelAndView.addObject("yearDataList", yearDataList);
		modelAndView.setViewName("admin/orderdatecount/orderdatecount_index");
		return modelAndView;
	}

}
