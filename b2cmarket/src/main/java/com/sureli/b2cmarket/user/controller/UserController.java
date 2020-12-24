/**
 * @Company:Sure_li  
 * @Title:UserController.java 
 * @Author:lishuo  
 * @Date:2020-12-23 20:42:33     
 */ 
package com.sureli.b2cmarket.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.sureli.b2cmarket.user.pojo.User;
import com.sureli.b2cmarket.user.service.UserService;

/** 
 * @ClassName:UserController 
 * @Description:(用户的controller层 用于页面跳转)  
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("user/doRegister")
	public String doRegister(User user) {
		System.out.println(user);
		userService.doRegister(user);
		return "/login";
	}
}
