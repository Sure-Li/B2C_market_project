/**
 * @Company:Sure_li  
 * @Title:AdminController.java 
 * @Author:lishuo  
 * @Date:2020-12-25 10:28:08     
 */
package com.sureli.b2cmarket.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName:AdminController
 * @Description:(后台管理页面跳转各个模块)
 */
@Controller
public class AdminController {

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

}
