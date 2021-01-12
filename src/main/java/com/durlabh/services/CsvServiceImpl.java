package com.durlabh.services;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durlabh.document.Model;
import com.durlabh.repositories.ModelRepository;
import com.durlabh.utils.CsvUtil;
@Service
public class CsvServiceImpl implements CsvService {
	@Autowired
	ModelRepository modelRep;
	public Model store(InputStream file) {
		
		try {
			List<Model> modelss=CsvUtil.parseCsvFile(file);
			return (Model) modelRep.saveAll(modelss);
		}catch(Exception e) {
			throw new RuntimeException("Fail!->message="+e.getMessage()) ;
		}
		
		
	}
	

	

}
