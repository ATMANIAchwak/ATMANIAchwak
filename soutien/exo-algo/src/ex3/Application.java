package ex3;

import java.util.Set;

public class Application {

	public static void main(String[] args) { 
		NoDoublon o= new NoDoublon();
		Set<String> l=o.getListe();
		System.out.println("premiere affichage "+l);
		
		System.out.println(o.getListe().add("norbert")); 
		System.out.println(o.getListe().add("batman")); 
   
		System.out.println("seconde  affichage "+l);
	}

}
