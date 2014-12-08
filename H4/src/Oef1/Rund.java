package Oef1;

public class Rund extends Dier {

	private boolean melkKoe;

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

	// toString overschrijven - > eigen versie schrijven!
	@Override
	public String toString() {
		// super. = neem *** uit de basisklasse
		// super.toString() = roep de toString aan zoals hij in Rund
		// gedefinieerd is.
		if (melkKoe) {
			return super.toString() + " melkkoe";
		} else {
			return super.toString() + " vleeskoe";
		}

	}

}
