package com.durlabh.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.durlabh.document.Model;
import com.durlabh.repositories.ModelRepository;
import com.durlabh.services.CsvServiceImpl;
@Controller
public class MainController {
	@Autowired
	CsvServiceImpl csvFileServices;
	@Autowired
	ModelRepository modelRep;
	
//	@RequestMapping("/{id}")
//	public String displayDetails( @PathVariable(value="id")String id, ModelMap modelMap){
//		//Optional<Model> detail =  csvFileServices.getDetailsById(id);
//		Optional<Model> detail = modelRep.getOne(id);
//		
//   
//		modelMap.addAttribute("details", detail);
//		System.out.println("yeass");
//		return "/WEB-INF/jsps/displayDetails.jsp";
	
	
//}
	  @RequestMapping("/edit/{id}")
	    public String edit(@PathVariable String id, ModelMap modelMap) {
	        modelMap.addAttribute("product", modelRep.findById(id).get());
	        return "edit";
	    }
	 @RequestMapping("/update-player")
	    public String update(@RequestParam String id, @RequestParam Long prodName) {
	        Optional<Model> product = modelRep.findById(id);
	        product.get().setGoal(prodName);
	     
	        modelRep.save(product.get());

	        return "/WEB-INF/jsps/displayPlayers.jsp" ;
	    }
	@RequestMapping("/detail")
	public String displayDetails(@RequestParam String id, ModelMap modelMap){
		
		modelMap.addAttribute("details",modelRep.findById(id).get()
				);
			System.out.print(modelMap);
			
			return "/WEB-INF/jsps/displayDetails.jsp";
	       
	    
	}
	@RequestMapping("/players")
	public String displayPlayers(ModelMap modelMap){
		List<Model> mod= csvFileServices.getAll();
		modelMap.addAttribute("mode", mod);
		
		return "/WEB-INF/jsps/displayPlayers.jsp";
}
}