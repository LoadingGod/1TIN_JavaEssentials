public class Oef03 {
	public static void main(String[] args) {
		int rijen = Invoer.leesInt("Geef rijen in: ");
		int kolommen = Invoer.leesInt("Geef kolommen in: ");
		int[][] matrix = new int[rijen][kolommen];
		int somrijen = 0;
		int somtotaal = 0;
		for (int rij = 0; rij < rijen; rij++) {
			for (int kolom = 0; kolom < kolommen; kolom++) {
				int locatie = rij + 1;
				matrix[rij][kolom] = Invoer.leesInt("Geef rij " + locatie + " in: ");
				somrijen += matrix[rij][kolom];
			}
			somtotaal += somrijen;
			somrijen = 0;
		}
		
		System.out.println(somtotaal);
	}
}
