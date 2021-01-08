/**
 * @Company:Sure_li  
 * @Title:OrderDateCountService.java 
 * @Author:lishuo  
 * @Date:2021-1-7 20:38:55     
 */ 
package com.sureli.b2cmarket.orderdatecount.service;

import java.util.List;

import com.sureli.b2cmarket.codecountparam.CodeCountParam;
import com.sureli.b2cmarket.orderdatecount.pojo.OrderDateCount;

/** 
 * @ClassName:OrderDateCountService 
 * @Description:(这里用一句话描述这个类的作用)  
 */
public interface OrderDateCountService {

	/** 
	 * @Title: findAll 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */ 
	List<OrderDateCount> findAll();

	/** 
	 * @Title: findAllYear 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */ 
	List<Integer> findAllYear();

	/** 
	 * @Title: findMonthDateByYear 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param year
	 * @return  
	 */ 
	List<Integer> findMonthDateByYear(Integer year);

	/** 
	 * @Title: findAllByYear 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param year
	 * @return  
	 */ 
	List<CodeCountParam> findAllByYear(Integer year);

	/** 
	 * @Title: findAllByYearAndMonth 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param year
	 * @param month
	 * @return  
	 */ 
	List<CodeCountParam> findAllByYearAndMonth(Integer year, Integer month);

	/** 
	 * @Title: save 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param orderDateCount  
	 */ 
	Integer save(OrderDateCount orderDateCount);

	/** 
	 * @Title: findOneByDate 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param orderDateCount
	 * @return  
	 */ 
	OrderDateCount findOneByDate(OrderDateCount orderDateCount);

	/** 
	 * @Title: update 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param orderDateCountGet  
	 */ 
	Integer update(OrderDateCount orderDateCountGet);

}
