package be.pxl.examen.vraag1;

public class VerkoopZaal extends Afdeling {
	
	String catalogus;
	
	public VerkoopZaal(String chef) {
		super(chef);
	}
	
	public String getCatalogus() {
		return this.catalogus;
	}
	
	public void setCatalogus() {
		this.catalogus = catalogus;
	}

}
