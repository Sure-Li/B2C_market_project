/**
 * @Company:Sure_li  
 * @Title:Commodity.java 
 * @Author:lishuo  
 * @Date:2020-12-23 16:38:56     
 */
package com.sureli.b2cmarket.commodity.pojo;

import org.apache.ibatis.type.Alias;

import com.sureli.b2cmarket.base.pojo.BaseClass;

/**
 * @ClassName:Commodity
 * @Description:(商品类)
 */
@Alias("Commodity")
public class Commodity extends BaseClass {

	private static final long serialVersionUID = 1L;
	// 目录ID
	private String catalogueId;
	// 商品名称
	private String commodityName;
	// 商品编号
	private String commodityCode;
	// 商品图片
	private String commodityPhoto;
	// 商品价格
	private Double commodityPrice;
	// 商品库存数量
	private Integer commodityStockCount;
	// 商品上下架状态
	private Integer commodityUpDownState;
	// 商品信息
	private String commodityInfo;

	public String getCatalogueId() {
		return catalogueId;
	}

	public void setCatalogueId(String catalogueId) {
		this.catalogueId = catalogueId;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getCommodityPhoto() {
		return commodityPhoto;
	}

	public void setCommodityPhoto(String commodityPhoto) {
		this.commodityPhoto = commodityPhoto;
	}

	public Double getCommodityPrice() {
		return commodityPrice;
	}

	public void setCommodityPrice(Double commodityPrice) {
		this.commodityPrice = commodityPrice;
	}

	public Integer getCommodityStockCount() {
		return commodityStockCount;
	}

	public void setCommodityStockCount(Integer commodityStockCount) {
		this.commodityStockCount = commodityStockCount;
	}

	public Integer getCommodityUpDownState() {
		return commodityUpDownState;
	}

	public void setCommodityUpDownState(Integer commodityUpDownState) {
		this.commodityUpDownState = commodityUpDownState;
	}

	public String getCommodityInfo() {
		return commodityInfo;
	}

	public void setCommodityInfo(String commodityInfo) {
		this.commodityInfo = commodityInfo;
	}

	public Commodity() {
		super();
	}

	public Commodity(String catalogueId, String commodityName, String commodityCode, String commodityPhoto,
			Double commodityPrice, Integer commodityStockCount, Integer commodityUpDownState, String commodityInfo) {
		super();
		this.catalogueId = catalogueId;
		this.commodityName = commodityName;
		this.commodityCode = commodityCode;
		this.commodityPhoto = commodityPhoto;
		this.commodityPrice = commodityPrice;
		this.commodityStockCount = commodityStockCount;
		this.commodityUpDownState = commodityUpDownState;
		this.commodityInfo = commodityInfo;
	}

	/**
	 * @Title: toString
	 * @Description:(重写toString方法)
	 * @return
	 */
	@Override
	public String toString() {
		return "Commodity [catalogueId=" + catalogueId + ", commodityName=" + commodityName + ", commodityCode="
				+ commodityCode + ", commodityPhoto=" + commodityPhoto + ", commodityPrice=" + commodityPrice
				+ ", commodityStockCount=" + commodityStockCount + ", commodityUpDownState=" + commodityUpDownState
				+ ", commodityInfo=" + commodityInfo + ", rowId=" + rowId + ", activeFlag=" + activeFlag + ", createBy="
				+ createBy + ", createDate=" + createDate + ", updateBy=" + updateBy + ", updateDate=" + updateDate
				+ "]";
	}

}
