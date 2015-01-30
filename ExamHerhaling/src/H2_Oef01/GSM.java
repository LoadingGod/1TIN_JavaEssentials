package H2_Oef01;

public class GSM {

	private String gsmNummer;
	private int bouwjaar;
	private String merk;
	private String naamEigenaar = "";
	private String voornaamEigenaar = "";
	private int krediet;
	private int meterBatterij;
	private static int aantal;

	public GSM() {
		this.merk = "";
		this.gsmNummer = "";

	}

	public GSM(String merk, String gsmNummer) {
		this.merk = merk;
		this.gsmNummer = gsmNummer;
	}

	public GSM(String merk, String gsmNummer, int meterBatterij) {
		this(merk, gsmNummer);
		this.meterBatterij = meterBatterij;
	}

	public void toonGSM() {
		if (this.merk.equals("") && this.gsmNummer.equals("")) {
			System.out.println("Dit object is een leeg object en heeft geen eigen waarden voor zijn datamembers!");
		} else {
			System.out.println("Het GSM nummer " + this.gsmNummer + " van "
					+ this.naamEigenaar + " " + this.voornaamEigenaar
					+ " heeft de volgende kenmerken: \nBouwjaar: " + this.bouwjaar + "\nMerk: " + this.merk + "\nKrediet: " + this.krediet + "\nMeterbatterij: " + this.meterBatterij);
		}
		
	}

	public String getGsmNummer() {
		return gsmNummer;
	}

	public void setGsmNummer(String gsmNummer) {
		this.gsmNummer = gsmNummer;
	}

	public int getBouwjaar() {
		return bouwjaar;
	}

	public void setBouwjaar(int bouwjaar) {
		this.bouwjaar = bouwjaar;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getNaamEigenaar() {
		return naamEigenaar;
	}

	public void setNaamEigenaar(String naamEigenaar) {
		this.naamEigenaar = naamEigenaar;
	}

	public String getVoornaamEigenaar() {
		return voornaamEigenaar;
	}

	public void setVoornaamEigenaar(String voornaamEigenaar) {
		this.voornaamEigenaar = voornaamEigenaar;
	}

	public int getKrediet() {
		return krediet;
	}

	public void setKrediet(int krediet) {
		this.krediet = krediet;
	}

	public int getMeterBatterij() {
		return meterBatterij;
	}

	public void setMeterBatterij(int meterBatterij) {
		this.meterBatterij = meterBatterij;
	}
	
	public void tick(){
		this.meterBatterij -=2;
		if (this.meterBatterij < 0) {
			this.meterBatterij = 0;
		}
	}
	
	public void laadOp() {
		this.meterBatterij = 200;
	}
	
	public static int aantalGSM() {
		return aantal;
	}

}
