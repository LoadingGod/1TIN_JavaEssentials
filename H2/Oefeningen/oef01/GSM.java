package oef01;

public class GSM {
	String gsmNummer;
	int bouwjaar, krediet, meterbatterij;
	String merk, naamEigenaar, voornaamEigenaar;

	public GSM(String merk, String gsmNummer) {
		this.gsmNummer = gsmNummer;
		this.merk = merk;
	}

	public GSM(String merk, String gsmNummer, int meterbatterij) {
		this.gsmNummer = gsmNummer;
		this.merk = merk;
		this.meterbatterij = meterbatterij;
	}

	public GSM() {

	}

	void toonGSM() {
		System.out.println("Het gsmnummer " + gsmNummer + " van "
				+ naamEigenaar + " " + voornaamEigenaar
				+ " heeft de volgende kenmerken:\nBouwjaar:\t" + bouwjaar
				+ "Merk:\t" + merk + "Krediet:\t" + krediet
				+ "Meterbatterij:\t" + meterbatterij);

	}
}
