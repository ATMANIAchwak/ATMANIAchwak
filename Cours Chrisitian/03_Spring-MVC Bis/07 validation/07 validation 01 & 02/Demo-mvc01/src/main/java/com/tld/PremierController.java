package com.tld;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PremierController {
	 
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,  stringTrimmerEditor);
	}
	
	
	@GetMapping("/")
	public String helloController() {
	 
		return "home";
	}
	 
	@GetMapping("/afficheFormulaire")
	public String showForm(Model leModel) {
		
		leModel.addAttribute("personnage", new Personnage());
		return "personnage-form";
	}
 
	
	@PostMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("personnage") Personnage unPersonnage,
			BindingResult leBindingResult) {
		if(leBindingResult.hasErrors()) {return "personnage-form";}
		else return "personnage-vue";
	}
}













