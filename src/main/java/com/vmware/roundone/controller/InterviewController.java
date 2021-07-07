package com.vmware.roundone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vmware.roundone.entity.Employee;
import com.vmware.roundone.exception.CustomException;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins="http://localhost:4200")
public class InterviewController {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	@GetMapping("/employee/{eid}")
	public Employee getEmployee(@PathVariable String eid) {
		
		throw new CustomException("Test exception");
		
		//return new Employee("3", "ghi");
	}
	
	@GetMapping(path="/employee", 
				produces= {MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Employee> getEmployeeWithStatus() {
		logger.info("Response entity returned with status code");
		return new ResponseEntity<Employee>(new Employee("1", "Test"), HttpStatus.FOUND);
	}
	
	@GetMapping("/employee/test")
	public String getEmployeeWithparam(@RequestParam(value="page") int page, 
										@RequestParam(value="limit") int limit,
										@RequestParam(value="sort", defaultValue="asc", required=false) String sort) {
		
		return "Test Request Param:" +page+ " || "+limit + " || "+sort;
	}
	
	
	
}
