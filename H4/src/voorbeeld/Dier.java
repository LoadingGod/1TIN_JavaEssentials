package voorbeeld;

public class Dier {
	protected String soort, voedselType;
	protected int geboorteJaar;

	public Dier(String soort, String voedselType) {
		this.soort = soort;
		this.voedselType = voedselType;
	}
	public Dier(String soort, String voedselType, int gebJaar) {
		this.soort = soort;
		this.voedselType = voedselType;
		geboorteJaar = gebJaar;
	}
 	public String toString() {
		return "Dit is een " + soort + " (" + voedselType + ")";
	}
	public int geefGeboorteJaar() {
		return geboorteJaar;
	}
}
