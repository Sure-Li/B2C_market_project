/**
 * @Company:Sure_li  
 * @Title:UserController.java 
 * @Author:lishuo  
 * @Date:2020-12-23 20:42:33     
 */
package com.sureli.b2cmarket.user.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sureli.b2cmarket.user.pojo.User;
import com.sureli.b2cmarket.user.pojo.UserUtil;
import com.sureli.b2cmarket.user.service.UserService;
import com.sureli.b2cmarket.util.ConfigUtil;

/**
 * @ClassName:UserController
 * @Description:(用户的controller层 用于页面跳转)
 */
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	/**
	 * 
	 * @Title: doRegister
	 * @Description:(执行注册功能的方法)
	 * @param user
	 * @param request
	 * @param response
	 * @return
	 */
	@PostMapping("user/doRegister")
	public String doRegister(User user) {
		System.out.println("userget"+user);
		userService.doRegister(user);
		return ConfigUtil.FUNCTION_SUCCESS;
	}

	/**
	 * 
	 * @Title: doLogin
	 * @Description:(执行登录功能的方法)
	 * @param userCode
	 * @param UserPassword
	 * @return
	 */

	@GetMapping("user/doLogin")
	public String doLogin(String userCode, String userPassword, HttpServletRequest request) {
		String result = "";
		User userGet = userService.findUserByCodeAndPassword(userCode, userPassword);
		HttpSession session = null;
		if (userGet != null && userGet.getIsLock() != UserUtil.USER_IS_LOCK_YES) {
			session = request.getSession();
			session.setAttribute(ConfigUtil.SESSION_LOGIN_USER_NAME, userGet);
			result = ConfigUtil.FUNCTION_SUCCESS;
		}else {
			result = ConfigUtil.FUNCTION_FAIL;
		}
		return result;
	}

	@GetMapping("user/exit")
	public String doExit(HttpServletRequest request) {
		HttpSession session = null;
		session = request.getSession();
		session.setAttribute(ConfigUtil.SESSION_LOGIN_USER_NAME, new User());
		return "success";
	}
}
