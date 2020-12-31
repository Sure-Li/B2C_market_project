/**
 * @Company:Sure_li  
 * @Title:AreaService.java 
 * @Author:lishuo  
 * @Date:2020-12-31 11:37:03     
 */ 
package com.sureli.b2cmarket.area.service;

import java.util.List;

import com.sureli.b2cmarket.area.pojo.Area;

/** 
 * @ClassName:AreaService 
 * @Description:(这里用一句话描述这个类的作用)  
 */
public interface AreaService {

	/** 
	 * @Title: findByParentCode 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param l
	 * @return  
	 */ 
	List<Area> findByParentCode(long l);

}
