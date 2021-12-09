package com.tld;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String helloController() {
		System.out.println("hello controller");	
		return "home";
	}
		
	@GetMapping("getSalutationForm")
	public String afficheSalutationForm() {
		System.out.println("j'ai bien reçu l'appel depuis le lien a");
		return "salutation-form";
	}
	
	@GetMapping("postSalutationForm")
	public String receptionneSalutationForm(HttpServletRequest request, Model model) {
		String leNom=request.getParameter("userName");	
		leNom= leNom.toUpperCase();	
		String result = "Yo ! " +leNom;	
		model.addAttribute("message", result);
		return "salutation-message";	
	}
}













