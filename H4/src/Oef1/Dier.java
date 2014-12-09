package Oef1;

public class Dier {
	private String soort, voedselType;
	private int geboorteJaar;

	public Dier(String soort, String voedselType) {
		checkVoedselType();
		this.soort = soort;
		this.voedselType = voedselType;
	}

	public Dier(String soort, String voedselType, int gebJaar) {
		checkVoedselType();
		this.soort = soort;
		this.voedselType = voedselType;
		geboorteJaar = gebJaar;
	}
	
	private void checkVoedselType() {
		this.voedselType = "Onbekend";
		if (voedselType != null && voedselType.length() > 0) {
			if (voedselType.toLowerCase().charAt(0) == 'h') {
				this.voedselType = "Herbivoor";
			} else if (voedselType.toLowerCase().charAt(0) == 'c') {
				this.voedselType = "Carnivoor";
			} else if (voedselType.toLowerCase().charAt(0) == 'ó') {
				this.voedselType = "Omnivoor";
			}
		}
	}
	
 	public String toString() {
		return "Dit is een " + soort + " (" + voedselType + ")";
	}
	public int geefGeboorteJaar() {
		return geboorteJaar;
	}
}
