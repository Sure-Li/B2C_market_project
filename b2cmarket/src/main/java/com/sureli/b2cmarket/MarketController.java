/**
 * @Company:Sure_li  
 * @Title:MarketController.java 
 * @Author:lishuo  
 * @Date:2020-12-23 11:10:49     
 */ 
package com.sureli.b2cmarket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/** 
 * @ClassName:MarketController 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Controller
public class MarketController {
	@RequestMapping({"/","index"})
	public ModelAndView goindex(ModelAndView modelAndView) {
		modelAndView.setViewName("market/index");
		return modelAndView;
	}
}
