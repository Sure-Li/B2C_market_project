/**
 * @Company:Sure_li  
 * @Title:AddressService.java 
 * @Author:lishuo  
 * @Date:2020-12-31 11:23:50     
 */ 
package com.sureli.b2cmarket.address.service;

import java.util.List;

import com.sureli.b2cmarket.address.pojo.Address;

/** 
 * @ClassName:AddressService 
 * @Description:(这里用一句话描述这个类的作用)  
 */
public interface AddressService {

	/** 
	 * @Title: findByUserId 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */ 
	List<Address> findByUserId(Long rowId);

}
