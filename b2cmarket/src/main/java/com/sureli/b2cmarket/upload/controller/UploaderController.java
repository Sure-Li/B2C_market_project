/**
 * @Company:Sure_li  
 * @Title:UploaderController.java 
 * @Author:lishuo  
 * @Date:2020-12-24 14:23:38     
 */
package com.sureli.b2cmarket.upload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sureli.b2cmarket.upload.service.UploadService;

/**
 * @ClassName:UploaderController
 * @Description:(通用的上传功能)
 */
@RestController
@RequestMapping("/upload")
public class UploaderController {
	@Autowired
	private UploadService uploadService;

	/**
	 * 
	 * @Title: doFileUpload
	 * @Description:(通用的上传功能方法)
	 * @param multipartFile 上传的二进制对象
	 * @param filePurpose   文件用途 1用户头像 2产品图片 3
	 * @return
	 */
	@PostMapping
	public String doFileUpload(MultipartFile multipartFile, Integer filePurpose) {
		return uploadService.doFileUpload(multipartFile, filePurpose);
	}
}
