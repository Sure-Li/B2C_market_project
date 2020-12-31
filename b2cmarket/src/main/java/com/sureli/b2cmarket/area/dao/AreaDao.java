/**
 * @Company:Sure_li  
 * @Title:AreaDao.java 
 * @Author:lishuo  
 * @Date:2020-12-31 11:38:33     
 */ 
package com.sureli.b2cmarket.area.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sureli.b2cmarket.area.pojo.Area;
import com.sureli.b2cmarket.base.dao.BaseDao;

/** 
 * @ClassName:AreaDao 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Repository
public interface AreaDao extends BaseDao<Area> {

	/** 
	 * @Title: findByParentCode 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */ 
	List<Area> findByParentCode(Long parentCode);

}
