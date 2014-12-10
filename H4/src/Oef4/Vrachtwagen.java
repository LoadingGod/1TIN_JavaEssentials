package Oef4;

public class Vrachtwagen extends Voertuig{
	protected int laadvermogen;
	
	public Vrachtwagen() {
		
	}
	
	public Vrachtwagen(int laadvermogen, String merk, String type, int bouwjaar) {
		super(merk,type, bouwjaar);
		this.laadvermogen = laadvermogen;
	}
	
	public void drukAf() {
		super.drukAf();
		System.out.println("Laadvermogen: " + laadvermogen);
	}
}
