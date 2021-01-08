/**
 * @Company:Sure_li  
 * @Title:TaskServiceImpl.java 
 * @Author:lishuo  
 * @Date:2021-1-5 16:45:31     
 */
package com.sureli.b2cmarket.task.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.codecount.dao.CodeCountDao;
import com.sureli.b2cmarket.codecount.pojo.CodeCount;
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
	@Autowired
	private CodeCountDao codeCountDao;
	

	/**
	 * @Title: autoJob
	 * @Description:(用于每天零点清零订单号)
	 */
	@Override
	@Scheduled(cron = "0 0 0 * * ?")
	public void autoJob() {
		CodeCount codeCountget = codeCountDao.findOne(1L);
		codeCountget.setCodeCount(0);
		codeCountDao.update(codeCountget);
		System.out.println("当前时间" + DateUtil.buildLongData() + ConfigUtil.numHandle(Order.orderCodeCount));
	}
	//此处可以做到让任务自动在12点清算每天的订单数 但是感觉有点鸡肋 
	//	因为我是每次生成订单的时候便会判断是订单统计记录++还是创建新的订单统计记录
}
