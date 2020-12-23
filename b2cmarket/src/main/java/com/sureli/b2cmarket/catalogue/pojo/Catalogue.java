/**
 * @Company:Sure_li  
 * @Title:Catalogue.java 
 * @Author:lishuo  
 * @Date:2020-12-23 17:07:14     
 */
package com.sureli.b2cmarket.catalogue.pojo;

import com.sureli.b2cmarket.base.pojo.BaseClass;

/**
 * @ClassName:Catalogue
 * @Description:(这里用一句话描述这个类的作用)
 */
public class Catalogue extends BaseClass {

	private static final long serialVersionUID = 1L;
	// 父级目录ID
	private String parentId;
	// 目录名称
	private String catalogueName;
	// 商品数量
	private Integer commodityCount;

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getCatalogueName() {
		return catalogueName;
	}

	public void setCatalogueName(String catalogueName) {
		this.catalogueName = catalogueName;
	}

	public Integer getCommodityCount() {
		return commodityCount;
	}

	public void setCommodityCount(Integer commodityCount) {
		this.commodityCount = commodityCount;
	}

	public Catalogue() {
		super();
	}

	public Catalogue(String parentId, String catalogueName, Integer commodityCount) {
		super();
		this.parentId = parentId;
		this.catalogueName = catalogueName;
		this.commodityCount = commodityCount;
	}

	/**
	 * @Title: toString
	 * @Description:(重写toString方法)
	 * @return
	 */
	@Override
	public String toString() {
		return "Catalogue [parentId=" + parentId + ", catalogueName=" + catalogueName + ", commodityCount="
				+ commodityCount + ", rowId=" + rowId + ", activeFlag=" + activeFlag + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", updateBy=" + updateBy + ", updateDate=" + updateDate + "]";
	}

}
