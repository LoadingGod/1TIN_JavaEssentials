package Oef01;

public class TekenProgramma {
	  public static void main(String[] args) {
		TekenObject[] tekening = new TekenObject[5];
		TekenObject t1;
		t1 = new Achtergrond("grijs", true);
		tekening[0] = t1;
		t1 =  new Cirkel(0.0, 3.0, 1.2);
		tekening[1] = t1;
		t1 = new  Punt(1.2, 3.2);
		tekening[2] = t1;
		t1 = new  Punt(5.4, 2.8);
		tekening[3] = t1;
		t1 = new Lijn(0.8, 3.4, 1.2, 3.9);
		tekening[4] = t1;
		TekenObject t2;
		for(int i = 0; i < tekening.length; i++){
			t2 = tekening[i];
			t2.teken();
		}
	  }
}
