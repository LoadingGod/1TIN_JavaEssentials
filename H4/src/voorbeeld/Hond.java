package voorbeeld;
public class Hond extends Dier {
	private String naam;
	private String ras;

	public Hond (String naam) {
		super("hond", "carnivoor");
		this.naam = naam;
		ras = "straathond";
	}
	public Hond (String naam, String ras, int gebJaar) {
		super("hond", "carnivoor", gebJaar);
		this.naam = naam;
		this.ras = ras;
	}
	public String toString() {
      	return "Dit is een " + soort + "- het is " + naam + " de " + ras;
  	}
	
	public void makeSound() {
		System.out.println("woef woef");
	}

}
