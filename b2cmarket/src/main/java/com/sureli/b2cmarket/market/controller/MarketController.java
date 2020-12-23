/**
 * @Company:Sure_li  
 * @Title:MarketController.java 
 * @Author:lishuo  
 * @Date:2020-12-23 11:10:49     
 */
package com.sureli.b2cmarket.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName:MarketController
 * @Description:(这里用一句话描述这个类的作用)
 */
@Controller
public class MarketController {
	/**
	 * 
	 * @Title: goIndex
	 * @Description:(跳转首页)
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping({ "/", "index" })
	public ModelAndView goIndex(ModelAndView modelAndView) {
		modelAndView.setViewName("market/index");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: goLogin
	 * @Description:(跳转登录页面)
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("login")
	public ModelAndView goLogin(ModelAndView modelAndView) {
		modelAndView.setViewName("market/login");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: goRegister
	 * @Description:(跳转注册页面)
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("register")
	public ModelAndView goRegister(ModelAndView modelAndView) {
		modelAndView.setViewName("market/register");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: goCart
	 * @Description:(跳转购物车页面)
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("cart")
	public ModelAndView goCart(ModelAndView modelAndView) {
		modelAndView.setViewName("market/cart");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: goCategory
	 * @Description:(跳转商品目录页面)
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("category")
	public ModelAndView goCategory(ModelAndView modelAndView) {
		modelAndView.setViewName("market/category");
		return modelAndView;
	}
	/**
	 * 
	 * @Title: goCheckout 
	 * @Description:(跳转结账页面)
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("checkout")
	public ModelAndView goCheckout(ModelAndView modelAndView) {
		modelAndView.setViewName("market/checkout");
		return modelAndView;
	}
	
	/**
	 * 
	 * @Title: goCheckout 
	 * @Description:(跳转商品详情页面)
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("product")
	public ModelAndView goProduct(ModelAndView modelAndView) {
		modelAndView.setViewName("market/product");
		return modelAndView;
	}
	/**
	 * 
	 * @Title: goWishlist 
	 * @Description:(跳转收藏页面)
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("wishlist")
	public ModelAndView goWishlist(ModelAndView modelAndView) {
		modelAndView.setViewName("market/wishlist");
		return modelAndView;
	}
}
