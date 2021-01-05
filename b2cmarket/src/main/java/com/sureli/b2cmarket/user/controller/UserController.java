/**
 * @Company:Sure_li  
 * @Title:UserController.java 
 * @Author:lishuo  
 * @Date:2020-12-23 20:42:33     
 */
package com.sureli.b2cmarket.user.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.address.pojo.Address;
import com.sureli.b2cmarket.cart.pojo.Cart;
import com.sureli.b2cmarket.cart.service.CartService;
import com.sureli.b2cmarket.commodity.pojo.Commodity;
import com.sureli.b2cmarket.commodity.service.CommodityService;
import com.sureli.b2cmarket.user.pojo.User;
import com.sureli.b2cmarket.user.pojo.UserUtil;
import com.sureli.b2cmarket.user.service.UserService;
import com.sureli.b2cmarket.util.ConfigUtil;
import com.sureli.b2cmarket.util.ServletUtil;

/**
 * @ClassName:UserController
 * @Description:(用户的controller层 用于页面跳转)
 */
@RestController
@RequestMapping("user/")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private CartService cartService;
	@Autowired
	private CommodityService commodityService;

	/**
	 * 
	 * @Title: doRegister
	 * @Description:(执行注册功能的方法)
	 * @param user
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@PostMapping("doRegister")
	public ModelAndView doRegister(User user,Address address,ModelAndView modelAndView) {
		System.out.println("userget:"+user);
		System.out.println("address:"+address);
		user.setUserType(UserUtil.USER_TYPE_BUYER);
		userService.doRegister(user,address);
		modelAndView.setViewName("market/login");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: doLogin
	 * @Description:(执行登录功能的方法)
	 * @param userCode
	 * @param UserPassword
	 * @return
	 */

	@GetMapping("doLogin")
	public String doLogin(String userCode, String userPassword, HttpServletRequest request) {
		String result = "";
		User userGet = userService.findUserByCodeAndPassword(userCode, userPassword);
		HttpSession session = null;
		//登录成功
		if (userGet != null && userGet.getIsLock() != UserUtil.USER_IS_LOCK_YES) {
			session = request.getSession();
			session.setAttribute(ConfigUtil.SESSION_LOGIN_USER_NAME, userGet);
			List<Cart> cartList =  cartService.finAll(userGet.getUserCode());
			Map<Cart, Commodity> cartCommodityMap = new HashMap<Cart, Commodity>();
			double cartPriceSum = 0;
			for (Cart cart : cartList) {
				Commodity getCommodity = commodityService.findOne(Long.parseLong(cart.getCommodityId()));
				cartCommodityMap.put(cart, getCommodity);
				cartPriceSum+=cart.getCommodityPriceSum();
			}
			session.setAttribute(ConfigUtil.SESSION_USER_CART_MAP, cartCommodityMap);
			session.setAttribute(ConfigUtil.SESSION_USER_CART_PRICE_SUM, cartPriceSum);
			
			result = ConfigUtil.FUNCTION_SUCCESS;
		}else {//登陆失败
			result = ConfigUtil.FUNCTION_FAIL;
		}
		return result;
	}
	@ResponseBody
	@GetMapping("showUserCart")
	public ModelAndView doShowUserCart(ModelAndView modelAndView,HttpServletRequest request) {
		HttpSession session = request.getSession();
		User userGet = ServletUtil.getUserBySession(session);
		//已经登录
		if (userGet != null && userGet.getIsLock() != UserUtil.USER_IS_LOCK_YES) {
			List<Cart> cartList =  cartService.finAll(userGet.getUserCode());
			Map<Cart, Commodity> cartCommodityMap = new HashMap<Cart, Commodity>();
			double cartPriceSum = 0;
			for (Cart cart : cartList) {
				Commodity getCommodity = commodityService.findOne(Long.parseLong(cart.getCommodityId()));
				cartCommodityMap.put(cart, getCommodity);
				cartPriceSum+=cart.getCommodityPriceSum();
			}
			session.setAttribute(ConfigUtil.SESSION_USER_CART_MAP, cartCommodityMap);
			session.setAttribute(ConfigUtil.SESSION_USER_CART_PRICE_SUM, cartPriceSum);
			modelAndView.setViewName("market/cart_show");
		}
		return modelAndView;
	}

	@GetMapping("exit")
	public String doExit(HttpServletRequest request) {
		HttpSession session = null;
		session = request.getSession();
		session.setAttribute(ConfigUtil.SESSION_LOGIN_USER_NAME, new User());
		return "success";
	}
}
