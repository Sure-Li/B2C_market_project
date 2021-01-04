/**
 * @Company:Sure_li  
 * @Title:CartService.java 
 * @Author:lishuo  
 * @Date:2021-1-4 9:34:55     
 */ 
package com.sureli.b2cmarket.cart.service;

import java.util.List;

import com.sureli.b2cmarket.cart.pojo.Cart;
import com.sureli.b2cmarket.user.pojo.User;

/** 
 * @ClassName:CartService 
 * @Description:(这里用一句话描述这个类的作用)  
 */
public interface CartService {

	/** 
	 * @Title: finAll 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */ 
	List<Cart> finAll();

	/** 
	 * @Title: save 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param cart
	 * @return  
	 */ 
	Integer save(Cart cart);

	/** 
	 * @Title: update 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param cart
	 * @param user 
	 * @return  
	 */ 
	Integer update(Cart cart, User user);

}
