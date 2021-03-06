/**
 * @Company:Sure_li  
 * @Title:MarketController.java 
 * @Author:lishuo  
 * @Date:2020-12-23 11:10:49     
 */
package com.sureli.b2cmarket.market.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.address.pojo.Address;
import com.sureli.b2cmarket.address.service.AddressService;
import com.sureli.b2cmarket.address.wishlist.pojo.WishList;
import com.sureli.b2cmarket.address.wishlist.service.WishListService;
import com.sureli.b2cmarket.area.pojo.Area;
import com.sureli.b2cmarket.area.service.AreaService;
import com.sureli.b2cmarket.cart.pojo.Cart;
import com.sureli.b2cmarket.cart.service.CartService;
import com.sureli.b2cmarket.catalogue.pojo.Catalogue;
import com.sureli.b2cmarket.commodity.pojo.Commodity;
import com.sureli.b2cmarket.commodity.service.CommodityService;
import com.sureli.b2cmarket.market.service.MarketService;
import com.sureli.b2cmarket.order.pojo.Order;
import com.sureli.b2cmarket.order.service.OrderService;
import com.sureli.b2cmarket.user.pojo.User;
import com.sureli.b2cmarket.user.service.UserService;
import com.sureli.b2cmarket.util.ConfigUtil;
import com.sureli.b2cmarket.util.ServletUtil;

/**
 * @ClassName:MarketController
 * @Description:(这里用一句话描述这个类的作用)
 */
@Controller
public class MarketController {
	@Autowired
	private UserService userService;
	@Autowired
	private MarketService marketService;
	@Autowired
	private AreaService areaService;
	@Autowired
	private AddressService addressService;
	@Autowired
	private CartService cartService;
	@Autowired
	private CommodityService commodityService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private WishListService wishListService;
	
	/**
	 * 
	 * @Title: goIndex
	 * @Description:(跳转首页)
	 * @param modelAndView
	 * @return
	 */
//	@ResponseBody
	@RequestMapping({ "/", "index" })
	public ModelAndView goIndex(ModelAndView modelAndView) {
		List<Catalogue> getList = marketService.getCatalogueList();
		System.out.println("getList     " + getList);
		modelAndView.addObject("catalogueList", getList);
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
	@ResponseBody
	@GetMapping("login")
	public ModelAndView goLogin(ModelAndView modelAndView) {
		modelAndView.setViewName("market/login");
		return modelAndView;
	}
	/**
	 * 
	 * @Title: goLogin
	 * @Description:(跳转收藏页面)
	 * @param modelAndView
	 * @return
	 */
	@ResponseBody
	@GetMapping("wishlist")
	public ModelAndView goWishListn(ModelAndView modelAndView,HttpSession session) {
		List<Commodity> commodityList = new ArrayList<Commodity>();
		Commodity commodityGet = new Commodity();
		List<WishList> wishListAll = wishListService.findAll(ServletUtil.getUserCodeBySession(session));
		for (WishList wishList : wishListAll) {
			commodityGet = commodityService.findOne(Long.parseLong(wishList.getCommodityId()));
			commodityList.add(commodityGet);
		}
		System.out.println(commodityList);
		modelAndView.addObject("commodityList", commodityList);
		modelAndView.setViewName("market/wishlist");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: goMyAccount
	 * @Description:(跳转登录页面)
	 * @param modelAndView
	 * @return
	 */
	@ResponseBody
	@GetMapping("myAccount")
	public ModelAndView goMyAccount(ModelAndView modelAndView, Long rowId,HttpSession session) {
		System.out.println(rowId);
		User userMyCount = userService.findOne(rowId);
		List<Address> addressMycountList = addressService.findByUserId(rowId);
		Order searchOrder = new Order();
		searchOrder.setUserId(ServletUtil.getUserCodeBySession(session));
		List<Order> orderList=orderService.findBySearch(searchOrder);
		modelAndView.addObject("orderList", orderList);
		modelAndView.addObject("addressMycountList", addressMycountList);
		modelAndView.addObject("userMyCount", userMyCount);
		modelAndView.setViewName("market/myAccount");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: goRegister
	 * @Description:(跳转注册页面)
	 * @param modelAndView
	 * @return
	 */
	@ResponseBody
	@GetMapping("register")
	public ModelAndView goRegister(ModelAndView modelAndView) {
		List<Area> provinceList = areaService.findByParentCode(-1L);
//		System.out.println(provinceList);
		modelAndView.addObject("provinceList", provinceList);
		modelAndView.setViewName("market/register");
		return modelAndView;
	}

	@ResponseBody
	@GetMapping("register/makeCity/{rowId}")
	public ModelAndView goRegisterCity(@PathVariable long rowId, ModelAndView modelAndView) {
		List<Area> cityList = areaService.findByParentCode(rowId);
		modelAndView.addObject("cityList", cityList);
		System.out.println(cityList);
		modelAndView.setViewName("admin/area/area_city");
		return modelAndView;
	}

	@ResponseBody
	@GetMapping("register/makeRegin/{rowId}")
	public ModelAndView goRegisterRegin(@PathVariable long rowId, ModelAndView modelAndView) {
		List<Area> reginList = areaService.findByParentCode(rowId);
		modelAndView.addObject("reginList", reginList);
		System.out.println(reginList);
		modelAndView.setViewName("admin/area/area_regin");
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
	public ModelAndView goCart(ModelAndView modelAndView,HttpSession session) {
		List<Cart> cartList =  cartService.finAll(ServletUtil.getUserCodeBySession(session));
		Map<Cart, Commodity> cartCommodityMap = new HashMap<Cart, Commodity>();
		double cartPriceSum = 0;
		for (Cart cart : cartList) {
			Commodity getCommodity = commodityService.findOne(Long.parseLong(cart.getCommodityId()));
			cartCommodityMap.put(cart, getCommodity);
			cartPriceSum+=cart.getCommodityPriceSum();
		}
		modelAndView.addObject("userId", ServletUtil.getUserCodeBySession(session));
		modelAndView.addObject("cartCommodityMap", cartCommodityMap);
		modelAndView.addObject("cartPriceSum", cartPriceSum);
		modelAndView.setViewName("market/cart");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: category
	 * @Description:(跳转商品目录页面)
	 * @param modelAndView
	 * @return
	 */
	@ResponseBody
	@GetMapping("category")
	public ModelAndView goCategory(ModelAndView modelAndView) {
		List<Commodity> getList = marketService.getCommodityList();
		System.out.println("getlist     " + getList);
		modelAndView.addObject("commodityList", getList);
		modelAndView.setViewName("market/category");
		return modelAndView;
	}
	/**
	 * 
	 * @Title: category
	 * @Description:(跳转商品目录页面)
	 * @param modelAndView
	 * @return
	 */
	
	@ResponseBody
	@GetMapping("category/catagoryCommodity/{catalogueId}")
	public ModelAndView goCategoryCommodity(@PathVariable String catalogueId, ModelAndView modelAndView) {
		List<Commodity> getList = marketService.getCommodityListByCatalogueId(catalogueId);
		System.out.println("getlist     " + getList);
		modelAndView.addObject("commodityList", getList);
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
	public ModelAndView goCheckout(ModelAndView modelAndView,HttpSession session) {
		List<Cart> cartList =  cartService.finAll(ServletUtil.getUserCodeBySession(session));
		Map<Cart, Commodity> cartCommodityMap = new HashMap<Cart, Commodity>();
		double cartPriceSum = 0;
		for (Cart cart : cartList) {
			Commodity getCommodity = commodityService.findOne(Long.parseLong(cart.getCommodityId()));
			cartCommodityMap.put(cart, getCommodity);
			cartPriceSum+=cart.getCommodityPriceSum();
		}
		List<Address> addressMycountList = addressService.findByUserId(ServletUtil.getUserBySession(session).getRowId());
		modelAndView.addObject("addressMycountList", addressMycountList);
		modelAndView.addObject("userId", ServletUtil.getUserCodeBySession(session));
		modelAndView.addObject("cartCommodityMap", cartCommodityMap);
		modelAndView.addObject("cartPriceSum", cartPriceSum);
		modelAndView.setViewName("market/checkout");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: product
	 * @Description:(跳转商品详情页面)
	 * @param modelAndView
	 * @return
	 */
	@ResponseBody
	@GetMapping("product/{rowId}")
	public ModelAndView goProduct(@PathVariable Long rowId, ModelAndView modelAndView) {
		Commodity commodity = marketService.findOne(rowId);
		modelAndView.addObject("commodity", commodity);
		System.out.println("commodity" + commodity);
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
			@CookieValue(name = ConfigUtil.COOKIE_ADMIN_NAME, required = false) String cookieValue) {
		System.out.println("cookieValue" + cookieValue);
//		从浏览器得到cookie 数据 并处理
		if (cookieValue != null && !"".equals(cookieValue)) {
			System.out.println("自动登录");
//			indexService.autoLogin(cookieValue, request);
		} else {
		}
		if (request.getSession().getAttribute(ConfigUtil.SESSION_LOGIN_ADMIN_USER_NAME) == null) {
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
		return userService.doAdminLogin(userCode, userPassword, isRemenber, request, response);
	}

	@ResponseBody
	@RequestMapping("/admindologinout")
	public Integer doLoginOut(@CookieValue(name = ConfigUtil.COOKIE_ADMIN_NAME, required = false) String cookieValue,
			HttpSession session, HttpServletResponse response) {
		System.out.println("cookieValue" + cookieValue);
		session.setAttribute(ConfigUtil.LOGINOUT_ISREMENBER, cookieValue != null ? 1 : 0);
		session.removeAttribute(ConfigUtil.SESSION_LOGIN_ADMIN_USER_NAME);

		// 退出自动登录
		Cookie cookie = new Cookie(ConfigUtil.COOKIE_ADMIN_NAME, null);
		cookie.setMaxAge(0);
		cookie.setPath("/");
		response.addCookie(cookie);
		return 1;
	}
}
