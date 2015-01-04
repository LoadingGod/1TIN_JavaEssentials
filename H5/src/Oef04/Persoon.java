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
}
