package Oef4_Extra;

public class Persoon {
	private String naam, kleurOgen, geslacht;
	private int grootte;
	private Datum gebDatum;
	private Hond mijnHond;
	private double inkomen;
	
	Persoon(String naam, String kleurOgen, String geslacht, int grootte, Datum gebDatum, Hond mijnHond, double inkomen) {
		this.naam = naam;
		this.kleurOgen = kleurOgen;
		this.geslacht = geslacht;
		this.grootte = grootte;
		this.gebDatum = gebDatum;
		this.mijnHond = mijnHond;
		this.inkomen = inkomen;
	}
	
	Persoon() {
		this.naam = "Onbekend";
		this.kleurOgen = "Grijs";
		this.geslacht = "Man";
		this.grootte = 180;
		this.gebDatum = new Datum();
		this.mijnHond = new Hond();
		this.inkomen = 40000;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public void setKleurOgen(String kleurOgen) {
		this.kleurOgen = kleurOgen;
	}
	
	public void setGeslacht(String geslacht) {
		this.geslacht = geslacht;
	}
	
	public void setGrootte(int grootte) {
		if (!(grootte < this.grootte)) {
			this.grootte = grootte;	
		}
	}
	
	public void setGebDatum(Datum gebDatum) {
		this.gebDatum = gebDatum;
	}
	
	public void indexAanpassing(){
		this.inkomen  *= 1.02;
	}
	
}
