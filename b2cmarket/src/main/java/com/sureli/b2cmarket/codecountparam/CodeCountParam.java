/**
 * @Company:Sure_li  
 * @Title:CodeCountParam.java 
 * @Author:lishuo  
 * @Date:2021-1-8 19:22:17     
 */ 
package com.sureli.b2cmarket.codecountparam;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** 
 * @ClassName:CodeCountParam 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Alias("CodeCountParam")
@Setter
@Getter
@ToString
public class CodeCountParam {
	private String keyString;
	private String ValueString;
}
