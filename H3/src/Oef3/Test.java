package Oef3;

public class Test {

	public static void main(String[] args) {
		Persoon p1 = new Persoon("Claessens", "Frankie");
		EigenaarGebouwen a = new EigenaarGebouwen(p1);
		Adres mijnAdres = new Adres("De Schom", "26", "3600", "Genk");
		Gebouw mijnGebouw = new Gebouw(mijnAdres, 766.5);
		a.voegGebouwToe(mijnGebouw);
		a.toonEigenaar();
	}

}
