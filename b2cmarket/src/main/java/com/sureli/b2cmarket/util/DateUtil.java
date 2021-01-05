/**
 * @Company:Sure_li  
 * @Title:DateUtil.java 
 * @Author:lishuo  
 * @Date:2021-1-5 15:32:08     
 */ 
package com.sureli.b2cmarket.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/** 
 * @ClassName:DateUtil 
 * @Description:(这里用一句话描述这个类的作用)  
 */
public class DateUtil {
	private static final DateFormat FORMAT_YYYY_MM_DD_HH_MM_SS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	 * 
	 * @Title: buildLongData 
	 * @Description:(得到一个当前时间的字符串)
	 * @return
	 */
	public static String buildLongData() {
		return FORMAT_YYYY_MM_DD_HH_MM_SS.format(new Date());
	}
	/**
	 * 
	 * @Title: buildLongData 
	 * @Description:(通过date得到当前时间的字符串)
	 * @param date
	 * @return
	 */
	public static String buildLongData(Date date) {
		return FORMAT_YYYY_MM_DD_HH_MM_SS.format(date);
	}
	/**
	 * 
	 * @Title: buildLongData 
	 * @Description:(通过calendar获取当前时间的字符串)
	 * @param calendar
	 * @return
	 */
	public static String buildLongData(Calendar calendar) {
		return FORMAT_YYYY_MM_DD_HH_MM_SS.format(calendar.getTime());
	}
}
