package Oef2;

public class Stad {
	private String naam;
	private Persoon burgemeester;
	private int aantalInwoners;
	private static int aantalSteden = 0;

	Stad(String naam, int aantalInwoners, Persoon burgemeester) {
		this.naam = naam.toUpperCase();
		this.burgemeester = burgemeester;
		this.aantalInwoners = aantalInwoners;
		aantalSteden++;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam.toUpperCase();
	}

	public Persoon getBurgemeester() {
		return burgemeester;
	}

	public void setBurgemeester(Persoon burgemeester) {
		this.burgemeester = burgemeester;
	}

	public int getAantalInwoners() {
		return aantalInwoners;
	}

	public void setAantalInwoners(int aantalInwoners) {
		this.aantalInwoners = aantalInwoners;
	}

	public void drukStadsGegevens() {
		System.out.println("Naam:" + naam + "\nAantal Inwoners: "
				+ aantalInwoners + "\nBurgemeester: "
				+ burgemeester.getVoornaam() + " " + burgemeester.getNaam() + "\n");
	}

	public static int getAantalSteden() {
		return aantalSteden;
	}
}
