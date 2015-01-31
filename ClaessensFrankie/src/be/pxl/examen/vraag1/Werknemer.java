package be.pxl.examen.vraag1;

public abstract class Werknemer implements Activiteit {
	
	private String naam;
	protected int aantalCalorien;
	private Bedrijf bedrijf;
	private Afdeling afdeling;
	
	public Werknemer (String naam, Afdeling afdeling) {
		this.naam = naam;
		this.afdeling = afdeling;
	}
	
	public String getNaam() {
		return this.naam;
	}
	
	public int getAantalCalorien() {
		return this.aantalCalorien;
	}
	
	public Bedrijf getBedrijf() {
		return this.bedrijf;
	}
	
	public Afdeling getAfdeling() {
		return this.afdeling;
	}

}
