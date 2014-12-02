public class Persoon {
	private int x;
	String voornaam, naam, gemeente;
	int gewicht, leeftijd;
	double lengte;
	static int aantal; // static = niveau van klasse, wijzigt voor alles =
						// aanroepen via klasse
						// non-static = niveau van object, wijzigt voor ieder
						// object = aanroepen via
	Datum geboorteDatum;

	Persoon() {
		this.geboorteDatum = (new Datum (1,1,94));
		++aantal;
	}

	Persoon(String voornaamN, String naamN, Datum geboorteDatum) {
		voornaam = voornaamN;
		naam = naamN;
		this.geboorteDatum = new Datum(geboorteDatum);
		++aantal;
	}

	Persoon(int leeftijd) {
		this.leeftijd = leeftijd; // this.leeftijd slaat op de var leeftijd van
									// de class
		voornaam = "Onbekend";
		naam = "Onbekend";
		++aantal;
	}

	void wijzigVoornaam(String nieuweVN) {
		voornaam = nieuweVN;
	}

	void wijzigAchternaam(String nieuweAN) {
		naam = nieuweAN;
	}

	void wijzigGemeente(String nieuweG) {
		gemeente = nieuweG;
	}

	void wijzigGewicht(int nieuwGew) {
		gewicht = nieuwGew;
	}

	void wijzigLeeftijd(int nieuweL) {
		leeftijd = nieuweL;
	}

	void wijzigLengte(double nieuweLengte) {
		lengte = nieuweLengte;
	}

	String geefVoornaam() {
		return voornaam;
	}

	Double geefLengte() {
		return lengte;
	}

	int geefGewicht() {
		return gewicht;
	}

	void geefBMI() {
		if (lengte != 0) {
			System.out.println("De BMI bedraagt " + gewicht
					/ Math.pow(lengte, 2));
		} else {
			System.out.println("De BMI kan niet berekend worden!");
		}
	}

	void groei() {
		lengte += 0.1;
	}

	void groei(int cm) {
		lengte += cm / 100.0;
	}

	static int toonAantal() {
		return aantal;
	}

	static void drukGroepen(int aantalInGroep) {
		int groepen = aantal / aantalInGroep;
		if (aantalInGroep * groepen < aantal) { // 5*1=5 < 7 -> aantal + 1
			groepen++;
		}

		if (groepen == 1) {
			System.out.println("Er is " + groepen + " groep");
		} else {
			System.out.println("Er zijn " + groepen + "groepen");
		}

	}

	void toonGegevens() {
		System.out.println(voornaam + "\n" + naam + "\n" + leeftijd + "\n"
				+ gemeente + "\n" + gewicht + "\n" + lengte + "\n");
		geboorteDatum.toon();
	}
	
	void setGeboorteDatum(int dag, int maand, int jaar) {
		this.geboorteDatum.dag = dag;
		this.geboorteDatum.maand = maand;
		this.geboorteDatum.jaar = jaar;
	}

}
