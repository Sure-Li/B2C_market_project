/**
 * @Company:Sure_li  
 * @Title:OrderDateCount.java 
 * @Author:lishuo  
 * @Date:2021-1-7 20:24:53     
 */
package com.sureli.b2cmarket.orderdatecount.pojo;

import org.apache.ibatis.type.Alias;

import com.sureli.b2cmarket.base.pojo.BaseClass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName:OrderDateCount
 * @Description:(这里用一句话描述这个类的作用)
 */
@Alias("OrderDateCount")
@Getter
@Setter
@ToString
public class OrderDateCount extends BaseClass {

	private static final long serialVersionUID = 1L;
	private Integer yearData;
	private Integer monthData;
	private Integer dayData;
	private Integer orderCount;

	public OrderDateCount() {
		super();
	}

	public OrderDateCount(Integer yearData, Integer monthData, Integer dayData, Integer orderCount) {
		super();
		this.yearData = yearData;
		this.monthData = monthData;
		this.dayData = dayData;
		this.orderCount = orderCount;
	}
}
