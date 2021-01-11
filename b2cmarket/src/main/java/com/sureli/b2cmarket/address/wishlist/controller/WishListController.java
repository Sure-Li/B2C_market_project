/**
 * @Company:Sure_li  
 * @Title:WishListController.java 
 * @Author:lishuo  
 * @Date:2021-1-9 8:18:28     
 */
package com.sureli.b2cmarket.address.wishlist.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sureli.b2cmarket.address.wishlist.pojo.WishList;
import com.sureli.b2cmarket.address.wishlist.service.WishListService;
import com.sureli.b2cmarket.util.ConfigUtil;
import com.sureli.b2cmarket.util.ServletUtil;

/**
 * @ClassName:WishListController
 * @Description:(这里用一句话描述这个类的作用)
 */
@RestController
@RequestMapping("wishlist/")
public class WishListController {
	@Autowired
	private WishListService wishListService;

	@PostMapping("delete")
	public Integer doDelete(Long rowId) {
		return wishListService.doDelete(rowId);
	}

	@PostMapping("add")
	public Integer doAdd(String rowId, HttpSession session) {
		WishList wishListGet = wishListService.findOne(rowId);
		if(wishListGet != null) {
			if(wishListGet.getActiveFlag()==ConfigUtil.ACTIVE_FLAG_YES) {
				wishListGet.setActiveFlag(ConfigUtil.ACTIVE_FLAG_NO);
			}else {
				wishListGet.setActiveFlag(ConfigUtil.ACTIVE_FLAG_YES);
			}
		}else {
			WishList wishList = new WishList(ServletUtil.getUserCodeBySession(session), rowId);
			wishList.setCreateBy(ServletUtil.getUserBySession(session).getUserName());
			wishList.setCreateDate(new Date());
			return wishListService.doAdd(wishList);
		}
		return wishListService.update(wishListGet);
	}

	@GetMapping("wishlistcount")
	public Integer doWishListCount(HttpSession session) {
		Integer result = new Integer(0);
		String userCode = ServletUtil.getUserCodeBySession(session);
		if (userCode != null) {
			List<WishList> wishListGet = wishListService.findAll(userCode);
			result = wishListGet.size();
		}
		return result;
	}
}
