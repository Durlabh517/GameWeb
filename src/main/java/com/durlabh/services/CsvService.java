package com.durlabh.services;

import java.io.InputStream;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.durlabh.document.Model;
import java.util.Optional;

public interface CsvService {
	void store(MultipartFile csvfile);
	 
	List<Model> getAll();

	

}
