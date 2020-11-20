package com.nt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nt.employeemodel.Employee;

@RestController
public class EmployeeController {
	@RequestMapping(value="/emp",method=RequestMethod.GET,produces= {"application/json","application/xml"})
	public Employee firstpage() {
		Employee emp=new Employee();
		emp.setId("2001");
		emp.setName("Rudra");
		emp.setAdd("odisha");
		emp.setSalary(30000.00);
		return emp;
		
	}

}
