package com.sureli.b2cmarket.util;

import java.util.List;


import com.sureli.b2cmarket.catalogue.pojo.Catalogue;

/**
 * @Company:度半 
 * @Title:ConfigUtil.java 
 * @Author:Sure-Li  
 * @Date:2020-12-17 15:48:29     
 */

/**
 * @ClassName:ConfigUtil
 * @Description:(这里用一句话描述这个类的作用)
 */
public class ConfigUtil {
	public final static String PATH_BASE = "upfiles/";
	public final static String PATH_AVATAR = PATH_BASE + "avatar";
	public static final String SESSION_LOGIN_USER_NAME = "loginUser";
	public static final String COOKIE_NAME = "sureli.b2cmarket.cookie";
	public static final String COOKIE_VALUE_SPLIT = "~##~";
	public static final String LOGINOUT_ISREMENBER = "isRemenber";
	public static final String SESSION_USER_CART_MAP = "userCartMap";
	public static final String SESSION_USER_CART_PRICE_SUM = "userCartPriceSum";
	
	public static final int ACTIVE_FLAG_YES = 1;
	public static final int ACTIVE_FLAG_NO = 0;

	public static final String FUNCTION_SUCCESS = "success";
	public static final String FUNCTION_FAIL = "fail";
	
	//排序方法
	public static List<Catalogue> sort(Long parentId, List<Catalogue> itemCatsBeforeList, List<Catalogue> itemCatsAfterList) {
		for (Catalogue entity : itemCatsBeforeList) {
			if (Long.parseLong(entity.getParentId()) == parentId) {
				itemCatsAfterList.add(entity);
				sort(entity.getRowId(), itemCatsBeforeList, itemCatsAfterList);
			}
		}
		return itemCatsAfterList;
	}
	public static String numHandle(int num) {
		String result;
		if(num<10) {
			result="0000"+num;
		}else if(num<100&&10<num) {
			result="000"+num;
		}else if(num<1000&&100<num) {
			result="00"+num;
		}else if(num<10000&&100<num) {
			result="0"+num;
		}else {
			result=""+num;
		}
		return result;
	}
}
