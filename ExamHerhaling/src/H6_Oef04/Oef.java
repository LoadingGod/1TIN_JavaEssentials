package H6_Oef04;

public class Oef {
	
	public static void main(String[] args) {
		int[][] a = new int[3][5];
		int grootst = 0;
		
		for (int rij = 0; rij < a.length; rij++) {
			for (int kolom = 0; kolom < a[rij].length; kolom++) {
				a[rij][kolom] = -400 + (int)((1001 - (-400)) * Math.random());
				// bij negatieve getallen, a + buiten de cast plaatsen
			}
		}
		
		for (int rij = 0; rij < a.length; rij++) {
			for (int kolom = 0; kolom < a[rij].length; kolom++) {
				if (a[rij][kolom] > grootst) {
					grootst = a[rij][kolom];
				}
			}
		}
		
		System.out.println(grootst + " is het grootste getal!");
	}

}
