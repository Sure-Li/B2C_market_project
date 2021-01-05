/**
 * @Company:Sure_li  
 * @Title:TaskServiceImpl.java 
 * @Author:lishuo  
 * @Date:2021-1-5 16:45:31     
 */
package com.sureli.b2cmarket.task.service.impl;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.order.pojo.Order;
import com.sureli.b2cmarket.task.service.TaskService;
import com.sureli.b2cmarket.util.ConfigUtil;
import com.sureli.b2cmarket.util.DateUtil;

/**
 * @ClassName:TaskServiceImpl
 * @Description:(这里用一句话描述这个类的作用)
 */
@Service
@EnableScheduling
public class TaskServiceImpl implements TaskService {

	/**
	 * @Title: autoJob
	 * @Description:(这里用一句话描述这个方法的作用)
	 */
	@Override
	@Scheduled(cron = "0 0 12 * * ?")
	public void autoJob() {
		Order.orderCodeCount = 0;
		System.out.println("当前时间" + DateUtil.buildLongData() + ConfigUtil.numHandle(Order.orderCodeCount));
	}

}
