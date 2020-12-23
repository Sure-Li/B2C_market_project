/**
 * @Company:Sure_li  
 * @Title:Order.java 
 * @Author:lishuo  
 * @Date:2020-12-23 17:11:39     
 */
package com.sureli.b2cmarket.order.pojo;

import com.sureli.b2cmarket.base.pojo.BaseClass;

/**
 * @ClassName:Order
 * @Description:(订单类)
 */
public class Order extends BaseClass {

	private static final long serialVersionUID = 1L;
	// 订单编号
	private String orderCode;
	// 用户ID
	private String userId;
	// 订单商品总价
	private Double priceSum;
	// 收货地址ID
	private String addressId;
	// 订单状态 1:待付款;2:待发货;3:待收货;4:待评价;5:订单完成;
	private Integer orderState;
	// 支付方式 1：到付 2：微信 3：支付宝 4：信用卡
	private Integer orderPayMethod;

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Double getPriceSum() {
		return priceSum;
	}

	public void setPriceSum(Double priceSum) {
		this.priceSum = priceSum;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public Integer getOrderState() {
		return orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public Integer getOrderPayMethod() {
		return orderPayMethod;
	}

	public void setOrderPayMethod(Integer orderPayMethod) {
		this.orderPayMethod = orderPayMethod;
	}

	public Order() {
		super();
	}

	public Order(String orderCode, String userId, Double priceSum, String addressId, Integer orderState,
			Integer orderPayMethod) {
		super();
		this.orderCode = orderCode;
		this.userId = userId;
		this.priceSum = priceSum;
		this.addressId = addressId;
		this.orderState = orderState;
		this.orderPayMethod = orderPayMethod;
	}

	/**
	 * @Title: toString
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return
	 */
	@Override
	public String toString() {
		return "Order [orderCode=" + orderCode + ", userId=" + userId + ", priceSum=" + priceSum + ", addressId="
				+ addressId + ", orderState=" + orderState + ", orderPayMethod=" + orderPayMethod + ", rowId=" + rowId
				+ ", activeFlag=" + activeFlag + ", createBy=" + createBy + ", createDate=" + createDate + ", updateBy="
				+ updateBy + ", updateDate=" + updateDate + "]";
	}
}
