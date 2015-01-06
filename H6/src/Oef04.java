
public class Oef04 {

	public static void main(String[] args) {
		int[][] a = new int[3][5];
		for (int rij = 0; rij < 3; rij++) {
			for (int kolom = 0; kolom < 5; kolom++) {
				a[rij][kolom] = -400 + (int)((1001-(-400)) * Math.random());
				// minimum + => buiten de cast plaatsen bij negatieve getallen
			}
		}
		
		int grootst = a[0][0];
		
		for (int rij = 0; rij < 3; rij++) {
			for (int kolom = 0; kolom < 5; kolom++) {
				if (a[rij][kolom] > grootst) {
					grootst = a[rij][kolom];
				}
			}
		}
		
		System.out.println("Het grootste getal in de tabel is: " + grootst);

	}

}
