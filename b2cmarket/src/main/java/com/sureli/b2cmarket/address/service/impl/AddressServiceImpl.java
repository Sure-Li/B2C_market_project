/**
 * @Company:Sure_li  
 * @Title:AddressServiceImpl.java 
 * @Author:lishuo  
 * @Date:2020-12-31 11:24:41     
 */
package com.sureli.b2cmarket.address.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.address.dao.AddressDao;
import com.sureli.b2cmarket.address.pojo.Address;
import com.sureli.b2cmarket.address.service.AddressService;
import com.sureli.b2cmarket.util.ConfigUtil;

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

	/** 
	 * @Title: save 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param address
	 * @return  
	 */  
	@Override
	public Integer save(Address address) {
		
		address.setActiveFlag(ConfigUtil.ACTIVE_FLAG_YES);
		address.setCreateBy("li");
		address.setCreateDate(new Date());
		if (address.getAddressIsDefault().equals("1")) {
			List<Address> allOldAdderss =  addressDao.findByUserId(Long.parseLong(address.getUserId()));
			for (Address address2 : allOldAdderss) {
				address2.setAddressIsDefault("0");
				addressDao.update(address2);
			}
		}
		return addressDao.save(address);
	}

	/** 
	 * @Title: delete 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */  
	@Override
	public Integer delete(Long rowId) {
		Address address = addressDao.findOne(rowId);
		address.setActiveFlag(ConfigUtil.ACTIVE_FLAG_NO);
		return addressDao.update(address);
	}

	/** 
	 * @Title: findOne 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */  
	@Override
	public Address findOne(Long rowId) {
		return addressDao.findOne(rowId);
	}

	/** 
	 * @Title: doEdit 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param address
	 * @return  
	 */  
	@Override
	public Integer doEdit(Address address) {
		Address getAddress = addressDao.findOne(address.getRowId());
		getAddress.setAddressProvinceCode(address.getAddressProvinceCode());
		getAddress.setAddressCityCode(address.getAddressCityCode());
		getAddress.setAddressReginCode(address.getAddressReginCode());
		getAddress.setAddressDetail(address.getAddressDetail());
		getAddress.setAddressPostCode(address.getAddressPostCode());
		getAddress.setAddressPhone(address.getAddressPhone());
		if (address.getAddressIsDefault().equals("1")) {
			List<Address> allOldAdderss =  addressDao.findByUserId(Long.parseLong(address.getUserId()));
			for (Address address2 : allOldAdderss) {
				address2.setAddressIsDefault("0");
				addressDao.update(address2);
			}
		}
		getAddress.setAddressIsDefault(address.getAddressIsDefault());
		return addressDao.update(getAddress);
	}

}
