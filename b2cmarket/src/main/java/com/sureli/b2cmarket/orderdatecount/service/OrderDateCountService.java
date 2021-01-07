/**
 * @Company:Sure_li  
 * @Title:OrderDateCountService.java 
 * @Author:lishuo  
 * @Date:2021-1-7 20:38:55     
 */ 
package com.sureli.b2cmarket.orderdatecount.service;

import java.util.List;

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

}