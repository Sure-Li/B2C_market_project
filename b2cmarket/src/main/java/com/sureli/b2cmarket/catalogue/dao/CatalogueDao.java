/**
 * @Company:Sure_li  
 * @Title:CatalogueDao.java 
 * @Author:lishuo  
 * @Date:2020-12-27 22:47:35     
 */ 
package com.sureli.b2cmarket.catalogue.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sureli.b2cmarket.base.dao.BaseDao;
import com.sureli.b2cmarket.catalogue.pojo.Catalogue;

/** 
 * @ClassName:CatalogueDao 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Repository
public interface CatalogueDao extends BaseDao<Catalogue> {

	/** 
	 * @Title: findBySearch 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param searchCatalogue
	 * @return  
	 */ 
	List<Catalogue> findBySearch(Catalogue searchCatalogue);

}
