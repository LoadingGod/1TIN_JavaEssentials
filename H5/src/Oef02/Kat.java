package Oef02;

public class Kat extends Dier implements Spreker {

	public Kat(String naam) {
		super.setNaam(naam);
	}

	public void Spreek() {
		System.out.println("MIAUW");
	}
	
	public String getNaam() {
		return super.getNaam();
	}
}
