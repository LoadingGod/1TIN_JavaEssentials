import java.util.ArrayList;
import java.util.Iterator;

public class Oef03 {

	public static void main(String[] args) {
		ArrayList<Kamer> kamers = new ArrayList<Kamer>();
		String[] strKamer = { "z001", "z002", "z003", "z004", "z005" };
		String[] strLux = { "luxe", "standaard", "luxe", "standaard",
				"standaard" };

		for (int i = 0; i < strKamer.length; i++) {
			if (!kamers.equals(strKamer[i])) {
				kamers.add(new Kamer(strKamer[i], strLux[i]));
			} else {
				System.out.println("Kamer " + strKamer[i] + " bestaat al!");
			}

		}
		System.out.println("\nLijst kamers: ");
		Iterator<Kamer> it = kamers.iterator();
		while (it.hasNext()) {
			Kamer k = it.next();
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
		Iterator<Kamer> it2 = kamers.iterator();
		while (it2.hasNext()) {
			Kamer k = it2.next();
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
		kamers.get(1).uitboekenKamer();
		
		System.out.println("\nLijst kamers met gasten:");
		Iterator<Kamer> it3 = kamers.iterator();
		while (it3.hasNext()) {
			Kamer k = it3.next();
			k.printgegevens();
		}
	}
}