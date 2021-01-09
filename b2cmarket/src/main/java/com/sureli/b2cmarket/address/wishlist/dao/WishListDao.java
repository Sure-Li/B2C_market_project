/**
 * @Company:Sure_li  
 * @Title:WishListDao.java 
 * @Author:lishuo  
 * @Date:2021-1-9 8:10:46     
 */ 
package com.sureli.b2cmarket.address.wishlist.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sureli.b2cmarket.address.wishlist.pojo.WishList;
import com.sureli.b2cmarket.base.dao.BaseDao;

/** 
 * @ClassName:WishListDao 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Repository
public interface WishListDao extends BaseDao<WishList> {

	/** 
	 * @Title: findAll 
	 * @Description:(查找所有WishList)
	 * @return  
	 */ 
	List<WishList> findAll();

	/** 
	 * @Title: findOneByCommodityId 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param rowId
	 * @return  
	 */ 
	WishList findOneByCommodityId(Long rowId);

}
