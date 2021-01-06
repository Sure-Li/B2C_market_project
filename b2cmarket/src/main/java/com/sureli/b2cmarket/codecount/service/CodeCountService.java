/**
 * @Company:Sure_li  
 * @Title:CodeCountService.java 
 * @Author:lishuo  
 * @Date:2021-1-6 11:08:05     
 */ 
package com.sureli.b2cmarket.codecount.service;

import com.sureli.b2cmarket.codecount.pojo.CodeCount;

/** 
 * @ClassName:CodeCountService 
 * @Description:(这里用一句话描述这个类的作用)  
 */
public interface CodeCountService {

	/** 
	 * @Title: getCodeCount 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param l
	 * @return  
	 */ 
	int getCodeCount(long l);

	/** 
	 * @Title: update 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param codeCount  
	 */ 
	Integer update(CodeCount codeCount);

}
