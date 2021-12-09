package com.tld;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@Value("#{paysListe}")
	private Map<String, String> paysListe;
	
	@GetMapping("/")
	public String helloController() {
		System.out.println("hello controller");	
		return "home";
	}
		
	@GetMapping("afficheFormulaire")
	public String afficheSalutationForm(Model leModel) {
		System.out.println("j'ai bien reçu la demande d'accès au formulaire");
		leModel.addAttribute("utilisateur",new Utilisateur());
		leModel.addAttribute("laListeDesPays", paysListe );
		return "utilisateur-form"; 
	}
	
	@RequestMapping("processForm")
	public String receptionneSalutationForm(@ModelAttribute Utilisateur unUtilisateur) {
    	
		return "utilisateur-view";	
	}

	public Map<String, String> getPaysListe() {
		return paysListe;
	}

	public void setPaysListe(Map<String, String> paysListe) {
		this.paysListe = paysListe;
	}
}













