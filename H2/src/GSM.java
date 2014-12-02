public class GSM {
	private String gsmNummer;
	private int bouwjaar, krediet, meterbatterij;
	private String merk, naamEigenaar, voornaamEigenaar;
	static int aantal;
	
	GSM(String merk, String gsmNummer) {
		this.gsmNummer = gsmNummer;
		this.merk = merk;
		++aantal;
	}

	GSM(String merk, String gsmNummer, int meterbatterij) {
		this.gsmNummer = gsmNummer;
		this.merk = merk;
		this.meterbatterij = meterbatterij;
		++aantal;
	}

	GSM() {
		++aantal;
	}

	public void toonGSM() {
		if (merk == null && gsmNummer == null) {
			System.out
					.println("Dit is een leeg object en heeft geen eigen waarden voor zijn datamembers!");
		} else {
			System.out.println("Het gsmnummer " + gsmNummer + " van "
					+ naamEigenaar + " " + voornaamEigenaar
					+ " heeft de volgende kenmerken:\nBouwjaar:\t" + bouwjaar
					+ "Merk:\t" + merk + "Krediet:\t" + krediet
					+ "Meterbatterij:\t" + meterbatterij);
		}

	}

	/*
	 * Uitbreiding 1
	 */

	public void setGsmNummer(String gsmNummer) {
		this.gsmNummer = gsmNummer;
	}

	public void setBouwjaar(int bouwjaar) {
		this.bouwjaar = bouwjaar;
	}

	public void setKrediet(int krediet) {
		this.krediet = krediet;
	}

	public void setMeterBatterij(int meterbatterij) {
		this.meterbatterij = meterbatterij;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public void setNaamEigenaar(String naamEigenaar) {
		this.naamEigenaar = naamEigenaar;
	}

	public void setVoornaamEigenaar(String voornaamEigenaar) {
		this.voornaamEigenaar = voornaamEigenaar;
	}

	public String getGsmnummer() {
		return gsmNummer;
	}

	public String getEigenaar() {
		return voornaamEigenaar + " " + naamEigenaar;
	}

	public int getBouwjaar() {
		return bouwjaar;
	}

	public String getMerk() {
		return merk;
	}

	public int toonBeltijd() {
		return krediet * 60;
	}

	public void tick() {
		meterbatterij -= 2;
		if (meterbatterij < 0) {
			meterbatterij = 0;
		}
	}
	
/*
* Uitbreiding 2
*/
	
	public void laadOp() {
		meterbatterij = 200;
	}

/*
* Uitbreiding 3 
*/
	
	public static void aantalGSM() {
		System.out.println("Het aantal aangemaakte GSMs is: " + aantal);
	}
	
	
}
