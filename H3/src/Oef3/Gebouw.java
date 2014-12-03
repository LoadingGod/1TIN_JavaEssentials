package Oef3;

public class Gebouw {
	private Adres mijnAdres;
	private Double opp;
	private String functie;
	private String[] juisteFunctie = { "Gezinswoning", "Appartement",
			"Commerciele ruimte", "Andere" };

	public Gebouw(Adres mijnAdres, double opp) {
		this.mijnAdres = mijnAdres;
		this.opp = opp;
		functie = juisteFunctie[0];
	}

	public Adres getMijnAdres() {
		return mijnAdres;
	}

	public void setFunctie(String functie) {
//		for (int i = 0; i < juisteFunctie.length; i++) {
//			if (functie.equals(juisteFunctie[i])) {
//				this.functie = functie;
//			} else {
//				this.functie = "Gezinswoning";
//			}
//		}

		int i = 0;
		boolean gevonden = false;
		while (!gevonden && i < juisteFunctie.length) {
			gevonden = functie.equals(juisteFunctie[i]);
			i++;
		}
		if (gevonden) {
			this.functie = functie;
		} else {
			this.functie = juisteFunctie[0];
		}
	}

	public String getFunctie() {
		return functie;
	}

	public double getOpp() {
		return opp;
	}

}
