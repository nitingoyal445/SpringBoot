package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.bean.Employee;

@Service
public class EmployeeService {
	
	private static List<Employee> emps= new ArrayList<>();
	
	static {
		emps.add(new Employee(101,"Oliver","CEO",1000000));
		emps.add(new Employee(102,"Felicity","PA",500000));
	}
	
	
	public List<Employee> getAllEmployee(){
		return emps;
		
	}
	
	public Employee getSpecificEmployee(int id) {
		 return emps.stream().filter(t->t.getId()==id).findFirst().get();
	}
	
	public void addEmployee(Employee emp) {
		emps.add(emp);		
	}
	
	public void deleteEmployee(int id) {
		
		emps.removeIf(t->t.getId()==id);
		
	}
	
	public void updateEmployee(int id,Employee emp) {
		
		for(int i=0;i<emps.size();i++) {
			
			Employee temp=emps.get(i);
			if(temp.getId()==id) {
				emps.set(i,emp);
				break;
			}
		
		}
	}
	

}
