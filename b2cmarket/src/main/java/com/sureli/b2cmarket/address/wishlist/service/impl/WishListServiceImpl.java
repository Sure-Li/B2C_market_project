/**
 * @Company:Sure_li  
 * @Title:WishListServiceImpl.java 
 * @Author:lishuo  
 * @Date:2021-1-9 8:10:15     
 */ 
package com.sureli.b2cmarket.address.wishlist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.address.wishlist.dao.WishListDao;
import com.sureli.b2cmarket.address.wishlist.pojo.WishList;
import com.sureli.b2cmarket.address.wishlist.service.WishListService;
import com.sureli.b2cmarket.util.ConfigUtil;

/** 
 * @ClassName:WishListServiceImpl 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Service
public class WishListServiceImpl implements WishListService {
	@Autowired
	private WishListDao wishListDao;
	/** 
	 * @Title: findAll 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */  
	@Override
	public List<WishList> findAll(String userCode) {
		return wishListDao.findAll(userCode);
	}
	/** 
	 * @Title: doDelete 
	 * @Description:(删除一条记录)
	 * @param rowId
	 * @return  
	 */  
	@Override
	public Integer doDelete(Long rowId) {
		System.out.println("rowId"+rowId);
		
		WishList wishList =  wishListDao.findOneByCommodityId(rowId);
		wishList.setActiveFlag(ConfigUtil.ACTIVE_FLAG_NO);
		return wishListDao.update(wishList);
	}
	/** 
	 * @Title: doAdd 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */  
	@Override
	public Integer doAdd(WishList wishList) {
		wishList.setActiveFlag(ConfigUtil.ACTIVE_FLAG_YES);
		return wishListDao.save(wishList);
	}

}
