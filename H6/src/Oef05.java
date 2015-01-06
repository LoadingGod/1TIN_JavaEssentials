public class Oef05 {

	public static void main(String[] args) {
		String[] kleuren = {"Rood", "Wit", "Blauw", "Oranje", "Zwart"};
		String[] maten = {"Small", "Medium", "Large"};
		int[][] tabel = { { 45, 102, 19, 55 }, { 79, 47, 58, 22, 46 },
				{ 109, 33, 112 } };
		int[] sommen = new int[3];

		for (int rij = 0; rij < tabel.length; rij++) {
			for (int kolom = 0; kolom < tabel[rij].length; kolom++) {
				sommen[rij] += tabel[rij][kolom];
			}
		}

		for (int rij = 0; rij < 3; rij++) {
			for (int kolom = 0; kolom < tabel[rij].length; kolom++) {
				if (tabel[rij][kolom] < sommen[rij] / 3.0) {
					System.out.println(kleuren[kolom] + "\t" + maten[rij] + "\tmoet bijbesteld worden!");
				}
			}
		}

	}

}
