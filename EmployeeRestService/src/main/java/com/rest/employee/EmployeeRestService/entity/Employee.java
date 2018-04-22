package com.rest.employee.EmployeeRestService.entity;

import java.util.Date;

public class Employee {

		private int employeeId;
		private String employeeFirstName;
		private String employeeLastName;
		private String employeeMail;
		private String employeePhone;
		private Date employeeBirthdate;
		
		protected Employee() {
			
		}

		public Employee(int employeeId, String employeeFirstName, 
				String employeeLastName, String employeeMail,
				String employeePhone, Date employeeBirthdate) {
			super();
			this.employeeId = employeeId;
			this.employeeFirstName = employeeFirstName;
			this.employeeLastName = employeeLastName;
			this.employeeMail = employeeMail;
			this.employeePhone = employeePhone;
			this.employeeBirthdate = employeeBirthdate;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeFirstName() {
			return employeeFirstName;
		}

		public void setEmployeeFirstName(String employeeFirstName) {
			this.employeeFirstName = employeeFirstName;
		}

		public String getEmployeeLastName() {
			return employeeLastName;
		}

		public void setEmployeeLastName(String employeeLastName) {
			this.employeeLastName = employeeLastName;
		}

		public String getEmployeeMail() {
			return employeeMail;
		}

		public void setEmployeeMail(String employeeMail) {
			this.employeeMail = employeeMail;
		}

		public String getEmployeePhone() {
			return employeePhone;
		}

		public void setEmployeePhone(String employeePhone) {
			this.employeePhone = employeePhone;
		}

		public Date getEmployeeBirthdate() {
			return employeeBirthdate;
		}

		public void setEmployeeBirthdate(Date employeeBirthdate) {
			this.employeeBirthdate = employeeBirthdate;
		}

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName
					+ ", employeeLastName=" + employeeLastName + ", employeeMail=" + employeeMail + ", employeePhone="
					+ employeePhone + ", employeeBirthdate=" + employeeBirthdate + "]";
		}

		

	}

