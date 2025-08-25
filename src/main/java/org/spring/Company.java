package org.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	@Autowired
	private Employee employee;
	public void setEmployee(Employee employee) {
		this.employee=employee;
	}
	public Employee getEmployee() {
		
		return employee;
	}
	public void show() {
	System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSal());

	}
}
