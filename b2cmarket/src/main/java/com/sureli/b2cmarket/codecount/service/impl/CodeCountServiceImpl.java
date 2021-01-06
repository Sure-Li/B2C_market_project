/**
 * @Company:Sure_li  
 * @Title:CodeCountServiceImpl.java 
 * @Author:lishuo  
 * @Date:2021-1-6 11:08:56     
 */
package com.sureli.b2cmarket.codecount.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureli.b2cmarket.codecount.dao.CodeCountDao;
import com.sureli.b2cmarket.codecount.pojo.CodeCount;
import com.sureli.b2cmarket.codecount.service.CodeCountService;
import com.sureli.b2cmarket.util.ConfigUtil;

/**
 * @ClassName:CodeCountServiceImpl
 * @Description:(这里用一句话描述这个类的作用)
 */
@Service
public class CodeCountServiceImpl implements CodeCountService {
	@Autowired
	private CodeCountDao codeCountDao;
	private static HashMap<Long, CodeCount> codeCountLinkedHaspMap = new LinkedHashMap<Long, CodeCount>();
	static {
		CodeCount orderCodeCount = new CodeCount(0, CodeCount.DAY_AUTO_RESET);
		orderCodeCount.setActiveFlag(ConfigUtil.ACTIVE_FLAG_YES);
		orderCodeCount.setCreateBy("sys");
		orderCodeCount.setCreateDate(new Date());
		codeCountLinkedHaspMap.put(1L, orderCodeCount);
	}

	@PostConstruct
	public void codeCountInit() {
		List<CodeCount> codeCountList = codeCountDao.findAll();
		if (codeCountList != null) {
			for (CodeCount codeCount : codeCountList) {
				codeCountLinkedHaspMap.remove(codeCount.getRowId());
			}
		}
		for (Long rowId : codeCountLinkedHaspMap.keySet()) {
			CodeCount orderCodeGet = codeCountLinkedHaspMap.get(rowId);
			codeCountDao.save(orderCodeGet);
		}

	}

	/** 
	 * @Title: getCodeCount 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param l
	 * @return  
	 */  
	@Override
	public int getCodeCount(long l) {
		return codeCountDao.findOne(l).getCodeCount();
	}

	/** 
	 * @Title: update 
	 * @Description:(这里用一句话描述这个方法的作用)
	 * @param codeCount
	 * @return  
	 */  
	@Override
	public Integer update(CodeCount codeCount) {
		CodeCount codeCountget = codeCountDao.findOne(codeCount.getRowId());
		codeCountget.setCodeCount(codeCountget.getCodeCount()+1);
		return codeCountDao.update(codeCountget);
	}

}
