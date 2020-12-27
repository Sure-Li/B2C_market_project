/**
 * @Company:Sure_li  
 * @Title:CatalogueController.java 
 * @Author:lishuo  
 * @Date:2020-12-27 22:44:11     
 */ 
package com.sureli.b2cmarket.catalogue.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sureli.b2cmarket.catalogue.pojo.Catalogue;
import com.sureli.b2cmarket.catalogue.service.CatalogueService;
import com.sureli.b2cmarket.util.ServletUtil;

/** 
 * @ClassName:CatalogueController 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Controller
@RequestMapping("catalogue")
public class CatalogueController {
	@Autowired
	private CatalogueService catalogueService;
	@GetMapping("/list")
	public ModelAndView getUserList(Catalogue searchCatalogue, ModelAndView modelAndView) {
		List<Catalogue> catalogueList = catalogueService.findBySearch(searchCatalogue);
		System.out.println(searchCatalogue);
		System.out.println("catalogueList"+catalogueList);
		modelAndView.addObject("catalogueList", catalogueList);
		modelAndView.setViewName("admin/catalogue/catalogue_list");
		return modelAndView;
	}
	@GetMapping("/form")
	public ModelAndView goAddForm(ModelAndView modelAndView) {
		modelAndView.setViewName("admin/catalogue/catalogue_add");
		return modelAndView;
	}
	@ResponseBody
	@PostMapping
	public Integer doAddUser(Catalogue catalogue, HttpSession session) {
		String createBy = ServletUtil.getUserCodeBySession(session);
		catalogue.setCreateBy(createBy);
		return catalogueService.doRegister(catalogue);
	}
	
	@ResponseBody
	@GetMapping("/delete/{rowId}")
	public Integer doDelete(@PathVariable Long rowId) {
		System.out.println("@PathVariable Long rowId" +rowId);
		return catalogueService.delete(rowId);
	}
	@GetMapping("/edit/{rowId}")
	public ModelAndView goUserEdit(@PathVariable Long rowId, ModelAndView modelAndView) {
		System.out.println(rowId);
		Catalogue catalogue = catalogueService.findOne(rowId);
		System.out.println(catalogue);
		modelAndView.addObject("catalogue", catalogue);
		modelAndView.setViewName("admin/catalogue/catalogue_add");
		return modelAndView;
	}
	@ResponseBody
	@PostMapping("/doedit")
	public Integer doUserEdit(Catalogue catalogue) {
		System.out.println("catalogue"+catalogue);
		int result = catalogueService.update(catalogue);
		return result;	
	}
}
