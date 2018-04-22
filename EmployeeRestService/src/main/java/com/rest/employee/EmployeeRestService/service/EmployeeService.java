package com.rest.employee.EmployeeRestService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.employee.EmployeeRestService.dao.EmployeeDao;
import com.rest.employee.EmployeeRestService.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> retrieveAllEmployees() {
		return employeeDao.retrieveAllEmployees();
	}

	public Employee retrieveEmployee(int id) {
		return employeeDao.retrieveEmployee(id);
	}

	public Employee createEmployee(Employee employee) {
		return employeeDao.createEmployee(employee);
	}
	


}
