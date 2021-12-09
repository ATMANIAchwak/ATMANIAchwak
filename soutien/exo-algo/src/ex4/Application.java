package ex4;

public class Application {
	public static void main(String...  str) {
		CharDetector detector=new CharDetector();
		Boolean resultat= detector.isPresentInTheWord('a', "bateau");
		System.out.println(resultat);
	}
}
