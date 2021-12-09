package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	

		
		// accéder au bean géré par le spring container
		Trompetiste a= context.getBean("trompetiste", Trompetiste.class);

		Trompetiste b= context.getBean("trompetiste", Trompetiste.class);
		 
		// utiliser les methode de musicien
		// . . . etc

		 System.out.println("a et b référencent le même objet : "+(a==b));
		 System.out.println("a référence l'adresse mémoire : "+a);
		 System.out.println("b référence l'adresse mémoire : "+b);
		context.close();
	}

}
