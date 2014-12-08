package voorbeeld;

public class Rund extends Dier{

	boolean melkKoe;

	public Rund() {
		super("Rund", "Herbivoor");
	}
	
	public Rund(boolean melkKoe, int gebJaar) {
		super("Rund", "Herbivoor", gebJaar);
		// Volgende regel werkt niet omwille van de access mod private
		// this.geboorteJaar = geboorteJaar;
		// Rund heeft wel een waarde voor geboorteJaar, we zien hem hier niet.
		this.melkKoe = melkKoe;
	}
	

	
	

}
