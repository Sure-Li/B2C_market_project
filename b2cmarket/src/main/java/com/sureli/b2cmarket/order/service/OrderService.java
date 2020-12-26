/**
 * @Company:Sure_li  
 * @Title:OrderService.java 
 * @Author:lishuo  
 * @Date:2020-12-26 8:26:52     
 */ 
package com.sureli.b2cmarket.order.service;

import java.util.List;

import com.sureli.b2cmarket.order.pojo.Order;

/** 
 * @ClassName:OrderService 
 * @Description:(这里用一句话描述这个类的作用)  
 */
public interface OrderService {


	/** 
	 * @Title: findBySearch 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param searchOrder
	 * @return  
	 */ 
	List<Order> findBySearch(Order searchOrder);

	/** 
	 * @Title: findOne 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */ 
	Order findOne(Long rowId);

	/** 
	 * @Title: delete 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */ 
	Integer delete(Long rowId);

}
