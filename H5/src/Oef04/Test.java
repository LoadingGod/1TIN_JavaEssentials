package Oef04;

import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		Medewerker m1 = new Medewerker("Claessens Frankie", 1984, "C145", "Baas", 2500.45);
		Medewerker m2 = new Medewerker("Habraken Hans", 1996, "H201", "Assistent", 2100.67);
		Persoon p1 = new Persoon("Philips Brecht", 1993);
		Klant k1 = new Klant("Mesotten Arno", 1994, "KLA001", 500);
		Klant k2 = new Klant("Patronoudis Hannah", 1996, "KLA002", 700);
		Klant k3 = new Klant("Teuwens Wannes", 1995, "KLA003", 1200);

		Persoon[] pers = { m1, m2, p1, k1, k2, k3 };

		for (int i = 0; i < pers.length; i++) {
			pers[i].drukGegevens();
		}
		
		Persoon oudst = pers[0];
		for (int i = 0; i < pers.length; i++) {
			if (pers[i].getGebJaar() < oudst.getGebJaar()) {
				oudst = pers[i];
			}
		}
		int leeftijdOudst = (new GregorianCalendar().getTime().getYear() - oudst.getGebJaar()) + 1900;
		System.out.println("\nDe oudste persoon is:\n" + "Naam: \t\t" + oudst.getNaam() + "\nLeeftijd:\t" + leeftijdOudst );
	}

}
