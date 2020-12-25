/**
 * @Company:Sure_li  
 * @Title:UserManageContoller.java 
 * @Author:lishuo  
 * @Date:2020-12-25 11:14:11     
 */ 
package com.sureli.b2cmarket.usermanage.controller;

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

import com.sureli.b2cmarket.user.pojo.User;
import com.sureli.b2cmarket.user.service.UserService;
import com.sureli.b2cmarket.util.ServletUtil;

/** 
 * @ClassName:UserManageContoller 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Controller
@RequestMapping("/user")
public class UserManageContoller {
	@Autowired
	private UserService userService;
	@GetMapping("/list")
	public ModelAndView getUserList(User searchUser, ModelAndView modelAndView) {
		List<User> userList = userService.findUserBySearch(searchUser);
		System.out.println(searchUser);
		modelAndView.addObject("userList", userList);
		modelAndView.setViewName("admin/user/user_list");
		return modelAndView;
	}
	@GetMapping("/form")
	public ModelAndView goAddForm(ModelAndView modelAndView) {
		modelAndView.setViewName("admin/user/user_add");
		return modelAndView;
	}
	@PostMapping
	public Integer doAddUser(User user, HttpSession session) {
		String createBy = ServletUtil.getUserCodeBySession(session);
		user.setCreateBy(createBy);
		return userService.doRegister(user);
	}
	
	@ResponseBody
	@GetMapping("/delete/{rowId}")
	public Integer doDelete(@PathVariable Long rowId) {
		System.out.println("@PathVariable Long rowId" +rowId);
		return userService.delete(rowId);
	}
}
