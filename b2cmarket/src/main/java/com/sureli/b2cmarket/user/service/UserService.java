/**
 * @Company:Sure_li  
 * @Title:UserService.java 
 * @Author:lishuo  
 * @Date:2020-12-23 20:43:42     
 */
package com.sureli.b2cmarket.user.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sureli.b2cmarket.user.pojo.User;

/**
 * @ClassName:UserService
 * @Description:(用户的服务层 主要逻辑出来在这里完成)
 */
public interface UserService {

	/**
	 * @Title: doRegister
	 * @Description:(用于创建用户的方法)
	 * @param user
	 * @return
	 */
	Integer doRegister(User user);

	/**
	 * @Title: findUserByCodeAndPassword
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param userCode
	 * @param userPassword
	 * @return
	 */
	User findUserByCodeAndPassword(String userCode, String userPassword);

	/**
	 * @Title: doLogin
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param userCode
	 * @param userPassword
	 * @param isRemenber
	 * @param request
	 * @param response
	 * @return
	 */
	Integer doLogin(String userCode, String userPassword, String isRemenber, HttpServletRequest request,
			HttpServletResponse response);

	/** 
	 * @Title: findUserBySearch 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param searchUser
	 * @return  
	 */ 
	List<User> findUserBySearch(User searchUser);

	/** 
	 * @Title: delete 
	 * @Description:(删除用户账号)
	 * @param rowId
	 * @return  
	 */ 
	Integer delete(Long rowId);


}
