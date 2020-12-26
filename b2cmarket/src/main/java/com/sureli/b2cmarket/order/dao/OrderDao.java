/**
 * @Company:Sure_li  
 * @Title:OrderDao.java 
 * @Author:lishuo  
 * @Date:2020-12-26 8:31:40     
 */
package com.sureli.b2cmarket.order.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sureli.b2cmarket.base.dao.BaseDao;
import com.sureli.b2cmarket.order.pojo.Order;

/**
 * @ClassName:OrderDao
 * @Description:(order的dao层)
 */
@Repository
public interface OrderDao extends BaseDao<Order> {

	/** 
	 * @Title: findBySearch 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param searchOrder
	 * @return  
	 */ 
	List<Order> findBySearch(Order searchOrder);

}
