package Oef04;

public class Persoon {
	private String naam;
	private int gebJaar;
	
	public Persoon(String naam, int gebJaar) {
	this.naam = naam;
	this.gebJaar = gebJaar;
	}
	
	public final String getNaam() {
		return this.naam;
	}
	
	public final int getGebJaar() {
		return this.gebJaar;
	}
	
	public void drukGegevens(){
		System.out.println("\nNaam: " + this.naam + "\nGeboren in :" + this.gebJaar);
	}
}
