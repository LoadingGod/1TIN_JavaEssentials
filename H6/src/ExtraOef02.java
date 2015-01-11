public class ExtraOef02 {

	public static void main(String[] args) {
		int positierij = 2;
		int positiekolom = 5;
		char[][] tabel = {
				{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
				{ '#', '.', '.', '#', '.', '.', '.', '#', '.', '#' },
				{ '#', '.', '.', '#', '.', '*', '.', '#', '.', '#' },
				{ '#', '.', '#', '#', '.', '.', '.', '#', '.', '#' },
				{ '#', '.', '#', '.', '.', '#', '#', '#', '.', '#' },
				{ '#', '.', '#', '.', '.', '.', '.', '.', '.', '#' },
				{ '#', '.', '.', '.', '.', '.', '.', '.', '.', '#' },
				{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' }, };
		for (int rij = 0; rij < tabel.length; rij++) {
			for (int kolom = 0; kolom < tabel[rij].length; kolom++) {
				System.out.print(tabel[rij][kolom] + "\t");
			}
			System.out.println();
		}

		char input = Invoer
				.leesChar("\nGeef een letter in om de speler (*) te verplaatsen (W = omhoog, Z = omlaag, A = links, S = rechts, X = exit): ");
		while (input != 'X') {
			if (input == 'W') {
				if (tabel[positierij - 1][positiekolom] == '.') {
					tabel[positierij][positiekolom] = '.';
					--positierij;
					tabel[positierij][positiekolom] = '*';
				}

			} else if (input == 'Z') {
				if (tabel[positierij + 1][positiekolom] == '.') {
					tabel[positierij][positiekolom] = '.';
					++positierij;
					tabel[positierij][positiekolom] = '*';
				}
			} else if (input == 'A') {
				if (tabel[positierij][positiekolom - 1] == '.') {
					tabel[positierij][positiekolom] = '.';
					--positiekolom;
					tabel[positierij][positiekolom] = '*';
				}

			} else {
				if (tabel[positierij][positiekolom + 1] == '.') {
					tabel[positierij][positiekolom] = '.';
					++positiekolom;
					tabel[positierij][positiekolom] = '*';
				}
			}

			for (int rij = 0; rij < tabel.length; rij++) {
				for (int kolom = 0; kolom < tabel[rij].length; kolom++) {
					System.out.print(tabel[rij][kolom] + "\t");
				}
				System.out.println();
			}

			input = Invoer
					.leesChar("\nGeef een letter in om de speler (*) te verplaatsen (W = omhoog, Z = omlaag, A = links, S = rechts, X = exit): ");
		}

	}

}
