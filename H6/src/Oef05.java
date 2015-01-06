
public class Oef05 {

	public static void main(String[] args) {
		int[][] tabel = new int[3][5];
		for (int kolom = 0; kolom < 5; kolom ++) {
			for (int rij = 0; rij < 3; rij++) {
				tabel[rij][kolom] = Invoer.leesInt("Geef het aantal in: ");
			}
		}

	}

}
