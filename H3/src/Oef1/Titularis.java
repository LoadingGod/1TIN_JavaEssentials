package Oef1;

/*
 * Uitbreiding 1
 */

public class Titularis {
	private String naam, voornaam, adres, telNr;
	
	Titularis(String voornaam, String naam, String adres, String telNr) {
		this.voornaam = voornaam;
		this.naam = naam;
		this.adres = adres;
		this.telNr = telNr;
	}
	
	Titularis() {
		this.voornaam = "";
		this.naam = "";
		this.adres = "";
		this.telNr = "+32000000000";
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
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelNr() {
		return telNr;
	}
	public void setTelNr(String telNr) {
		this.telNr = telNr;
	}
	
}
