package be.pxl.examen.vraag1;

public class Verkoper extends Werknemer {
	
	public Verkoper(String naam, Afdeling afdeling) {
		super(naam, afdeling);
	}

	@Override
	public void calorieenVerbranden() {
		super.aantalCalorien += 15;
	}

}
