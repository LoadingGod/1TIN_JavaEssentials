package Oef04;

public class Klant extends Persoon implements Controleer{
	private String klantCode;
	private double bedragGekocht;
	
	public Klant(String naam, int gebJaar, String klantCode) {
		super(naam, gebJaar);
		this.klantCode = klantCode;
	}
	public String getKlantCode() {
		return klantCode;
	}
	public void setKlantCode(String klantCode) {
		this.klantCode = klantCode;
	}
	public double getBedragGekocht() {
		return bedragGekocht;
	}
	public void setBedragGekocht(double bedragGekocht) {
		this.bedragGekocht = bedragGekocht;
	}
	@Override
	public void controle() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void drukGegevens() {
		// TODO Auto-generated method stub
		
	}
	
}
