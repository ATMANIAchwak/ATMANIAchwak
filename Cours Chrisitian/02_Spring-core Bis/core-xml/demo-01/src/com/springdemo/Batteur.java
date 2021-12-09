package com.springdemo;

public class Batteur implements Musicien {

	private PrepareService prepareService;
	private String emailAddresse;
	private String site;
	
	@Override
	public String joueTaPartition() {
		 
		return  "je joue du tambours";
	}

	@Override
	public String getPrepa() {
		 
		return  prepareService.getPreparation();
	}
	
	public Batteur () {
		System.out.println("Batteur : à l'intérieur du constructeur sans paramètre");
	}

	public void setPrepareService(PrepareService prepareService) {
		System.out.println("Batteur : à l'intérieur de la methode set - setPrepareService");
		this.prepareService = prepareService;
	}

	public String getEmailAddresse() {
		return emailAddresse;
	}

	public void setEmailAddresse(String emailAddresse) {
	System.out.println("Batteur : à l'intérieur de la methode set - setEmailAddresse");
		this.emailAddresse = emailAddresse;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		System.out.println("Batteur : à l'intérieur de la methode set - setSite");
		this.site = site;
	}

	public Batteur(PrepareService prepareService) {
		super();
		this.prepareService = prepareService;
	}
	
	public void myInitMethod() {
		System.out.println("méthode init de java pour le batteur ");
		
	}
	
	public void myDestroyMethod() {
		System.out.println("méthode de destroy de Batteur");
	}

}
