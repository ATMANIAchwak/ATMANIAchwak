package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Trompetiste implements Musicien {

	@Value("${email}")
	private int email;
	
	@Value("${site}")
	private String site;
	
	
@Autowired
@Qualifier("zenPreparationService")
	private PrepareService prepareService;
	
	
	
	@Override
	public String joueTaPartition() {
		return "trompete chanson ...";
	}



	@Override
	public String preparesToi() {
		return prepareService.preparesToi();
		}

//
//@Autowired
//	public void setPrepareService(PrepareService prepareService) {
//	System.out.println("monitoring du setter de la dependance ");
//		this.prepareService = prepareService;
//	}



	public PrepareService getPrepareService() {
		return prepareService;
	}



	 



	 



	public String getSite() {
		return site;
	}



	public void setSite(String site) {
		this.site = site;
	}



	public int getEmail() {
		return email;
	}



	public void setEmail(int email) {
		this.email = email;
	}



//	@Autowired
//	public Trompetiste(PrepareService prepareService) {
//		
//		this.prepareService = prepareService;
//	}



}
