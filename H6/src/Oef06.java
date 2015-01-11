public class Oef06 {

	public static void main(String[] args) {

		int[][] enquete = new int[8][5];
		int sport;
		int aantStud = 0;
		int aantStudSp = 0;
		int aantAfd = 0, aantSp = 0;
		int aantGeenSp = 0;
		int grootsteSp = 0;
		int afdeling = Invoer.leesInt("Geef de afdeling in (1 t/m 8): ");
		int aantGeenSport3 = 0;
		while (afdeling != 0) {
			sport = Invoer.leesInt("Geef de sport in (1 t/m 5): ");
			++enquete[afdeling - 1][sport - 1];
			++aantStud;
			afdeling = Invoer.leesInt("Geef de afdeling in (1 t/m 8): ");
		}

		System.out.println("\nAantal studenten per afdeling:\n");
		for (int afd = 0; afd < enquete.length; afd++) {
			for (int sp = 0; sp < enquete[afd].length; sp++) {
				aantAfd += enquete[afd][sp];
			}
			System.out.println("Afdeling " + (afd + 1) + ":\t" + aantAfd);
			aantAfd = 0;
		}

		System.out.println("\nAantal studenten per sport: \n");
		for (int sp = 0; sp < enquete[0].length; sp++) {
			for (int afd = 0; afd < enquete.length; afd++) {
				aantSp += enquete[afd][sp];
				if (aantSp > grootsteSp) {
					grootsteSp = sp;
				}
				if (afd == 2 && sp == 0) {
					++aantGeenSport3;
				}
			}
			if (sp == 0) {
				System.out.println("Geen sport:\t" + aantSp);
				++aantGeenSp;
			} else {
				System.out.println("Sport " + (sp + 1) + ":\t" + aantSp);
			}

			aantStudSp += aantSp;
			aantSp = 0;
		}

		double sportProcent = ((aantStudSp - aantGeenSp) / (double) aantStudSp) * 100.0;
		sportProcent = Math.round(sportProcent * 100.0) / 100.0;
		System.out
				.println("\nPercentage van studenten die een sport beoefent: "
						+ sportProcent + "%");

		double geenSport3Procent = (enquete[2][0] / (double) aantGeenSport3) * 100.0;
		geenSport3Procent = Math.round(geenSport3Procent * 100.0) / 100.0;
		System.out
				.println("\nPercentage van studenten uit afdeling 3 die geen sport beoefent: "
						+ geenSport3Procent);

		System.out.println("\nDe sport die het meest beoefend wordt is Sport "
				+ (grootsteSp + 1));

	}
}
