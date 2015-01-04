package Oef04;

public class Persoon {
	private String naam;
	private int gebJaar;

	public Persoon(String naam, int gebJaar) {
		this.naam = naam;
		this.gebJaar = gebJaar;
	}

	final public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getGebJaar() {
		return gebJaar;
	}

	public void setGebJaar(int gebJaar) {
		this.gebJaar = gebJaar;
	}

}
