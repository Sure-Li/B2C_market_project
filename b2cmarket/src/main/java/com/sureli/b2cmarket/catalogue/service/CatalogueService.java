/**
 * @Company:Sure_li  
 * @Title:CatalogueService.java 
 * @Author:lishuo  
 * @Date:2020-12-27 22:46:14     
 */ 
package com.sureli.b2cmarket.catalogue.service;

import java.util.List;

import com.sureli.b2cmarket.catalogue.pojo.Catalogue;

/** 
 * @ClassName:CatalogueService 
 * @Description:(这里用一句话描述这个类的作用)  
 */
public interface CatalogueService {

	/** 
	 * @Title: findBySearch 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param searchCatalogue
	 * @return  
	 */ 
	List<Catalogue> findBySearch(Catalogue searchCatalogue);

	/** 
	 * @Title: update 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param catalogue
	 * @return  
	 */ 
	int update(Catalogue catalogue);

	/** 
	 * @Title: doRegister 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param catalogue
	 * @return  
	 */ 
	Integer doRegister(Catalogue catalogue);

	/** 
	 * @Title: findOne 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */ 
	Catalogue findOne(Long rowId);

	/** 
	 * @Title: delete 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */ 
	Integer delete(Long rowId);

	/** 
	 * @Title: findAllByParentId 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param l
	 * @return  
	 */ 
	List<Catalogue> findAllByParentId(long l);

}
