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

import com.sureli.b2cmarket.codecountparam.CodeCountParam;
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
	/** 
	 * @Title: findAllYear 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */  
	@Override
	public List<Integer> findAllYear() {
		// TODO Auto-generated method stub
		return orderDateCountDao.findAllYear();
	}
	/** 
	 * @Title: findMonthDateByYear 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param year
	 * @return  
	 */  
	@Override
	public List<Integer> findMonthDateByYear(Integer year) {
		return orderDateCountDao.findMonthDateByYear(year);
	}
	/** 
	 * @Title: findAllByYear 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param year
	 * @return  
	 */  
	@Override
	public List<CodeCountParam> findAllByYear(Integer year) {
		return orderDateCountDao.findAllByYear(year);
	}
	/** 
	 * @Title: findAllByYearAndMonth 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param year
	 * @param month
	 * @return  
	 */  
	@Override
	public List<CodeCountParam> findAllByYearAndMonth(Integer year, Integer month) {
		return orderDateCountDao.findAllByYearAndMonth(year,month);
	}
	/** 
	 * @Title: save 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param orderDateCount
	 * @return  
	 */  
	@Override
	public Integer save(OrderDateCount orderDateCount) {
		return orderDateCountDao.save(orderDateCount);
	}
	/** 
	 * @Title: findOneByDate 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param orderDateCount
	 * @return  
	 */  
	@Override
	public OrderDateCount findOneByDate(OrderDateCount orderDateCount) {
		return orderDateCountDao.findOneByDate(orderDateCount);
	}
	/** 
	 * @Title: update 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param orderDateCountGet
	 * @return  
	 */  
	@Override
	public Integer update(OrderDateCount orderDateCountGet) {
		return orderDateCountDao.update(orderDateCountGet);
	}

}
