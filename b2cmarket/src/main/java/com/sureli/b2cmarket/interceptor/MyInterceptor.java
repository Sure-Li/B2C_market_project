/**
 * @Company:Sure_li  
 * @Title:MyInterceptor.java 
 * @Author:lishuo  
 * @Date:2021-1-11 19:33:35     
 */
package com.sureli.b2cmarket.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.util.ConfigUtil;

/**
 * @ClassName:MyInterceptor
 * @Description:(这里用一句话描述这个类的作用)
 */
public class MyInterceptor implements HandlerInterceptor {
	private static final Logger LOG = LoggerFactory.getLogger(MyInterceptor.class);
	private static final String XHR_OBJECT_NAME = "XMLHttpRequest";// jQuery的Ajax请求的头文件的值
	private static final String HEADER_REQUEST_WITH = "x-requested-with";// jQuery 在发起Ajax请求时,携带的头文件信息
	/**
	 * 
	 * @Title: preHandle
	 * @Description:(响应之前)
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LOG.debug("Controller响应之前调用");
		LOG.debug("request.getRequestURL()" + request.getRequestURL());
		HttpSession session = request.getSession();
		Object obj = session.getAttribute(ConfigUtil.SESSION_LOGIN_USER_NAME);
		System.out.println(obj);
		if (obj != null)// 登录
		{
			// return true; 让请求继续执行
			return true;
		} else {// 非登录
			if (isAjaxRequest(request)) {
				response.setStatus(700);
			} else {
				System.out.println("123123");	
//				跳回登录界面
				response.sendRedirect("login");
			}
			return false;
		}
//		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

	/**
	 * 
	 * @Title: postHandle
	 * @Description:(响应的时候调用 )
	 * @param request
	 * @param response
	 * @param handler
	 * @param modelAndView
	 * @throws Exception
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		LOG.debug("Controller响应之后        返回之前调用  ");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	private boolean isAjaxRequest(HttpServletRequest request) {
		String jQueryXHRObjectName = request.getHeader(HEADER_REQUEST_WITH);
		if (jQueryXHRObjectName != null && XHR_OBJECT_NAME.equals(jQueryXHRObjectName)) {
			return true;
		} else {
			return false;
		}
	}
}
