/**
 * @Company:Sure_li  
 * @Title:OrderDateCountController.java 
 * @Author:lishuo  
 * @Date:2021-1-7 20:37:38     
 */
package com.sureli.b2cmarket.orderdatecount.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.codecountparam.CodeCountParam;
import com.sureli.b2cmarket.orderdatecount.pojo.OrderDateCount;
import com.sureli.b2cmarket.orderdatecount.service.OrderDateCountService;

/**
 * @ClassName:OrderDateCountController
 * @Description:(这里用一句话描述这个类的作用)
 */
@RestController
@RequestMapping("orderdatecount/")
public class OrderDateCountController {
	@Autowired
	private  OrderDateCountService orderDateCountService;
	
	@GetMapping("getmonth")
	public ModelAndView getMonthData(Integer year,ModelAndView modelAndView) {
		List<Integer> monthDataList = orderDateCountService.findMonthDateByYear(year);
		System.out.println(monthDataList);
		modelAndView.addObject("monthDataList", monthDataList);
		modelAndView.setViewName("admin/orderdatecount/orderdatecount_index_child");
		return modelAndView;
	}
	@GetMapping("list")
	public ModelAndView getOrderDateCount( ModelAndView modelAndView){
		List<OrderDateCount> orderDateCountList = orderDateCountService.findAll();
		StringBuilder keyString = new StringBuilder();
		StringBuilder valueString = new StringBuilder();
		int i = 0;
		for (OrderDateCount orderDateCount : orderDateCountList) {
			keyString.append((""+orderDateCount.getYearData()+orderDateCount.getMonthData()+orderDateCount.getDayData()));
			valueString.append(orderDateCount.getOrderCount());
			keyString.append("日");
			if (i<orderDateCountList.size()-1) {
				keyString.append(",");
				valueString.append(",");
			}
			i++;
		}
		System.out.println("orderDateCountList"+orderDateCountList);
		modelAndView.addObject("keyString", keyString.toString());
		modelAndView.addObject("valueString",valueString.toString());
		modelAndView.addObject("labelString", "总数据趋势");
		modelAndView.setViewName("admin/orderdatecount/orderdatecount_list");
		return modelAndView;
	}
	@GetMapping("list/{year}")
	public ModelAndView getOrderDateCountWithYear(@PathVariable Integer year, ModelAndView modelAndView){
		List<CodeCountParam> codeCountParamList = orderDateCountService.findAllByYear(year);
		System.out.println(codeCountParamList);
		StringBuilder keyString = new StringBuilder();
		StringBuilder valueString = new StringBuilder();
		int i = 0;
		for (CodeCountParam codeCountParam : codeCountParamList) {
			keyString.append(codeCountParam.getKeyString());
			valueString.append(codeCountParam.getValueString());
			keyString.append("月");
			if (i<codeCountParamList.size()-1) {
				keyString.append(",");
				valueString.append(",");
			}
			i++;
		}
		System.out.println("codeCountParamList"+codeCountParamList);
		modelAndView.addObject("keyString", keyString.toString());
		modelAndView.addObject("valueString",valueString.toString());
		modelAndView.addObject("labelString", "月数据趋势");
		modelAndView.setViewName("admin/orderdatecount/orderdatecount_list");
		return modelAndView;
	}
	@GetMapping("list/{year}/{month}")
	public ModelAndView getOrderDateCountWithYearAndMonth(@PathVariable Integer year,@PathVariable Integer month, ModelAndView modelAndView){
		List<CodeCountParam> codeCountParamList = orderDateCountService.findAllByYearAndMonth(year,month);
		System.out.println(codeCountParamList);
		StringBuilder keyString = new StringBuilder();
		StringBuilder valueString = new StringBuilder();
		int i = 0;
		for (CodeCountParam codeCountParam : codeCountParamList) {
			keyString.append(codeCountParam.getKeyString());
			valueString.append(codeCountParam.getValueString());
			keyString.append("日");
			if (i<codeCountParamList.size()-1) {
				keyString.append(",");
				valueString.append(",");
			}
			i++;
		}
		System.out.println("codeCountParamList"+codeCountParamList);
		modelAndView.addObject("keyString", keyString.toString());
		modelAndView.addObject("valueString",valueString.toString());
		modelAndView.addObject("labelString", "日数据趋势");
		modelAndView.setViewName("admin/orderdatecount/orderdatecount_list");
		return modelAndView;
	}
}
