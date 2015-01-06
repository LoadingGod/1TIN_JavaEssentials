
public class Oef02 {

	public static void main(String[] args) {
		int[][] matrix = new int[3][4];
		for (int rij = 0; rij < 3; rij++) {
			for (int kolom = 0; kolom < 4; kolom++) {
				int rijen = rij + 1;
				matrix[rij][kolom] = Invoer.leesInt("Geef rij " + rijen + " in: ");
			}
		}
		
		for (int kolom = 0; kolom < 4; kolom++) {
			for (int rij = 0; rij < 3; rij++) {
				System.out.print(matrix[rij][kolom] + "\t");
			}
			System.out.println();
		}

	}

}
