package Oef2;

public class Persoon {
	private String naam, voornaam;
	
	Persoon() {
		naam = "Onbekend";
		voornaam = "Onbekend";
	}
	
	Persoon(String naam, String voornaam) {
		this.naam = naam;
		this.voornaam = voornaam;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	
}
