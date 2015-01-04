package Oef04;

import be.pxl.abstractoef.Invoer;

public class Medewerker extends Persoon implements Controleer {
	String medCode, functie;
	double brutoMaandLoon;
	
	public Medewerker(String naam, int gebJaar, String medCode) {
		super(naam, gebJaar);
		this.medCode = medCode;
	}

	@Override
	public void controle() {
		while (!(medCode.charAt(0) == super.getNaam().charAt(0) && Character.isDigit(medCode.charAt(1)))) {
			System.out.println("Foutieve medCode voor " + super.getNaam());
			medCode = Invoer.leesString("Geef de medCode in: ");
		}
		
	}

	@Override
	public void drukGegevens() {
		// TODO Auto-generated method stub
		
	}

}
