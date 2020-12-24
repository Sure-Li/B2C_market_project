/**
 * @Company:Sure_li  
 * @Title:User.java 
 * @Author:lishuo  
 * @Date:2020-12-23 16:28:05     
 */
package com.sureli.b2cmarket.user.pojo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.sureli.b2cmarket.base.pojo.BaseClass;

/**
 * @ClassName:User
 * @Description:(这里用一句话描述这个类的作用)
 */
@Alias("User")
public class User extends BaseClass {

	private static final long serialVersionUID = 1L;
	// 用户类型 1，商家（如：客服，仓储）。2，买家。
	private Integer userType;
	// 用户姓名
	private String userName;
	// 用户编号
	private String userCode;
	// 用户密码
	private String userPassword;
	// 用户手机号
	private String userPhone;
	// 用户是否锁定
	private Integer isLock;
	// 用户最后登录ip
	private String lastLoginIp;
	// 用户最后登录时间
	private Date lastLoginDate;

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Integer getIsLock() {
		return isLock;
	}

	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public User() {
		super();
	}

	public User(Integer userType, String userName, String userCode, String userPassword, String userPhone,
			Integer isLock, String lastLoginIp, Date lastLoginDate) {
		super();
		this.userType = userType;
		this.userName = userName;
		this.userCode = userCode;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.isLock = isLock;
		this.lastLoginIp = lastLoginIp;
		this.lastLoginDate = lastLoginDate;
	}

	/**
	 * @Title: toString
	 * @Description:(重写toString方法)
	 * @return
	 */
	@Override
	public String toString() {
		return "User [userType=" + userType + ", userName=" + userName + ", userCode=" + userCode + ", userPassword="
				+ userPassword + ", userPhone=" + userPhone + ", isLock=" + isLock + ", lastLoginIp=" + lastLoginIp
				+ ", lastLoginDate=" + lastLoginDate + "]";
	}

}
