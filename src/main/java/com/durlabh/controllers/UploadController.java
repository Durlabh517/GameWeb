package com.durlabh.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.durlabh.services.CsvServiceImpl;

@RestController
@RequestMapping("/api")
public class UploadController {
	@Autowired
	CsvServiceImpl csvFileServices;
	@PostMapping("/single")
	public void uploadSingleCSVFile(@RequestBody MultipartFile csvfile) {

		try {
			csvFileServices.store(csvfile.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}}
