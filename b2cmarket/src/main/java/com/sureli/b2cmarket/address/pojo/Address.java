/**
 * @Company:Sure_li  
 * @Title:Adress.java 
 * @Author:lishuo  
 * @Date:2020-12-23 19:43:04     
 */
package com.sureli.b2cmarket.address.pojo;

import org.apache.ibatis.type.Alias;

import com.sureli.b2cmarket.base.pojo.BaseClass;

/**
 * @ClassName:Adress
 * @Description:(这里用一句话描述这个类的作用)
 */
@Alias("Address")
public class Address extends BaseClass {

	private static final long serialVersionUID = 1L;
	// 用户ID
	private String userId;
	// 省编码
	private String addressProvinceCode;
	// 市编码
	private String addressCityCode;
	// 区编码
	private String addressReginCode;
	// 详细地址
	private String addressDetail;
	// 邮编
	private String addressPostCode;
	// 收件人电话
	private String addressPhone;
	// 是否默认地址
	private String addressIsDefault;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAddressProvinceCode() {
		return addressProvinceCode;
	}

	public void setAddressProvinceCode(String addressProvinceCode) {
		this.addressProvinceCode = addressProvinceCode;
	}

	public String getAddressCityCode() {
		return addressCityCode;
	}

	public void setAddressCityCode(String addressCityCode) {
		this.addressCityCode = addressCityCode;
	}

	public String getAddressReginCode() {
		return addressReginCode;
	}

	public void setAddressReginCode(String addressReginCode) {
		this.addressReginCode = addressReginCode;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getAddressPostCode() {
		return addressPostCode;
	}

	public void setAddressPostCode(String addressPostCode) {
		this.addressPostCode = addressPostCode;
	}

	public String getAddressPhone() {
		return addressPhone;
	}

	public void setAddressPhone(String addressPhone) {
		this.addressPhone = addressPhone;
	}

	public String getAddressIsDefault() {
		return addressIsDefault;
	}

	public void setAddressIsDefault(String addressIsDefault) {
		this.addressIsDefault = addressIsDefault;
	}

	public Address() {
		super();
	}

	public Address(String userId, String addressProvinceCode, String addressCityCode, String addressReginCode,
			String addressDetail, String addressPostCode, String addressPhone, String addressIsDefault) {
		super();
		this.userId = userId;
		this.addressProvinceCode = addressProvinceCode;
		this.addressCityCode = addressCityCode;
		this.addressReginCode = addressReginCode;
		this.addressDetail = addressDetail;
		this.addressPostCode = addressPostCode;
		this.addressPhone = addressPhone;
		this.addressIsDefault = addressIsDefault;
	}

	/**
	 * @Title: toString
	 * @Description:(重写toString方法)
	 * @return
	 */
	@Override
	public String toString() {
		return "Address [userId=" + userId + ", addressProvinceCode=" + addressProvinceCode + ", addressCityCode="
				+ addressCityCode + ", addressReginCode=" + addressReginCode + ", addressDetail=" + addressDetail
				+ ", addressPostCode=" + addressPostCode + ", addressPhone=" + addressPhone + ", addressIsDefault="
				+ addressIsDefault + ", rowId=" + rowId + ", activeFlag=" + activeFlag + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", updateBy=" + updateBy + ", updateDate=" + updateDate + "]";
	}

}
