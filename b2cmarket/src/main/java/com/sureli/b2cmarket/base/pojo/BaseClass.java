/**
 * @Company:Sure_li  
 * @Title:BaseClass.java 
 * @Author:lishuo  
 * @Date:2020-12-23 16:23:37     
 */
package com.sureli.b2cmarket.base.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName:BaseClass
 * @Description:(基本类)
 */
public class BaseClass implements Serializable {
	private static final long serialVersionUID = 1L;
	// 主键ID
	protected Long rowId;
	// 数据是否有效 1有效 0无效 用于删除数据时使用
	protected Integer activeFlag;
	// 创建人
	protected String createBy;
	// 创建时间
	protected Date createDate;
	// 更新人
	protected String updateBy;
	// 更新时间
	protected Date updateDate;

	public Long getRowId() {
		return rowId;
	}

	public void setRowId(Long rowId) {
		this.rowId = rowId;
	}

	public Integer getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public BaseClass() {
		super();
	}

	public BaseClass(Long rowId, Integer activeFlag, String createBy, Date createDate, String updateBy,
			Date updateDate) {
		super();
		this.rowId = rowId;
		this.activeFlag = activeFlag;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

}
