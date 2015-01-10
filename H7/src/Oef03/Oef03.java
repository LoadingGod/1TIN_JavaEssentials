package Oef03;
import java.util.ArrayList;
import java.util.Iterator;

public class Oef03 {

	public static void main(String[] args) {
		ArrayList<Kamer> kamers = new ArrayList<Kamer>();
		kamers.add(new Kamer("z001", "luxe"));
		String[] strKamer = { "z001", "z002", "z003", "z004", "z005" };
		String[] strLux = { "luxe", "standaard", "luxe", "standaard",
				"standaard" };

		for (int i = 0; i < strKamer.length; i++) {
			if (kamers.indexOf(new Kamer(strKamer[i], strLux[i])) == -1) {
				kamers.add(new Kamer(strKamer[i], strLux[i]));
			} else {
				System.out.println("Kamer " + strKamer[i] + " bestaat al!");
			}

		}
		System.out.println("\nLijst kamers: ");
		for (Kamer k : kamers) {
			k.printgegevens();
		}

		ArrayList<Gast> gasten = new ArrayList<Gast>();
		int[] gastnrs = { 34, 334, 22, 77, 88 };
		String[] gastnamen = { "Zoons Pieters", "Peeters Wim", "Maes Guido",
				"Daems Greta", "Goos Mark" };
		String[] landnamen = { "Nederlands", "Duitsland", "Belgie",
				"Nederland", "Nederland" };
		
		for (int i = 0; i < gastnamen.length; i++) {
			gasten.add(new Gast(gastnrs[i], gastnamen[i], landnamen[i]));
		}
		
		kamers.get(0).setGast(gasten.get(0));
		kamers.get(1).setGast(gasten.get(1));
		
		System.out.println("\nLijst kamers met gasten:");
		for (Kamer k : kamers) {
			k.printgegevens();
		}
		
		System.out.println("\nLijst gasten ingeboekt:");		
		for (int i = 0; i < gasten.size(); i++) {
			if (kamers.get(i).getGast() != null) {
				Gast g = gasten.get(i);
				g.drukAf();	
			}
			
		}
		
		System.out.println("Uitboeken z002");
		Kamer z002 = kamers.get(kamers.indexOf(new Kamer("z002", "")));
		z002.uitboekenKamer();
		
		System.out.println("\nLijst kamers met gasten:");
		for (Kamer k : kamers) {
			k.printgegevens();
		}
	}
}