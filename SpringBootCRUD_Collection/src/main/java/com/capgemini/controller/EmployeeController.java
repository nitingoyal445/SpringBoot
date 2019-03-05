package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bean.Employee;
import com.capgemini.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployee(){
		
		return employeeService.getAllEmployee();
		
	}
	
	@RequestMapping("/employee/{id}")
	public Employee getSpecificEmployee(@PathVariable int id) {
		
		return employeeService.getSpecificEmployee(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addedEmployee")
	public void addEmployee(@RequestBody Employee emp) {
		
		employeeService.addEmployee(emp);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updateEmployee/{id}")
	public void updateEmployee(@PathVariable int id,@RequestBody Employee emp) {
		
		employeeService.updateEmployee(id, emp);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		
		employeeService.deleteEmployee(id);
	}
}

