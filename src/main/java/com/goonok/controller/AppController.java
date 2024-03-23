package com.goonok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goonok.entity.Employee;

@Controller
public class AppController {

	@RequestMapping("/home")
	public String homePage() {

		return "homepage";
	}

	@RequestMapping("/addingEmployee")
	public String addingEmployee() {

		return "add-employee";
	}
	
	@RequestMapping(path = "/employeeAdded", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute Employee employee) {
		System.out.println(employee);
		return "redirect:/addingEmployee";
	}
}
