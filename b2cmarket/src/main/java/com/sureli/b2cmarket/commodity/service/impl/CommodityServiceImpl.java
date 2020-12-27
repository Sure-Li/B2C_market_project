/**
 * @Company:Sure_li  
 * @Title:CommodityServiceImpl.java 
 * @Author:lishuo  
 * @Date:2020-12-26 11:36:50     
 */ 
package com.sureli.b2cmarket.commodity.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.commodity.dao.CommodityDao;
import com.sureli.b2cmarket.commodity.pojo.Commodity;
import com.sureli.b2cmarket.commodity.service.CommodityService;
import com.sureli.b2cmarket.user.pojo.UserUtil;
import com.sureli.b2cmarket.util.ConfigUtil;

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
	/** 
	 * @Title: doRegister 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param commodity
	 * @return  
	 */  
	@Override
	public Integer doRegister(Commodity commodity) {
		commodity.setCommodityUpDownState(1);
		commodity.setActiveFlag(ConfigUtil.ACTIVE_FLAG_YES);
		commodity.setCreateDate(new Date());
		return commodityDao.save(commodity);
	}
	/** 
	 * @Title: findOne 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */  
	@Override
	public Commodity findOne(Long rowId) {
		return commodityDao.findOne(rowId);
	}

}
