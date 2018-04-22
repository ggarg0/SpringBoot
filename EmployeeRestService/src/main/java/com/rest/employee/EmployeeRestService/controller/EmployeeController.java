package com.rest.employee.EmployeeRestService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.employee.EmployeeRestService.entity.Employee;
import com.rest.employee.EmployeeRestService.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> retrieveAllEmployees() {
		return employeeService.retrieveAllEmployees();
	}

	@GetMapping("/employee/{id}")
	public Employee retrieveEmployee(@PathVariable int id) {
		return employeeService.retrieveEmployee(id);
	}	

	@PostMapping("/employees")
	public void createEmployee(@RequestBody Employee employee){
		Employee savedEmployee = employeeService.createEmployee(employee);
	}
}
