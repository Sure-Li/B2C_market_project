/**
 * @Company:Sure_li  
 * @Title:Cart.java 
 * @Author:lishuo  
 * @Date:2020-12-23 19:33:03     
 */
package com.sureli.b2cmarket.cart.pojo;

import org.apache.ibatis.type.Alias;

import com.sureli.b2cmarket.base.pojo.BaseClass;

/**
 * @ClassName:Cart
 * @Description:(这里用一句话描述这个类的作用)
 */
@Alias("Cart")
public class Cart extends BaseClass {

	private static final long serialVersionUID = 1L;

	// 用户ID 关联用户表的rowId
	private String userId;
	// 商品ID 关联商品表的rowId
	private String commodityId;
	// 商品数量
	private Integer commodityCount;
	// 商品总价
	private Double commodityPriceSum;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public Integer getCommodityCount() {
		return commodityCount;
	}

	public void setCommodityCount(Integer commodityCount) {
		this.commodityCount = commodityCount;
	}

	public Double getCommodityPriceSum() {
		return commodityPriceSum;
	}

	public void setCommodityPriceSum(Double commodityPriceSum) {
		this.commodityPriceSum = commodityPriceSum;
	}

	public Cart() {
		super();
	}

	public Cart(String userId, String commodityId, Integer commodityCount, Double commodityPriceSum) {
		super();
		this.userId = userId;
		this.commodityId = commodityId;
		this.commodityCount = commodityCount;
		this.commodityPriceSum = commodityPriceSum;
	}

	/**
	 * @Title: toString
	 * @Description:(重写toString方法)
	 * @return
	 */
	@Override
	public String toString() {
		return "Cart [userId=" + userId + ", commodityId=" + commodityId + ", commodityCount=" + commodityCount
				+ ", commodityPriceSum=" + commodityPriceSum + ", rowId=" + rowId + ", activeFlag=" + activeFlag
				+ ", createBy=" + createBy + ", createDate=" + createDate + ", updateBy=" + updateBy + ", updateDate="
				+ updateDate + "]";
	}

}
