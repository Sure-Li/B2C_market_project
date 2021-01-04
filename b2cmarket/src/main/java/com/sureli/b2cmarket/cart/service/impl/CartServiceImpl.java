/**
 * @Company:Sure_li  
 * @Title:CartServiceImpl.java 
 * @Author:lishuo  
 * @Date:2021-1-4 9:35:39     
 */ 
package com.sureli.b2cmarket.cart.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.cart.dao.CartDao;
import com.sureli.b2cmarket.cart.pojo.Cart;
import com.sureli.b2cmarket.cart.service.CartService;
import com.sureli.b2cmarket.user.pojo.User;

/** 
 * @ClassName:CartServiceImpl 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartDao cartDao;
	/** 
	 * @Title: finAll 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */  
	@Override
	public List<Cart> finAll() {
		return cartDao.findAll();
	}
	/** 
	 * @Title: save 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param cart
	 * @return  
	 */  
	@Override
	public Integer save(Cart cart) {
		return cartDao.save(cart);
	}
	/** 
	 * @Title: update 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param cart
	 * @param user
	 * @return  
	 */  
	@Override
	public Integer update(Cart cart, User user) {
		Cart cartGet = cartDao.findByUserIdAndCommodityId(cart.getUserId(),cart.getCommodityId());
		cartGet.setCommodityCount(cart.getCommodityCount());
		cartGet.setCommodityPriceSum(cart.getCommodityPriceSum());
		cartGet.setUpdateBy(user.getUserName());
		cartGet.setUpdateDate(new Date());
		return cartDao.update(cartGet);
	}

}
