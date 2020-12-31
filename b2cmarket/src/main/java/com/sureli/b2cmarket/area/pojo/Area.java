/**
 * @Company:Sure_li  
 * @Title:Area.java 
 * @Author:lishuo  
 * @Date:2020-12-31 11:36:27     
 */ 
package com.sureli.b2cmarket.area.pojo;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;

import com.sureli.b2cmarket.base.pojo.BaseClass;

import lombok.Getter;
import lombok.Setter;

/** 
 * @ClassName:Area 
 * @Description:(地区类)  
 */
@Alias("Area")
@Getter
@Setter
public class Area extends BaseClass{

	private static final long serialVersionUID = 1L;
	
	private BigDecimal areaCode;
	private String areaName;
	private BigDecimal parentCode;
	private int areaRunk;
	private int hasChild;
	public Area() {
		super();
	}
	public Area(BigDecimal areaCode, String areaName, BigDecimal parentCode, int areaRunk, int hasChild) {
		super();
		this.areaCode = areaCode;
		this.areaName = areaName;
		this.parentCode = parentCode;
		this.areaRunk = areaRunk;
		this.hasChild = hasChild;
	}
	/** 
	 * @Title: toString 
	 * @Description:(用于打印实体类的信息)
	 * @return  
	 */  
	@Override
	public String toString() {
		return "Area [areaCode=" + areaCode + ", areaName=" + areaName + ", parentCode=" + parentCode + ", areaRunk="
				+ areaRunk + ", hasChild=" + hasChild + ", rowId=" + rowId + ", activeFlag=" + activeFlag
				+ ", createBy=" + createBy + ", createDate=" + createDate + ", updateBy=" + updateBy + ", updateDate="
				+ updateDate + "]";
	}
	
	

}
