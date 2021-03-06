/**
 * @Company:Sure_li  
 * @Title:AddressDao.java 
 * @Author:lishuo  
 * @Date:2020-12-31 11:25:00     
 */ 
package com.sureli.b2cmarket.address.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sureli.b2cmarket.address.pojo.Address;
import com.sureli.b2cmarket.base.dao.BaseDao;

/** 
 * @ClassName:AddressDao 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Repository
public interface AddressDao extends BaseDao<Address>{

	/** 
	 * @Title: findByUserId 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */ 
	List<Address> findByUserId(Long rowId);

}
