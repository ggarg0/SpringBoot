package com.rest.employee.EmployeeRestService.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rest.employee.EmployeeRestService.entity.Employee;

@Repository
public class EmployeeDao {

	private static List<Employee> employees = new ArrayList<>();

	private static int employeesCount = 3;
	
	static {
		employees.add(new Employee(10001, "Gaurav", "Garg", "ggarg@gmail.com", 
				"9827166315", new Date()));
		employees.add(new Employee(10002, "Nikki", "Garg", "ngarg@gmail.com", 
				"7022846005", new Date()));
		employees.add(new Employee(10003, "Riaan", "Garg", "rgarg@gmail.com", 
				"7292025920", new Date()));
	}
	
	public List<Employee> retrieveAllEmployees() {
		return employees;
	}

	public Employee retrieveEmployee(int id) {
		for (Employee employee : employees) {
			if (employee.getEmployeeId() == id) {
				return employee;
			}
		}
		return null;
	}

	public Employee createEmployee(Employee employee) {
		if (employee.getEmployeeId() == 0) {
			employee.setEmployeeId(++employeesCount);
		}
		employees.add(employee);
		return employee;
	}

}
