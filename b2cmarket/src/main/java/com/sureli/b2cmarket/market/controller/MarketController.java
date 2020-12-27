/**
 * @Company:Sure_li  
 * @Title:MarketController.java 
 * @Author:lishuo  
 * @Date:2020-12-23 11:10:49     
 */
package com.sureli.b2cmarket.market.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.user.service.UserService;
import com.sureli.b2cmarket.util.ConfigUtil;

/**
 * @ClassName:MarketController
 * @Description:(这里用一句话描述这个类的作用)
 */
@Controller
public class MarketController {
	@Autowired
	private UserService userService;

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

	/**
	 * 
	 * @Title: goWishlist
	 * @Description:(跳转管理员页面)
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("admin")
	public ModelAndView goAdminIndex(ModelAndView modelAndView, HttpServletRequest request,
			HttpServletResponse response,
			@CookieValue(name = ConfigUtil.COOKIE_NAME, required = false) String cookieValue) {
		System.out.println("cookieValue" + cookieValue);
//		从浏览器得到cookie 数据 并处理
		if (cookieValue != null && !"".equals(cookieValue)) {
			System.out.println("自动登录");
//			indexService.autoLogin(cookieValue, request);
		} else {
		}
		if (request.getSession().getAttribute(ConfigUtil.SESSION_LOGIN_USER_NAME) == null) {
			modelAndView.setViewName("admin/login");// 处于非登陆状态
		} else {
			modelAndView.setViewName("admin/index");// 登录状态页面
			System.out.println("modelAndView.setViewName(\"index\");// 登录状态页面");
		}
//		modelAndView.setViewName("admin/index");// 登录状态页面
		return modelAndView;
	}

	/**
	 * 
	 * @Title: doLogin
	 * @Description:(管理员登录 并判断是否自动登录)
	 * @param userCode
	 * @param userPassword
	 * @param isRemenber
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/admindologin")
	public Integer doLogin(String userCode, String userPassword, String isRemenber, HttpServletRequest request,
			HttpServletResponse response) {
		return userService.doLogin(userCode, userPassword, isRemenber, request, response);
	}
	@ResponseBody 
	@RequestMapping("/admindologinout")
	public Integer doLoginOut(@CookieValue(name = ConfigUtil.COOKIE_NAME, required = false) String cookieValue,
			HttpSession session, HttpServletResponse response) {
		System.out.println("cookieValue" + cookieValue);
		session.setAttribute(ConfigUtil.LOGINOUT_ISREMENBER, cookieValue != null ? 1 : 0);
		session.removeAttribute(ConfigUtil.SESSION_LOGIN_USER_NAME);

		// 退出自动登录
		Cookie cookie = new Cookie(ConfigUtil.COOKIE_NAME,null);
		cookie.setMaxAge(0);
		cookie.setPath("/");
		response.addCookie(cookie);
		return 1;
	}
}
