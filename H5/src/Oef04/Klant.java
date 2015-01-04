package Oef04;

public class Klant extends Persoon implements Controleer{
	private String klantCode;
	private double bedragGekocht;
	
	public Klant(String naam, int gebJaar, String klantCode) {
		super(naam, gebJaar);
		this.klantCode = klantCode;
	}
	
	public void controle() {
		
	}
	
	public void drukGegevens(){
		
	}
}
