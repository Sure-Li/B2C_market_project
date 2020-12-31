/**
 * @Company:Sure_li  
 * @Title:AreaServiceImpl.java 
 * @Author:lishuo  
 * @Date:2020-12-31 11:37:46     
 */ 
package com.sureli.b2cmarket.area.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.area.dao.AreaDao;
import com.sureli.b2cmarket.area.pojo.Area;
import com.sureli.b2cmarket.area.service.AreaService;

/** 
 * @ClassName:AreaServiceImpl 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaDao areaDao;
	/** 
	 * @Title: findByParentCode 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param l
	 * @return  
	 */  
	@Override
	public List<Area> findByParentCode(long l) {
		return areaDao.findByParentCode(l);
	}

}
