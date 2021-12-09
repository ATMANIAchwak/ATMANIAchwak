package com.springdemo;

public class Violoniste implements Musicien{

	private PrepareService service;
	
	
	public Violoniste(PrepareService service) {
		System.out.println("je suis le constructeur de Violoniste");
		this.service = service;
	}
	
	@Override
	public String joueTaPartition()  {		
		return "je joue la vase à 3 temps";
	}

	@Override
	public String getPrepa() {
		return service.getPreparation();
		
	}

 



	
	
}
