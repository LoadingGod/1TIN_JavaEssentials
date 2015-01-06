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
				System.out.println("Kamer " + strKamer[i]);
			}

		}
		
		Iterator<Kamer> it = kamers.iterator();
		while (it.hasNext()) {
			Kamer k = it.next();
			k.printgegevens();
		}
		
		ArrayList<Gast> gasten = new ArrayList<Gast>();
		int[] gastnrs = {34, 334, 22, 77, 88};
		String[] gastnamen = {"Zoons Pieters", "Peeters Wim", "Maes Guido", "Daems Greta", "Goos Mark"};
		String[] landnamen = {"Nederlands", "Duitsland", "Belgie", "Nederland", "Nederland"};
		
		for (int i = 0; i< gastnrs.length; i++) {
			gasten.add(new Gast(gastnrs[i], gastnamen[i], landnamen[i]));
		}
	}
}