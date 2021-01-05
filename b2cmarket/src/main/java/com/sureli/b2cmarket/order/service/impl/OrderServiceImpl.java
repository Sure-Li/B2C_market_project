/**
 * @Company:Sure_li  
 * @Title:OrderServiceImpl.java 
 * @Author:lishuo  
 * @Date:2020-12-26 8:28:35     
 */ 
package com.sureli.b2cmarket.order.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.order.dao.OrderDao;
import com.sureli.b2cmarket.order.pojo.Order;
import com.sureli.b2cmarket.order.service.OrderService;
import com.sureli.b2cmarket.user.pojo.User;
import com.sureli.b2cmarket.util.ConfigUtil;

/** 
 * @ClassName:OrderServiceImpl 
 * @Description:(订单服务层的实现类)  
 */
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired 
	private OrderDao orderDao;
	/** 
	 * @Title: findBySearch 
	 * @Description:(用于显示所有的订单信息)
	 * @param searchOrder
	 * @return  
	 */  
	@Override
	public List<Order> findBySearch(Order searchOrder) {
		return orderDao.findBySearch(searchOrder);
	}
	/** 
	 * @Title: findOne 
	 * @Description:(通过rowID来查找一条订单记录)
	 * @param rowId
	 * @return  
	 */  
	@Override
	public Order findOne(Long rowId) {
		return orderDao.findOne(rowId);
	}
	/** 
	 * @Title: delete 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */  
	@Override
	public Integer delete(Long rowId) {
		Order order = orderDao.findOne(rowId);
		order.setActiveFlag(ConfigUtil.ACTIVE_FLAG_NO);
		return orderDao.update(order);
	}
	/** 
	 * @Title: update 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param order
	 * @return  
	 */  
	@Override
	public int update(Order order) {
		Order orderGet = orderDao.findOne(order.getRowId());
		System.out.println("userGet"+orderGet);
		orderGet.setOrderState(order.getOrderState());
		orderGet.setOrderPayMethod(order.getOrderPayMethod());
		//Todo 此处还需要将更新人加入  由于还没有登录功能 所以暂时先预留 -------------------------------------------------
		orderGet.setAddressId(order.getAddressId());
		orderGet.setUpdateDate(new Date());
		return orderDao.update(orderGet);
	}
	/** 
	 * @Title: save 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param order
	 * @return  
	 */  
	@Override
	public Integer save(Order order) {
		order.setActiveFlag(ConfigUtil.ACTIVE_FLAG_YES);
		order.setCreateDate(new Date());
		return orderDao.save(order);
	}

	
}
