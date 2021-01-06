/**
 * @Company:Sure_li  
 * @Title:CodeCountPojo.java 
 * @Author:lishuo  
 * @Date:2021-1-6 11:01:39     
 */ 
package com.sureli.b2cmarket.codecount.pojo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.sureli.b2cmarket.base.pojo.BaseClass;

import lombok.Getter;
import lombok.Setter;

/** 
 * @ClassName:CodeCountPojo 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Alias("CodeCount")
@Setter
@Getter
public class CodeCount extends BaseClass {
	
	public static final int DAY_AUTO_RESET = 1;
	public static final int WEEK_AUTO_RESET = 2;
	public static final int MONTH_AUTO_RESET = 3;

	private static final long serialVersionUID = 1L;
	private Integer codeCount;
	private Integer resetType;
	
	public CodeCount(Integer codeCount, Integer resetType) {
		super();
		this.codeCount = codeCount;
		this.resetType = resetType;
	}

	public CodeCount() {
		super();
	}

	/** 
	 * @Title: toString 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */  
	@Override
	public String toString() {
		return "CodeCount [codeCount=" + codeCount + ", resetType=" + resetType + ", rowId=" + rowId + ", activeFlag="
				+ activeFlag + ", createBy=" + createBy + ", createDate=" + createDate + ", updateBy=" + updateBy
				+ ", updateDate=" + updateDate + "]";
	}

}
