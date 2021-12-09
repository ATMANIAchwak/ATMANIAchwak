package com.springdemo;

public class Pianiste implements Musicien {

	private PrepareService service;

	public Pianiste(PrepareService service) {
		this.service = service;
	}

	@Override
	public String joueTaPartition() {

		return "Je joue du pino Debout";
	}

	@Override
	public String getPrepa() {
		return service.getPreparation() 
				;

	}







}
