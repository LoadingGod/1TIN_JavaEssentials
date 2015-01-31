package be.pxl.examen.vraag1;

import java.util.ArrayList;

public class Bedrijf {
	
	private String naam;
	private String adres;
	private ArrayList<Werknemer> werknemersList;
	private Afdeling garage;
	private Afdeling verkoopZaal;
	
	public Bedrijf (String naam) {
		this.naam = naam;
	}
	
	public String getAdres() {
		return this.adres;
	}
	
	public String getNaam() {
		return this.naam;
	}
	
	public ArrayList<Werknemer> getWerknemerList(){
		return werknemersList;
	}
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public void setGarageAfdeling(Afdeling garage) {
		this.garage = garage;
	}
	
	public void setVerkoopZaalAfdeling(Afdeling verkoopZaal) {
		this.verkoopZaal = verkoopZaal;
	}
	

}
