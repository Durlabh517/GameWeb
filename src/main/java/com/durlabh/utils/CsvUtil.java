package com.durlabh.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
//
//import org.apache.commons.csv.CSVFormat;
import com.durlabh.document.Model;
import com.opencsv.CSVParser;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CsvUtil {
	public static List<Model> parseCsvFile(InputStream file){
		
	
		Reader fileReader=null;
		CsvToBean<Model> csvToBean=null;
		List<Model> models=new ArrayList<Model>();
		try (
			Reader reader=new BufferedReader(new InputStreamReader(file))){
			csvToBean=new CsvToBeanBuilder(reader).withType(Model.class).withIgnoreLeadingWhiteSpace(true).build();
			models= csvToBean.parse();
			return models;
			
			
		}catch(Exception e) {
			System.out.println("Reading CSV Error");
			e.printStackTrace();
		}finally {
			try {
				fileReader.close();
				
			}catch(IOException e) {
				System.out.println("Closing fileReader");
				e.printStackTrace();
			}
		}
		
		return models;

		
		
	}
		

}
//String[] CSV_HEADER= {
//		
//		"ranking",
//		" seasonid",
//		"seasonName",
//		"tournamentId",
//	" tournamentRegionId",
//		" tournamentRegionCode",
//		"regionCode",
//		" tournamentName",
//		" tournamentShortName",
//		" firstName",
//		"lastName",
//		" playerId",
//		" isActive",
//	" isOpta",
//	" teamId",
//		" teamName",
//		"playedPositions",
//		" age",
//		" height",
//		" weight",
//		" positionText",
//		" apps",
//
//		"subOn",
//		" minsPlayed",
//		"rating",
//		"goal",
//		" assistTotal",
//		" yellowCard",
//	" redCard",
//		" shotsPerGame",
//	" serialWonPerGame",
//	" manOfTheMatch",
//	   "name",
//	 "isManOfTheMatch",
//	    "playedPostionsShort",
//	   "passSuccess"
//};
//Reader fileReader=null;
//CsvToBean<Model> csvToBean=null;
//List<Model> models=new ArrayList<Model>();
//try {
//	fileReader=new InputStreamReader(is);
//	ColumnPositionMappingStrategy<Model> mappingStrategy= new ColumnPositionMappingStrategy<Model>();
//	mappingStrategy.setType(Model.class);
//	mappingStrategy.setColumnMapping(CSV_HEADER);
//	csvToBean= new CsvToBeanBuilder<Model>(fileReader).withMappingStrategy(mappingStrategy).withSkipLines(1).withIgnoreLeadingWhiteSpace(true).build();
//	models=csvToBean.parse();
//	return models;
//	
//	
//}catch(Exception e) {
//	System.out.println("Reading CSV Error");
//	e.printStackTrace();
//}finally {
//	try {
//		fileReader.close();
//		
//	}catch(IOException e) {
//		System.out.println("Closing fileReader");
//		e.printStackTrace();
//	}
//}
//
//return models;





//BufferedReader fileReader=null;
//CSVParser parser = null;
//List<Model> models=new ArrayList<Model>();
//try {
//	fileReader=new BufferedReader(new InputStreamReader(is, "UTF-8"));
//parser=new CSVParser(fileReader , 
//	CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
//	
//	
//	
//	
//	
//}catch(Exception e) {
//	System.out.println("Reading Csv Error ");
//	e.printStackTrace();
//}finally {
//	
//}
//
//return null;
//
