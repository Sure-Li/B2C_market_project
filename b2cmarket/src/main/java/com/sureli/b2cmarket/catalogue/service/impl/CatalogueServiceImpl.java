/**
 * @Company:Sure_li  
 * @Title:CatalogueServiceImpl.java 
 * @Author:lishuo  
 * @Date:2020-12-27 22:46:52     
 */
package com.sureli.b2cmarket.catalogue.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.catalogue.dao.CatalogueDao;
import com.sureli.b2cmarket.catalogue.pojo.Catalogue;
import com.sureli.b2cmarket.catalogue.service.CatalogueService;
import com.sureli.b2cmarket.user.pojo.User;
import com.sureli.b2cmarket.user.pojo.UserUtil;
import com.sureli.b2cmarket.util.ConfigUtil;

/**
 * @ClassName:CatalogueServiceImpl
 * @Description:(这里用一句话描述这个类的作用)
 */
@Service
public class CatalogueServiceImpl implements CatalogueService {
	@Autowired
	private CatalogueDao catalogueDao;

	/**
	 * @Title: findBySearch
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param searchCatalogue
	 * @return
	 */
	@Override
	public List<Catalogue> findBySearch(Catalogue searchCatalogue) {
		return catalogueDao.findBySearch(searchCatalogue);
	}

	/**
	 * @Title: update
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param catalogue
	 * @return
	 */
	@Override
	public int update(Catalogue catalogue) {
		Catalogue catalogueGet = catalogueDao.findOne(catalogue.getRowId());
		System.out.println("catalogueGet" + catalogueGet);
		catalogueGet.setParentId(catalogue.getParentId());
		catalogueGet.setCatalogueName(catalogue.getCatalogueName());
		catalogueGet.setCommodityCount(catalogue.getCommodityCount());
		return catalogueDao.update(catalogueGet);
	}

	/**
	 * @Title: doRegister
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param catalogue
	 * @return
	 */
	@Override
	public Integer doRegister(Catalogue catalogue) {
		catalogue.setActiveFlag(ConfigUtil.ACTIVE_FLAG_YES);
		catalogue.setCreateBy("Sure_li");
		catalogue.setCreateDate(new Date());
		return catalogueDao.save(catalogue);
	}

	/**
	 * @Title: findOne
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return
	 */
	@Override
	public Catalogue findOne(Long rowId) {
		return catalogueDao.findOne(rowId);
	}

	/**
	 * @Title: delete
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return
	 */
	@Override
	public Integer delete(Long rowId) {
		Catalogue catalogueGet = catalogueDao.findOne(rowId);
		System.out.println("catalogueGet" + catalogueGet);
		catalogueGet.setActiveFlag(ConfigUtil.ACTIVE_FLAG_NO);
		return catalogueDao.update(catalogueGet);
	}

}
