package Oef02;

public class StaandeKlok extends Klok implements Spreker{
	public StaandeKlok(String naamFabrikant) {
		super.setNaamFabrikant(naamFabrikant);
	}
	
	public void Spreek() {
		System.out.println("TIKTIK");
	}
	
	public String getNaam() {
		return super.getNaamFabrikant();
	}

}
