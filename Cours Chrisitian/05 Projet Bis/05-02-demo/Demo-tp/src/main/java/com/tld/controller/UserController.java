package com.tld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class UserController {

	@GetMapping("/users/list")
	public String listAllUsers( Model theModel) {
		return "list-users";
	}
}
