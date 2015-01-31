package be.pxl.examen.vraag1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Bedrijf mijnAutos = new Bedrijf("De Auto dealer!");
		int totaalAantalCalorieenVerbrand = 0;
		int hoogstAantalCal = 0;
		Werknemer rust = null;
		Afdeling garage = new Garage("Chef Willem");
		Afdeling verkoopZaal = new VerkoopZaal("Chef Annie");
		Werknemer a = new Besteller("John", garage);
		Werknemer b = new Besteller("Daisy", garage);
		Werknemer c = new Verkoper("Jan", verkoopZaal);
		Werknemer d = new Verkoper("Jef", verkoopZaal);
		Werknemer e = new Verkoper("Miek", verkoopZaal);
		ArrayList<Werknemer> werknemers = new ArrayList<Werknemer>();
		werknemers.add(a);
		werknemers.add(b);
		werknemers.add(c);
		werknemers.add(d);
		werknemers.add(e);
		boolean stop = false;
		while (stop) {
			int random = (int) (0 + ((werknemers.size() - 1) - 0)
					* Math.random());
			werknemers.get(random).calorieenVerbranden();
			totaalAantalCalorieenVerbrand += werknemers.get(random)
					.getAantalCalorien();
			for (Werknemer temp : werknemers) {
				if (temp.getAantalCalorien() > 2000) {
					stop = true;
					rust = temp;
				}
			}
		}

		System.out.println("Gegevens van de activiteiten:\nBedrijf: "
				+ mijnAutos.getNaam());
		for (Werknemer temp : werknemers) {
			System.out.println("Naam = " + temp.getNaam()
					+ " en afdelingschef = " + temp.getAfdeling().getChef());
		}
		System.out.println("Resultaat van de activiteiten: ");
		System.out.println(rust + "mag even rusten!");
		System.out
				.println("In deze activiteiten verbrandden alle werknemers samen "
						+ totaalAantalCalorieenVerbrand);
	}

}
