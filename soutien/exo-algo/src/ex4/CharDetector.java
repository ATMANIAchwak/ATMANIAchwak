package ex4;
/**Exo 04**/
public class CharDetector {

	public static Boolean isPresentInTheWord(Character c , String mot) {
		Boolean resultat =false;
		for (int i= 0; i<mot.length();i++) {
			if (c.equals(mot.charAt(i))) {  return true;}
			 
		}		 
		return resultat;
	}
}
