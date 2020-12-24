/**
 * @Company:Sure_li  
 * @Title:UserServiceImpl.java 
 * @Author:lishuo  
 * @Date:2020-12-23 20:44:49     
 */
package com.sureli.b2cmarket.user.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.user.dao.UserDao;
import com.sureli.b2cmarket.user.pojo.User;
import com.sureli.b2cmarket.user.pojo.UserUtil;
import com.sureli.b2cmarket.user.service.UserService;
import com.sureli.b2cmarket.util.ConfigUtil;

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
		user.setUserType(UserUtil.USER_TYPE_BUYER);
		user.setIsLock(UserUtil.USER_IS_LOCK_NO);
		user.setActiveFlag(ConfigUtil.ACTIVE_FLAG_YES);
		user.setCreateBy("Sure_li");
		user.setCreateDate(new Date());
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

	/**
	 * @Title: findUserByCodeAndPassword
	 * @Description:(通过账号和密码进行登录动作)
	 * @param userCode
	 * @param userPassword
	 * @return
	 */
	@Override
	public User findUserByCodeAndPassword(String userCode, String userPassword) {
		return userDao.findUserByCodeAndPassword(userCode,userPassword);
	}

}
