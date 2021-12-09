package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {

	public static void main(String[] args) {
		//load spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");	
	 	Musicien musicienA = context.getBean("monMusicien", Musicien.class);  
	 	
	 	System.out.println("-----------------------");
	   System.out.println(musicienA.joueTaPartition());
	   System.out.println(musicienA.getPrepa());
	 	System.out.println("-----------------------");
	 	context.close();
	}

}
