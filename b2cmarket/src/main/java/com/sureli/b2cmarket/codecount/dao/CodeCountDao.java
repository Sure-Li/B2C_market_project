/**
 * @Company:Sure_li  
 * @Title:CodeCountDao.java 
 * @Author:lishuo  
 * @Date:2021-1-6 11:09:35     
 */ 
package com.sureli.b2cmarket.codecount.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sureli.b2cmarket.base.dao.BaseDao;
import com.sureli.b2cmarket.codecount.pojo.CodeCount;

/** 
 * @ClassName:CodeCountDao 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Repository
public interface CodeCountDao extends BaseDao<CodeCount> {

	/** 
	 * @Title: findAll 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */ 
	List<CodeCount> findAll();
	
	CodeCount findOne(Long rowId);
}
