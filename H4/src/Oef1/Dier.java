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
		if (voedselType.charAt(0) == 'h' || voedselType.charAt(0) == 'H') {
			this.voedselType = "Herbivoor";
		} else if (voedselType.charAt(0) == 'c' || voedselType.charAt(0) == 'C') {
			this.voedselType = "Carnivoor";
		} else {
			this.voedselType = "Onbekend";
		}
		
	}
	
 	public String toString() {
		return "Dit is een " + soort + " (" + voedselType + ")";
	}
	public int geefGeboorteJaar() {
		return geboorteJaar;
	}
}
