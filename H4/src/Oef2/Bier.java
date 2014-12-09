package Oef2;

public class Bier extends Drank {

	private String omschrijving;
	private double percentage;

	public Bier() {
		super("Onbekend", 1.0);
		this.omschrijving = "Onbekend";
		this.percentage = 0.0;
	}

	public Bier(String naam, double prijs, String omschrijving,
			double percentage) {
		super(naam, prijs);
		this.omschrijving = omschrijving;
		this.percentage = percentage;
	}

	public void printDrankGegevens() {
		super.printDrankGegevens();
		System.out.format("%-30s %-30s\n", this.omschrijving, this.percentage);
	}
}
