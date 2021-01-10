/**
 * @Company:Sure_li  
 * @Title:MarketServcieImpl.java 
 * @Author:lishuo  
 * @Date:2020-12-29 9:22:52     
 */
package com.sureli.b2cmarket.market.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.catalogue.dao.CatalogueDao;
import com.sureli.b2cmarket.catalogue.pojo.Catalogue;
import com.sureli.b2cmarket.commodity.dao.CommodityDao;
import com.sureli.b2cmarket.commodity.pojo.Commodity;
import com.sureli.b2cmarket.market.service.MarketService;
import com.sureli.b2cmarket.util.ConfigUtil;

/**
 * @ClassName:MarketServcieImpl
 * @Description:(这里用一句话描述这个类的作用)
 */
@Service("marketServcie")
public class MarketServcieImpl implements MarketService {
	@Autowired
	private CatalogueDao catalogueDao;
	
	@Autowired
	private CommodityDao commodityDao;

	/**
	 * @Title: test
	 * @Description:(这里用一句话描述这个方法的作用)
	 */
	@Override
	public void test() {
		System.out.println("test com.sureli.b2cmarket.market.service.impl.MarketServcieImpl");
		System.out.println(catalogueDao.findBySearch(new Catalogue()));
	}

	/**
	 * @Title: getCatalogueList
	 * @Description:(用于从数据库获取目录数据给前端)
	 * @return
	 */
	@Override
	public List<Catalogue> getCatalogueList() {
		return ConfigUtil.sort(-1L, catalogueDao.findBySearch(new Catalogue()), new ArrayList<Catalogue>());
	}

	/** 
	 * @Title: getCommodityList 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */  
	@Override
	public List<Commodity> getCommodityList() {
		return commodityDao.findBySearch(new Commodity());
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

	/** 
	 * @Title: getCommodityListByCatalogueId 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param catalogueId
	 * @return  
	 */  
	@Override
	public List<Commodity> getCommodityListByCatalogueId(String catalogueId) {
		Commodity commodity = new Commodity();
		commodity.setCatalogueId(catalogueId);
		return commodityDao.findBySearch(commodity);
	}
}
