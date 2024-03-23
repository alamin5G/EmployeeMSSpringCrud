package com.goonok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/home")
	public String homePage() {

		return "homepage";
	}

	@RequestMapping("/addingEmployee")
	public String addEmployee() {

		return "add-employee";
	}
}
