/**
 * @Company:Sure_li  
 * @Title:WishListService.java 
 * @Author:lishuo  
 * @Date:2021-1-9 8:09:38     
 */ 
package com.sureli.b2cmarket.address.wishlist.service;

import java.util.List;

import com.sureli.b2cmarket.address.wishlist.pojo.WishList;

/** 
 * @ClassName:WishListService 
 * @Description:(这里用一句话描述这个类的作用)  
 */
public interface WishListService {

	/** 
	 * @Title: findAll 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */ 
	List<WishList> findAll(String userCode);

	/** 
	 * @Title: doDelete 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */ 
	Integer doDelete(Long rowId);

	/** 
	 * @Title: doAdd 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */ 
	Integer doAdd(WishList wishList);

	/** 
	 * @Title: findOne 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */ 
	WishList findOne(String rowId);

	/** 
	 * @Title: update 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param wishListGet
	 * @return  
	 */ 
	Integer update(WishList wishListGet);

}
