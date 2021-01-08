/**
 * @Company:Sure_li  
 * @Title:OrderDateCountDao.java 
 * @Author:lishuo  
 * @Date:2021-1-7 20:40:34     
 */ 
package com.sureli.b2cmarket.orderdatecount.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sureli.b2cmarket.base.dao.BaseDao;
import com.sureli.b2cmarket.codecountparam.CodeCountParam;
import com.sureli.b2cmarket.orderdatecount.pojo.OrderDateCount;

/** 
 * @ClassName:OrderDateCountDao 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Repository
public interface OrderDateCountDao extends BaseDao<OrderDateCount> {

	/** 
	 * @Title: findAll 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */ 
	List<OrderDateCount> findAll();

	/** 
	 * @Title: findAllYear 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @return  
	 */ 
	List<Integer> findAllYear();

	/** 
	 * @Title: findMonthDateByYear 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param year
	 * @return  
	 */ 
	List<Integer> findMonthDateByYear(Integer year);

	/** 
	 * @Title: findAllByYear 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param year
	 * @return  
	 */ 
	List<CodeCountParam> findAllByYear(Integer year);

	/** 
	 * @Title: findAllByYearAndMonth 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param year
	 * @param month
	 * @return  
	 */ 
	List<CodeCountParam> findAllByYearAndMonth(@Param("year") Integer year,@Param("month")  Integer month);

	/** 
	 * @Title: findOneByDate 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param orderDateCount
	 * @return  
	 */ 
	OrderDateCount findOneByDate(OrderDateCount orderDateCount);

}
