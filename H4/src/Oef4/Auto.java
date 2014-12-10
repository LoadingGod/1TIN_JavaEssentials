package Oef4;

public class Auto extends Voertuig {
	protected int aantalDeuren;
	
	public Auto() {
		
	}
	
	public Auto(int aantalDeuren, String merk, String type, int bouwjaar) {
		super(merk, type, bouwjaar);
		this.aantalDeuren = aantalDeuren;
	}
	
	public void drukAf() {
		super.drukAf();
		System.out.println("Aantal deuren: " + aantalDeuren);
	}
	
	
}
