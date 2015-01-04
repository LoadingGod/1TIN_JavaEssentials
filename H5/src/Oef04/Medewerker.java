package Oef04;

public class Medewerker extends Persoon implements Controleer {
	private String medCode, functie;
	private double brutoMaandloon;

	public Medewerker(String naam, int gebJaar, String medCode, String functie, double brutoMaandloon) {
		super(naam, gebJaar);
		this.medCode = medCode;
		controle();
		this.functie = functie;
		this.brutoMaandloon = brutoMaandloon;		
	}

	public void controle() {
		while (this.medCode.charAt(0) != super.getNaam().charAt(0)) {
			this.medCode = Invoer
					.leesString("Foutieve medCode voor medewerker: "
							+ super.getNaam()
							+ "\nGeef een nieuwe medCode in: ");
		}
		System.out.println("De code " + this.medCode + " werd toegekend!");
	}

	public void drukGegevens() {
		System.out.println("\nMedewerker\nNaam: " + super.getNaam()
				+ "\nGeboren in: " + super.getGebJaar() + "\nMedewerkerscode: "
				+ this.medCode + "\tFunctie: " + this.functie + "\nLoon: "
				+ this.brutoMaandloon);
	}

}
