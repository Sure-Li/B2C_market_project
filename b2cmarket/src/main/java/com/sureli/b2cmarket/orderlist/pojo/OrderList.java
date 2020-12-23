/**
 * @Company:Sure_li  
 * @Title:OrderList.java 
 * @Author:lishuo  
 * @Date:2020-12-23 17:19:02     
 */
package com.sureli.b2cmarket.orderlist.pojo;

import com.sureli.b2cmarket.base.pojo.BaseClass;

/**
 * @ClassName:OrderList
 * @Description:(这里用一句话描述这个类的作用)
 */
public class OrderList extends BaseClass {

	private static final long serialVersionUID = 1L;

	// 订单编号
	private String orderId;
	// 商品ID 关联商品的rowId
	private String commodityId;
	// 购买数量
	private Integer orderCount;
	// 商品总价
	private Double orderPriceSum;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public Integer getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	public Double getOrderPriceSum() {
		return orderPriceSum;
	}

	public void setOrderPriceSum(Double orderPriceSum) {
		this.orderPriceSum = orderPriceSum;
	}

	public OrderList() {
		super();
	}

	public OrderList(String orderId, String commodityId, Integer orderCount, Double orderPriceSum) {
		super();
		this.orderId = orderId;
		this.commodityId = commodityId;
		this.orderCount = orderCount;
		this.orderPriceSum = orderPriceSum;
	}

	/**
	 * @Title: toString
	 * @Description:(重写toString方法)
	 * @return
	 */
	@Override
	public String toString() {
		return "OrderList [orderId=" + orderId + ", commodityId=" + commodityId + ", orderCount=" + orderCount
				+ ", orderPriceSum=" + orderPriceSum + ", rowId=" + rowId + ", activeFlag=" + activeFlag + ", createBy="
				+ createBy + ", createDate=" + createDate + ", updateBy=" + updateBy + ", updateDate=" + updateDate
				+ "]";
	}

}
