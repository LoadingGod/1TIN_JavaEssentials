package H6_Oef01;

public class Oef {

	public static void main(String[] args) {
		int[][] punten = new int[5][4];
		int vak = 1;
		int aantalVakBuizen = 0;
		int aantalStudGeslaagd = 0;
		for (int kolom = 0; kolom < punten[0].length; kolom++) {
			for (int rij = 0; rij < punten.length; rij++) {
				if (rij == 0) {
					System.out.println("Vak " + vak + ": ");
				}
				punten[rij][kolom] = Invoer.leesInt("Geef punten in: ");
			}
			++vak;
		}

		for (int rij = 0; rij < punten.length; rij++) {
			int som = 0;
			for (int kolom = 0; kolom < punten[rij].length; kolom++) {
				som += punten[rij][kolom];
				if (punten[rij][kolom] < 10) {
					++aantalVakBuizen;
				}
			}
			double perc = ((double) som / 80) * 100;
			if (perc < 55 || aantalVakBuizen > 3) {
				System.out.println("Student " + (rij + 1)
						+ " is niet geslaagd!" + perc);
			} else {
				System.out.println("Student " + (rij + 1)
						+ " is geslaagd!" + perc);
				++aantalStudGeslaagd;
			}
			
			aantalVakBuizen = 0;
		}

		System.out.println("Aantal geslaagde studenten: " + aantalStudGeslaagd);
	}

}
