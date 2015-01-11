
public class Oef07 {

	public static void main(String[] args) {
		String[][] auteurtitel = {{"De Chninkel", "Vanhamme"}, {"Kuifje in Tibet", "Herge"}, {"Maus", "Spiegelmann"}, {"Kuifje de blauwe Lotus", "Herge"}, {"Largo Winch: de erfgenamen", "Vanhamme"}};
		int[][] enquete =  new int[5][3];
		int[]aantAuteur = new int[5];
		int aantTotaal = 0;
		int grootsteTitel = 0;
		for (int kolom = 0; kolom < enquete[0].length; kolom++) {
			for (int rij = 0; rij < enquete.length; rij++) {
				if (kolom == 0) {
					enquete[rij][kolom] = Invoer.leesInt("Geef resultaten van 1TIN in: ");
				} else if (kolom == 1) {
					enquete[rij][kolom] = Invoer.leesInt("Geef resultaten van 2TIN in: ");
				} else {
					enquete[rij][kolom] = Invoer.leesInt("Geef resultaten van 3TIN in: ");
				}
				
			}
		}
		
		for (int rij = 0; rij < enquete.length; rij++) {
			for (int kolom = 0; kolom < enquete[rij].length; kolom++) {
				aantAuteur[rij] += enquete[rij][kolom];
			}
			if (aantAuteur[rij] > grootsteTitel) {
				grootsteTitel = rij;
			}
			aantTotaal += aantAuteur[rij];
		}
		
		System.out.println("\nPercentage stemmen:\n");
		for (int rij = 0; rij < auteurtitel.length; rij++) {
			double auteurPercentage = (aantAuteur[rij] / (double)aantTotaal) * 100.0;
			auteurPercentage = (Math.round(auteurPercentage * 100.0) / 100.0);
			System.out.format("%-20s %-35s %-5s%%\n", auteurtitel[rij][1], auteurtitel[rij][0], auteurPercentage);
		}
		
		System.out.println("\nDe titel van de strip met het meest aantal stemmen:\n");
		System.out.println(auteurtitel[grootsteTitel][0].toUpperCase());
		
	}
}