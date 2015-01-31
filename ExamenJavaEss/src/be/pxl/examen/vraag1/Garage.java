package be.pxl.examen.vraag1;

public class Garage extends Afdeling {

	String magazijn;
	
	public Garage(String chef) {
		super(chef);
	}
	
	public String getMagazijn() {
		return this.magazijn;
	}
	
	public void setMagazijn (String magazijn) {
		this.magazijn = magazijn;
	}
}
