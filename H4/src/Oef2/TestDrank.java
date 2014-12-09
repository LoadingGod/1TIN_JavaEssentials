package Oef2;

public class TestDrank {
	public static void main(String[] args) {
		Drank d1 = new Drank("Fanta lemon", 1.6);
		Drank d2 = new Drank("Fanta light");
		Drank d3 = new Drank();
		System.out.println("Gegevens van mijn drankjes ...");
		System.out.println("Mijn eerste drankje " + d1.getNaam());
		System.out.println("Mijn 2de drankje " + d2.getNaam() + " kost "
				+ d2.getPrijs());
		d3.printDrankGegevens();
		d3.setNaam("Cola light");
		d3.wijzigPrijs(1.7);
		d3.printDrankGegevens();
		Drank d4 = new Bier("Leffe", 3.0, "Abdijbier", 7.0);
		d4.printDrankGegevens();
	}
}