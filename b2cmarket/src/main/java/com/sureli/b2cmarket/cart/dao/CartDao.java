/**
 * @Company:Sure_li  
 * @Title:CartDao.java 
 * @Author:lishuo  
 * @Date:2021-1-4 9:35:59     
 */ 
package com.sureli.b2cmarket.cart.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sureli.b2cmarket.base.dao.BaseDao;
import com.sureli.b2cmarket.cart.pojo.Cart;

/** 
 * @ClassName:CartDao 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Repository
public interface CartDao extends BaseDao<Cart>{

	/** 
	 * @Title: findByUserIdAndCommodityId 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param userId
	 * @param commodityId
	 * @return  
	 */ 
	Cart findByUserIdAndCommodityId(@Param("userId") String userId,@Param("commodityId") String commodityId);

}
