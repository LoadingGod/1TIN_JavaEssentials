package Oef3;

public class EigenaarGebouwen {
	private Persoon eigenaar;
	private Gebouw[] gebouwen = new Gebouw[5];

	public EigenaarGebouwen(Persoon eigenaar) {
		this.eigenaar = eigenaar;
	}

	public void voegGebouwToe(Gebouw gebouw) {
		// for (int i = 0; i < gebouwen.length; i++) {
		// if (gebouwen[i] == null) {
		// gebouwen[i] = gebouw;
		// }
		// }

		int i = 0;
		boolean gevuld = false;
		while (!gevuld && i < gebouwen.length) {
			if (gebouwen[i] == null) {
				gebouwen[i] = gebouw;
				gevuld = true;
			}
			i++;
		}
		if (i >= 5) {
			System.out.println("U mag maximaal 5 gebouwen bezitten!");
		}
	}

	public void toonEigenaar() {
		System.out.println("Eigenaar: " + eigenaar.getNaam() + " " + eigenaar.getVoornaam());
		int index = 0;

		while (index < gebouwen.length && gebouwen[index] != null) {
			Adres a = gebouwen[index].getMijnAdres();
			System.out.println("[ " + index + " ] " + a.getStraat() + " "
					+ a.getHuisnr() + " " + a.getGemeente() + " {"
					+ gebouwen[index].getFunctie() + " "
					+ gebouwen[index].getOpp() + "}");
		}
	}
	
}
