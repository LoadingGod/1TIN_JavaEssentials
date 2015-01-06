public class Oef01 {

	public static void main(String[] args) {
		int[][] punten = new int[5][4];
		double[] percentages = new double[5];
		int[] flessen = new int[5];
		int vak = 1;
		int som = 0;
		int buizen = 0;
		double percentage = 0.0;
		for (int kolom = 0; kolom < 4; kolom++) {
			for (int rij = 0; rij < 5; rij++) {
				if (rij == 0) {
					System.out.println("Vak" + vak);
				}
				punten[rij][kolom] = Invoer.leesInt("Geef in: ");
			}
			vak++;
		}

		for (int rij = 0; rij < 5; rij++) {
			for (int kolom = 0; kolom < 4; kolom++) {
				som += punten[rij][kolom];
				if (punten[rij][kolom] < 10) {
					++buizen;
				}
			}
			percentage = (som / 80.0) * 100;
			percentages[rij] = percentage;
			som = 0;
			flessen[rij] = buizen;
			buizen = 0;
		}

		int geslaagd = 0;
		int Ngeslaagd = 0;
		for (int rij = 0; rij < 5; rij++) {
			if (percentages[rij] < 55 || flessen[rij] > 3) {
				++Ngeslaagd;
			} else {
				++geslaagd;
			}
		}

		System.out.println("Aantal geslaagd:\t" + geslaagd
				+ "\nAantal niet geslaagd:\t" + Ngeslaagd);
	}
}
