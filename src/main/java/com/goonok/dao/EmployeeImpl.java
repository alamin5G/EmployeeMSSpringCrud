package com.goonok.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.goonok.entity.Employee;

@Repository
public class EmployeeImpl implements Dao{

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public int register(Employee employee) {
		int i = (int) hibernateTemplate.save(employee);
		return i;
	}

	@Transactional
	@Override
	public void update(Employee employee) {
		hibernateTemplate.update(employee);		
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee = hibernateTemplate.get(Employee.class, id);
		return employee;
	}

	@Transactional
	@Override
	public void deleteEmployeeById(int id) {
		Employee employee = hibernateTemplate.get(Employee.class, id);
		hibernateTemplate.delete(employee);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employeeList = hibernateTemplate.loadAll(Employee.class);
		return employeeList;
	}
	
	
}
