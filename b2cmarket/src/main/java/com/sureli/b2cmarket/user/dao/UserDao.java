/**
 * @Company:Sure_li  
 * @Title:UserDao.java 
 * @Author:lishuo  
 * @Date:2020-12-23 20:45:55     
 */
package com.sureli.b2cmarket.user.dao;

import org.springframework.stereotype.Repository;

import com.sureli.b2cmarket.base.dao.BaseDao;
import com.sureli.b2cmarket.user.pojo.User;

/**
 * @ClassName:UserDao
 * @Description:(用户的dao层的接口)
 */
@Repository
public interface UserDao extends BaseDao<User> {

}
