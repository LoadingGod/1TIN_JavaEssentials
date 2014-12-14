package Oef02;

public class Hond extends Dier implements Spreker {
	public Hond(String naam) {
		super.setNaam(naam);
	}

	public void Spreek() {
		System.out.println("WOEF");
	}
	
	public String getNaam() {
		return super.getNaam();
	}
}
