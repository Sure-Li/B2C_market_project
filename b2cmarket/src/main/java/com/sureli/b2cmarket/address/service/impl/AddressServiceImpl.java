/**
 * @Company:Sure_li  
 * @Title:AddressServiceImpl.java 
 * @Author:lishuo  
 * @Date:2020-12-31 11:24:41     
 */
package com.sureli.b2cmarket.address.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.address.dao.AddressDao;
import com.sureli.b2cmarket.address.pojo.Address;
import com.sureli.b2cmarket.address.service.AddressService;

/**
 * @ClassName:AddressServiceImpl
 * @Description:(这里用一句话描述这个类的作用)
 */
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressDao addressDao;

	/**
	 * @Title: findByUserId
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return
	 */
	@Override
	public List<Address> findByUserId(Long rowId) {
		return addressDao.findByUserId(rowId);
	}

}
