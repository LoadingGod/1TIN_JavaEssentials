package Oef2;

public class TestStad {

	public static void main(String[] args) {
		Persoon p1 = new Persoon("Habraken", "Hans");
		Stad s1 = new Stad("Hasselt", 80000, p1);
		Stad s2 = new Stad("Genk", 55000, new Persoon());
		Stad s3 = new Stad("Hoeselt", 28000, new Persoon("Philips", "Brecht"));
		String burgNaam = s1.getBurgemeester().getNaam();
		s2.getBurgemeester().getNaam();
		s3.setBurgemeester(new Persoon());
		s1.drukStadsGegevens();
		s2.drukStadsGegevens();
		s3.drukStadsGegevens();
		int som = s1.getAantalInwoners() + s2.getAantalInwoners() + s3.getAantalInwoners();
		System.out.println("Gemiddeld aantal inwoners: " + (double) som / Stad.getAantalSteden());
	}
	
}
