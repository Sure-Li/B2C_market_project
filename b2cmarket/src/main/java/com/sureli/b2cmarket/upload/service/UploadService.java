/**
 * @Company:Sure_li  
 * @Title:UploadService.java 
 * @Author:lishuo  
 * @Date:2020-12-28 16:47:20     
 */ 
package com.sureli.b2cmarket.upload.service;

import org.springframework.web.multipart.MultipartFile;

/** 
 * @ClassName:UploadService 
 * @Description:(这里用一句话描述这个类的作用)  
 */
public interface UploadService {

	/** 
	 * @Title: doFileUpload 
	 * @Description:(同于文件上传)
	 * @param multipartFile
	 * @param filePurpose
	 * @return  
	 */ 
	String doFileUpload(MultipartFile multipartFile, Integer filePurpose);

}
