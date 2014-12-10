package be.pxl.voorbeeld2;

public class TekenProgramma {
	public static void main(String[] args) {
		GrafischElement[] tekening = new GrafischElement[4];
		GrafischElement g1;
		g1 =  new Cirkel(0.0, 3.0, 1.2);
		tekening[0] = g1;
		g1 = new  Punt(1.2, 3.2);
		tekening[1] = g1;
		g1 = new  Punt(5.4, 2.8);
		tekening[2] = g1;
		g1 = new Lijn(0.8, 3.4, 1.2, 3.9);
		tekening[3] = g1;
		GrafischElement g2;
		for(int i = 0; i < tekening.length; i++){
			g2 = tekening[i];
			g2.teken();
		}
	}
}


