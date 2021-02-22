package com.durlabh.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.durlabh.document.Model;
import com.durlabh.repositories.ModelRepository;
import com.durlabh.services.CsvServiceImpl;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@RestController
@RequestMapping("/api")
public class UploadController {
	@Autowired
	CsvServiceImpl csvFileServices;
	@Autowired
	ModelRepository modelRep;
	
	
//	@RequestMapping("/Detailsss")
//	public ResponseEntity<Model> displayDetails( @PathVariable("id") String id, ModelMap modelMap){
//		//Optional<Model> detail =  csvFileServices.getDetailsById(id);
//	
//		   Optional<Model> customer = modelRep.findById(id);
//			System.out.print("aaaa");
//	        return customer.map(response -> ResponseEntity.ok().body(response))
//	                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
//	    
//
//}
	
	@PostMapping("/single")
	public void uploadSingleCSVFile(@RequestParam("csvfile") MultipartFile csvfile) {
try {
	csvFileServices.store(csvfile);
		System.out.println("Stored Successfully");
}catch(Exception e)
{
	e.printStackTrace();
}


}
		
		
	
		
	}
