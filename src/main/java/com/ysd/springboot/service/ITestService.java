package com.ysd.springboot.service;

import org.springframework.web.multipart.MultipartFile;

public interface ITestService {
	boolean batchImport(String fileName, MultipartFile file) throws Exception;

}
