package com.goonok.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goonok.dao.Dao;
import com.goonok.entity.Employee;

@Controller
public class AppController {

	@Autowired
	Dao dao;
	
	@RequestMapping("/home")
	public String homePage() {

		return "homepage";
	}

	@RequestMapping("/addingEmployee")
	public String addingEmployee() {

		return "add-employee";
	}

	@RequestMapping(path = "/employeeAdded", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute Employee employee, HttpSession session) {
		
		dao.register(employee);
		session.setAttribute("msg", "Employee Registration is Success!");
		return "redirect:/addingEmployee";
	}
}
