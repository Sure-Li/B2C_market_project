/**
 * @Company:Sure_li  
 * @Title:UploadServiceImpl.java 
 * @Author:lishuo  
 * @Date:2020-12-28 16:47:56     
 */
package com.sureli.b2cmarket.upload.service.impl;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sureli.b2cmarket.upload.service.UploadService;

/**
 * @ClassName:UploadServiceImpl
 * @Description:(这里用一句话描述这个类的作用)
 */
@Service("uploadService")
public class UploadServiceImpl implements UploadService {
	private static Map<Integer, String> pathMap = new HashMap<Integer, String>();
	static {
		pathMap.put(1, "fileb2cmarket/avatar/");
		pathMap.put(2, "fileb2cmarket/product/");
	}

	/**
	 * @Title: doFileUpload
	 * @Description:(通用文件上传服务层的实现类)
	 * @param multipartFile
	 * @param filePurpose
	 * @return
	 */
	@Override
	public String doFileUpload(MultipartFile multipartFile, Integer filePurpose) {
		StringBuilder filePath = new StringBuilder();
		if (!multipartFile.isEmpty()) {
			// 结果
			StringBuilder stringBuilder = new StringBuilder();
			// 上传文件名
			String fileName = multipartFile.getOriginalFilename();
			// 文件后缀
			String fileSuffix = fileName.substring(fileName.lastIndexOf("."));
			// 绝对路径
			String realPath = "E:/B2C_market_project/b2cmarket/";

			filePath.append(pathMap.get(filePurpose)).append(Calendar.getInstance().getTimeInMillis())
					.append(fileSuffix);
			stringBuilder.append(realPath).append(filePath.toString());
			System.out.println(stringBuilder.toString());
			java.io.File outFile = new java.io.File(stringBuilder.toString());
			java.io.File getParentFile = outFile.getParentFile();
			if (!getParentFile.exists()) {
				getParentFile.mkdirs();
			}
			try {
				multipartFile.transferTo(new java.io.File(stringBuilder.toString()));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return filePath.toString();
	}

}
