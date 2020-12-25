/**
 * @Company:Sure_li  
 * @Title:UserServiceImpl.java 
 * @Author:lishuo  
 * @Date:2020-12-23 20:44:49     
 */
package com.sureli.b2cmarket.user.service.impl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		user.setIsLock(UserUtil.USER_IS_LOCK_NO);
		user.setActiveFlag(ConfigUtil.ACTIVE_FLAG_YES);
		user.setCreateBy("Sure_li");
		user.setCreateDate(new Date());
		return userDao.save(user);
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
		return userDao.findUserByCodeAndPassword(userCode, userPassword);
	}

	/**
	 * @Title: doLogin
	 * @Description:(用来执行用户登录，并完成自动登陆功能)
	 * @param userCode
	 * @param userPassword
	 * @param isRemenber
	 * @param request
	 * @param response
	 * @return
	 */
	@Override
	public Integer doLogin(String userCode, String userPassword, String isRemenber, HttpServletRequest request,
			HttpServletResponse response) {
		int result = 0;
		// 对用户密码进行md5加密 然后再去数据库里查询
//		String userEncodePassword = MD5Util.encode(userPassword);
		User user = userDao.findUserByCodeAndPassword(userCode, userPassword);
//		&&user.getUserType()!=UserUtil.USER_TYPE_BUYER 
		if (user != null) {
			if (user.getIsLock() == UserUtil.USER_IS_LOCK_NO) {
				user.setLastLoginDate(new Date());
				user.setLastLoginIp(request.getRemoteAddr());
				userDao.update(user);
				// 向session中放实例
				HttpSession session = request.getSession();
				session.setAttribute(ConfigUtil.SESSION_LOGIN_USER_NAME, user);
//				处理自动登录
				if (isRemenber != null && isRemenber.equals("on")) {
					StringBuilder cookieVaule = new StringBuilder();
					cookieVaule.append(user.getUserCode()).append(ConfigUtil.COOKIE_VALUE_SPLIT)
							.append(user.getRowId());
					Cookie cookie = new Cookie(ConfigUtil.COOKIE_NAME, cookieVaule.toString());
					cookie.setMaxAge(60 * 60 * 24 * 7);
					cookie.setPath("/");
					response.addCookie(cookie);
				} else {
					Cookie cookie = new Cookie(ConfigUtil.COOKIE_NAME, "");
					cookie.setMaxAge(0);
					cookie.setPath("/");
					response.addCookie(cookie);
				}
				result = 1;
			} else {
				result = 3;
			}
		} else {
			result = 2;
		}
		return result;
	}

	/**
	 * @Title: findUserBySearch
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param searchUser
	 * @return
	 */
	@Override
	public List<User> findUserBySearch(User searchUser) {
		return userDao.findUserBySearch(searchUser);
	}

	/**
	 * @Title: delete
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return
	 */
	@Override
	public Integer delete(Long rowId) {
		User user = userDao.findOne(rowId);
		user.setActiveFlag(ConfigUtil.ACTIVE_FLAG_NO);
		return userDao.update(user);
	}

}
