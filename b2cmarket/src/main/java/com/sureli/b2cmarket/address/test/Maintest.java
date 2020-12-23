/**
 * @Company:Sure_li  
 * @Title:Maintest.java 
 * @Author:lishuo  
 * @Date:2020-12-23 21:53:57     
 */ 
package com.sureli.b2cmarket.address.test;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.sureli.b2cmarket.user.dao.UserDao;
import com.sureli.b2cmarket.user.pojo.User;

/** 
 * @ClassName:Maintest 
 * @Description:(这里用一句话描述这个类的作用)  
 */
public class Maintest {
	@Autowired
	static UserDao userDao;
	/** 
	 * @Title: main 
	 * @Description:(用于测试方法)
	 * @param args  
	 */
	public static void main(String[] args) {
		User user = new User(1, "1001", "1001", "1001", "1001", 1, "test", new Date());
		System.out.println(userDao.findOne(0L));
	}

}
