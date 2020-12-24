/**
 * @Company:Sure_li  
 * @Title:UserService.java 
 * @Author:lishuo  
 * @Date:2020-12-23 20:43:42     
 */
package com.sureli.b2cmarket.user.service;

import com.sureli.b2cmarket.user.pojo.User;

/**
 * @ClassName:UserService
 * @Description:(用户的服务层 主要逻辑出来在这里完成)
 */
public interface UserService {

	/** 
	 * @Title: doLogin 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param user
	 * @return  
	 */ 
	Integer doLogin(User user);

	/** 
	 * @Title: doRegister 
	 * @Description:(用于创建用户的方法)
	 * @param user
	 * @return  
	 */ 
	Integer doRegister(User user);

}
