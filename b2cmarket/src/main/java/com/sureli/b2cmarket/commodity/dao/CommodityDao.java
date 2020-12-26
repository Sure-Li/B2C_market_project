/**
 * @Company:Sure_li  
 * @Title:CommodityDao.java 
 * @Author:lishuo  
 * @Date:2020-12-26 11:41:08     
 */ 
package com.sureli.b2cmarket.commodity.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sureli.b2cmarket.base.dao.BaseDao;
import com.sureli.b2cmarket.commodity.pojo.Commodity;

/** 
 * @ClassName:CommodityDao 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Repository
public interface CommodityDao extends BaseDao<Commodity> {

	/** 
	 * @Title: findBySearch 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param searchCommodity
	 * @return  
	 */ 
	List<Commodity> findBySearch(Commodity searchCommodity);

}
