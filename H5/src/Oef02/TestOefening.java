package Oef02;

public class TestOefening {

	public static void main(String[] args) {
		Spreker[] rij = { new Hond("Sloeber"), new Kat("Bliksem"),
				new Kat("Duvel"), new StaandeKlok("Claudius"),
				new KoekoeksKlok("Graves") };

		for (int i = 0; i < rij.length; i++) {
			System.out.format("%-10s \t", rij[i].getNaam());
			rij[i].Spreek();
		}

	}

}
