package com.springdemo;

import org.springframework.stereotype.Component;

@Component("monMusicien")
public class Violoniste implements Musicien{

	@Override
	public String joueTaPartition() {
		 
		return "je joue la valse à 3 temps";
	}

	@Override
	public String preparesToi() {
		// TODO Auto-generated method stub
		return null;
	}

//	public Violoniste() {
		//System.out.println("je suis le contructeur sans paramètre de Violoniste");
//	}

 
}
