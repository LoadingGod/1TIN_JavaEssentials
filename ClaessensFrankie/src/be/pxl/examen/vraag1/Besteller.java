package be.pxl.examen.vraag1;

public class Besteller extends Werknemer {
	
	public Besteller(String naam, Afdeling afdeling) {
		super(naam, afdeling);
	}

	@Override
	public void calorieenVerbranden() {
		super.aantalCalorien += 20;
	}

}
