/**
 * @Company:Sure_li  
 * @Title:OrderDateCountDao.java 
 * @Author:lishuo  
 * @Date:2021-1-7 20:40:34     
 */ 
package com.sureli.b2cmarket.orderdatecount.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sureli.b2cmarket.base.dao.BaseDao;
import com.sureli.b2cmarket.orderdatecount.pojo.OrderDateCount;

/** 
 * @ClassName:OrderDateCountDao 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Repository
public interface OrderDateCountDao extends BaseDao<OrderDateCount> {

	/** 
	 * @Title: findAll 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */ 
	List<OrderDateCount> findAll();

}