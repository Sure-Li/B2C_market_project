/**
 * @Company:Sure_li  
 * @Title:BaseDao.java 
 * @Author:lishuo  
 * @Date:2020-12-23 20:47:27     
 */
package com.sureli.b2cmarket.base.dao;

import java.util.List;

/**
 * @ClassName:BaseDao
 * @Description:(这里用一句话描述这个类的作用)
 */
public interface BaseDao<T> {
	/**
	 * 
	 * @Title: save
	 * @Description:(保存一个实例)
	 * @param t
	 * @return 保存成功的个数
	 */
	Integer save(T t);

	/**
	 * 
	 * @Title: update
	 * @Description:(修改一个实例)
	 * @param t
	 * @return 修改成功的个数
	 */
	Integer update(T t);

	/**
	 * 
	 * @Title: delete
	 * @Description:(根据主键ID删除一个实例)
	 * @param rowId
	 * @return 删除的成功的个数
	 */
	Integer delete(Long rowId);

	/**
	 * 
	 * @Title: findOne
	 * @Description:(根据主键ID找到一个实例)
	 * @param rowId
	 * @return 找到的实例
	 */
	T findOne(Long rowId);

	/**
	 * 
	 * @Title: findAll
	 * @Description:(返回表中所有有效的实例)
	 * @return 返回一个list集合
	 */
	List<T> findAll();
}
