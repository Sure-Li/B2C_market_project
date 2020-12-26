/**
 * @Company:Sure_li  
 * @Title:CommodityService.java 
 * @Author:lishuo  
 * @Date:2020-12-26 11:36:17     
 */ 
package com.sureli.b2cmarket.commodity.service;

import java.util.List;

import com.sureli.b2cmarket.commodity.pojo.Commodity;

/** 
 * @ClassName:CommodityService 
 * @Description:(商品服务层接口)  
 */
public interface CommodityService {

	/** 
	 * @Title: findBySearch 
	 * @Description:(查询商品数据用于commodity_index使用)
	 * @param searchCommodity
	 * @return  
	 */ 
	List<Commodity> findBySearch(Commodity searchCommodity);

}
