package com.goonok.dao;

import java.util.List;

import com.goonok.entity.Employee;

public interface Dao {

	public int register(Employee employee);
	
	public void update(int id);

	public Employee getEmployeeById(int id);
	
	public void deleteEmployeeById(int id);
	
	public List<Employee> getAllEmployee();
}
