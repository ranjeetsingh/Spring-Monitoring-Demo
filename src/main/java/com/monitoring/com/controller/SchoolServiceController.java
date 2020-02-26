package com.monitoring.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.monitoring.com.service.StudentServiceDelegate;

@RestController
public class SchoolServiceController {
	@Autowired
	StudentServiceDelegate studentServiceDelegate;

	@RequestMapping(value = "/getSchoolDetails/{schoolname}", method = RequestMethod.GET)
	public String getStudents(@PathVariable String schoolname) {
		System.out.println("Going to call student service to get data!");
		return studentServiceDelegate.callStudentServiceAndGetData(schoolname);
	}
	
	@GetMapping(value = "/microservice3")
	public String method3() {
		return studentServiceDelegate.method3();
	}
}
