public class ExtraOef01 {

	public static void main(String[] args) {
		int[][] tabel = new int[5][3];

		for (int  rij = 0; rij < tabel.length; rij++) {
			for (int kolom = 0; kolom < tabel[rij].length; kolom++) {
				tabel[rij][kolom] = Invoer.leesInt("Geef in: ");
			}
		}

		int getal = Invoer.leesInt("\nGeef een getal in: ");
		int aantGetal = 0;

		for (int rij = 0; rij < tabel.length; rij++) {
			for (int kolom = 0; kolom < tabel[rij].length; kolom++) {
				if (tabel[rij][kolom] == getal) {
					++aantGetal;
				}
			}
		}
		
		System.out.println("Het getal " + getal + " komt " + aantGetal + " voor!");

	}

}
