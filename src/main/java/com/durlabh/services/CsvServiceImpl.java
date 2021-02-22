package com.durlabh.services;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.durlabh.document.Model;
import com.durlabh.repositories.ModelRepository;
import com.durlabh.utils.CsvUtil;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
@Service
public class CsvServiceImpl implements CsvService {
	@Autowired
	ModelRepository modelRep;
	public void store(MultipartFile csvfile) {
		
	
			Reader fileReader=null;
			CsvToBean<Model> csvToBean=null;
			List<Model> models=new ArrayList<Model>();
			try (
				Reader reader=new BufferedReader(new InputStreamReader(csvfile.getInputStream()))){
				csvToBean=new CsvToBeanBuilder(reader).withType(Model.class).withIgnoreLeadingWhiteSpace(true).build();
				models= csvToBean.parse();
				modelRep.saveAll(models);
		
		}catch(Exception e) {
			throw new RuntimeException("Fail!->message="+e.getMessage()) ;
		}
		
		
	}
	public List<Model> getAll() {
		return modelRep.findAll();
		
		
	}
	@Override
	public Optional<Model> getDetailsById(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	}
	

	


