/**
 * @Company:Sure_li  
 * @Title:CartController.java 
 * @Author:lishuo  
 * @Date:2021-1-4 9:33:54     
 */ 
package com.sureli.b2cmarket.cart.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sureli.b2cmarket.cart.pojo.Cart;
import com.sureli.b2cmarket.cart.service.CartService;
import com.sureli.b2cmarket.commodity.pojo.Commodity;
import com.sureli.b2cmarket.commodity.service.CommodityService;
import com.sureli.b2cmarket.util.ConfigUtil;
import com.sureli.b2cmarket.util.ServletUtil;

/** 
 * @ClassName:CartController 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	private CartService cartService;
	@Autowired
	private CommodityService commodityService;

	@PostMapping("/add")
	public Integer goAddCart(Long rowId,HttpSession session) {
		System.out.println(rowId);
		Commodity commodityGet = commodityService.findOne(rowId);
		Cart cartGet = cartService.findByUserIdAndCommodityIdfindByUserIdAndCommodityId(ServletUtil.getUserBySession(session).getUserCode(),rowId);
		if (cartGet!=null) {
			cartGet.setCommodityCount(cartGet.getCommodityCount()+1);
			cartGet.setCommodityPriceSum(cartGet.getCommodityCount()*commodityGet.getCommodityPrice());
			return cartService.updateCartAddOne(cartGet,ServletUtil.getUserBySession(session));
		}else {
			Cart cart = new Cart(ServletUtil.getUserCodeBySession(session), rowId.toString(), 1, commodityGet.getCommodityPrice());
			cart.setActiveFlag(ConfigUtil.ACTIVE_FLAG_YES);
			cart.setCreateBy(ServletUtil.getUserBySession(session).getUserName());
			cart.setCreateDate(new Date());
			System.out.println(cart);
			return cartService.save(cart);
		}
		
	}
//	cart/edit/${cartCommodity.value.rowId}/${userId}
	@PostMapping("/edit/{rowId}/{userId}/{commodityPrice}")
	public Integer update(@PathVariable String rowId,@PathVariable String userId,@PathVariable Double commodityPrice,Integer commodityeCount,HttpSession session) {
		
		Cart cart= new Cart(userId, rowId, commodityeCount, commodityPrice*commodityeCount);
		return cartService.update(cart,ServletUtil.getUserBySession(session));
	}
	@PostMapping("/delete/{rowId}/{userId}/{commodityPrice}")
	public Integer delete(@PathVariable String rowId,@PathVariable String userId,@PathVariable Double commodityPrice,HttpSession session) {
		System.out.println("@PathVariable Long rowId"+rowId);
		System.out.println("@PathVariable String userId"+userId);

		Cart cart= new Cart();
		cart.setUserId(userId);
		cart.setCommodityId(rowId);
		return cartService.delete(cart,ServletUtil.getUserBySession(session));
	}
	
}
