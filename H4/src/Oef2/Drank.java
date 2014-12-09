package Oef2;

public class Drank {
	private String naam;
	private double prijs;
	private static int aantal = 0;
	
	public Drank() {
		this.naam = "Onbekend";
		this.prijs = 1.0;
		++aantal;
	}
	
	public Drank(String naam) {
		this.naam = naam;
		++aantal;
	}
	
	public Drank(String naam, double prijs) {
		this.naam = naam;
		this.prijs = checkPrijs(prijs);
		++aantal;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public double getPrijs() {
		return prijs;
	}

	public void wijzigPrijs(double prijs) {
		this.prijs = checkPrijs(prijs);
	}
	
	public void printDrankGegevens(){
		System.out.format("%-30s %-30s\n", naam, prijs);
	}
	
	public double checkPrijs(double prijs) {
		if (prijs < 1) {
			return 1.0;
		} else {
			return prijs;
		}
	}
	
	public static int getAantal(){
		return aantal;
	}
}
