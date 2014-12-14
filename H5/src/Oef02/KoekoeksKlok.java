package Oef02;

public class KoekoeksKlok extends Klok implements Spreker{
	public KoekoeksKlok(String naamFabrikant) {
		super.setNaamFabrikant(naamFabrikant);
	}
	
	public void Spreek() {
		System.out.println("KOEKOEK");
	}
	
	public String getNaam() {
		return super.getNaamFabrikant();
	}

}
