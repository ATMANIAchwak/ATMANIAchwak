package ex3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
* stocker des mots uniques ( sans doublon) dans une liste coder le programme
* qui ajoute et qui supprime des mots dans cette liste tout en garantissant
* l'absence de doublons"
* 
* @author christian
*
*/

public class NoDoublon {

	private   Set<String> liste= new HashSet<>(Arrays.asList("Norbert", "dinausore" ,"lal", "grincheux ", "quasimodo"));


	public Set<String> getListe() {
		return liste;
	}


	public void setListe(Set<String> liste) {
		this.liste = liste;
	}
	
	 
	 
	
}
