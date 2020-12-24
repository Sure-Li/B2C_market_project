/**
 * @Company:Sure_li  
 * @Title:UserServiceImpl.java 
 * @Author:lishuo  
 * @Date:2020-12-23 20:44:49     
 */ 
package com.sureli.b2cmarket.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.user.dao.UserDao;
import com.sureli.b2cmarket.user.pojo.User;
import com.sureli.b2cmarket.user.service.UserService;

/** 
 * @ClassName:UserServiceImpl 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	/** 
	 * @Title: doLogin 
	 * @Description:(用于用户注册的方法)
	 * @param user
	 * @return  
	 */  
	@Override
	public Integer doRegister(User user) {
		return userDao.save(user);
	}
	/** 
	 * @Title: doLogin 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param user
	 * @return  
	 */  
	@Override
	public Integer doLogin(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
