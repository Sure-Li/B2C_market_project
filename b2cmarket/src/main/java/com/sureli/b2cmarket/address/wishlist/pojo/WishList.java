/**
 * @Company:Sure_li  
 * @Title:WishList.java 
 * @Author:lishuo  
 * @Date:2021-1-9 8:05:29     
 */ 
package com.sureli.b2cmarket.address.wishlist.pojo;

import org.apache.ibatis.type.Alias;

import com.sureli.b2cmarket.base.pojo.BaseClass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** 
 * @ClassName:WishList 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Alias("WishList")
@Getter
@Setter
@ToString
public class WishList extends BaseClass {
	private static final long serialVersionUID = 1L;
	private String userCode;
	private String commodityId;
	public WishList() {
		super();
	}
	public WishList(String userCode, String commodityId) {
		super();
		this.userCode = userCode;
		this.commodityId = commodityId;
	}
}
