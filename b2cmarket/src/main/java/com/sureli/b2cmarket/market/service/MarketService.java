/**
 * @Company:Sure_li  
 * @Title:MarketService.java 
 * @Author:lishuo  
 * @Date:2020-12-29 9:22:09     
 */ 
package com.sureli.b2cmarket.market.service;

import java.util.List;

import com.sureli.b2cmarket.catalogue.pojo.Catalogue;
import com.sureli.b2cmarket.commodity.pojo.Commodity;

/** 
 * @ClassName:MarketService 
 * @Description:(这里用一句话描述这个类的作用)  
 */
public interface MarketService {

	/** 
	 * @Title: test 
	 * @Description:(这里用一句话描述这个方法的作用)  
	 */ 
	void test();

	/** 
	 * @Title: getCatalogueList 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */ 
	List<Catalogue> getCatalogueList();

	/** 
	 * @Title: getCommodityList 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */ 
	List<Commodity> getCommodityList();

	/** 
	 * @Title: findOne 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */ 
	Commodity findOne(Long rowId);

}
