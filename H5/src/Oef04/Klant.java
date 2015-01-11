package Oef04;

public class Klant extends Persoon implements Controleer {
	private String klantCode;
	private double bedragGekocht;

	public Klant(String naam, int gebJaar, String klantCode, double bedragGekocht) {
		super(naam, gebJaar);
		this.klantCode = klantCode;
		controle();
		this.bedragGekocht = bedragGekocht;
	}

	public void controle() {
		if (!(this.klantCode.substring(0, 2).equals("KLA"))) {
			this.klantCode = "KLA" + this.klantCode;
		}
		System.out.println("De klantcode is: " + this.klantCode);
	}

	public void drukGegevens() {
		System.out.println("\nKlant\nNaam: " + super.getNaam() + "\nGeboren in: " + super.getGebJaar() + "\nKlantcode: " + this.klantCode + "\nBedrag gekocht: " + this.bedragGekocht);
	}

}
