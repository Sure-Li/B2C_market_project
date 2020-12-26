/**
 * @Company:Sure_li  
 * @Title:CommodityServiceImpl.java 
 * @Author:lishuo  
 * @Date:2020-12-26 11:36:50     
 */ 
package com.sureli.b2cmarket.commodity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.commodity.dao.CommodityDao;
import com.sureli.b2cmarket.commodity.pojo.Commodity;
import com.sureli.b2cmarket.commodity.service.CommodityService;

/** 
 * @ClassName:CommodityServiceImpl 
 * @Description:(商品服务层的实现类)  
 */
@Service
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	private CommodityDao commodityDao;
	/** 
	 * @Title: findBySearch 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param searchCommodity
	 * @return  
	 */  
	@Override
	public List<Commodity> findBySearch(Commodity searchCommodity) {
		return commodityDao.findBySearch(searchCommodity);
	}

}
