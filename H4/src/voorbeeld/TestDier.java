package voorbeeld;


public class TestDier {
	public static void main(String [] args) {
		Dier d1 = new Dier("olifant", "herbivoor");
		Hond h1 = new Hond ("Lassie");
		Hond h2 = new Hond ("Bessie", "Terrier", 2008);

		System.out.println("d1 : "+d1);
		System.out.println("h1 : "+h1);
		System.out.println("h2 : "+h2);
		System.out.println("h2 is geboren in " + h2.geefGeboorteJaar());
	}
}
