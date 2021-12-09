package com.tld;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	@GetMapping("/")
	public String helloController() {
		System.out.println("hello controller");	
		return "home";
	}
		
	@GetMapping("afficheFormulaire")
	public String afficheSalutationForm(Model leModel) {
		System.out.println("j'ai bien reçu la demande d'accès au formulaire");
		leModel.addAttribute("utilisateur",new Utilisateur());
		return "utilisateur-form";
	}
	
	@RequestMapping("processForm")
	public String receptionneSalutationForm(@ModelAttribute Utilisateur unUtilisateur) {
    	
		return "utilisateur-view";	
	}
}













