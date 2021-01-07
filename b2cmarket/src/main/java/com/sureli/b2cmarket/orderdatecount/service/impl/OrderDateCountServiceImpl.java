/**
 * @Company:Sure_li  
 * @Title:OrderDateCountServiceImpl.java 
 * @Author:lishuo  
 * @Date:2021-1-7 20:39:57     
 */ 
package com.sureli.b2cmarket.orderdatecount.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.orderdatecount.dao.OrderDateCountDao;
import com.sureli.b2cmarket.orderdatecount.pojo.OrderDateCount;
import com.sureli.b2cmarket.orderdatecount.service.OrderDateCountService;

/** 
 * @ClassName:OrderDateCountServiceImpl 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Service
public class OrderDateCountServiceImpl implements OrderDateCountService {
	@Autowired
	private OrderDateCountDao orderDateCountDao;
	/** 
	 * @Title: findAll 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */  
	@Override
	public List<OrderDateCount> findAll() {
		return orderDateCountDao.findAll();
	}

}