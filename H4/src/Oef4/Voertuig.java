package Oef4;

public class Voertuig {
	protected String merk, type;
	protected int bouwjaar;
	protected static int aantal = 0;
	
	public Voertuig() {
		++aantal;
	}
	
	public Voertuig(String merk, String type, int bouwjaar) {
		this.merk = merk;
		this.type = type;
		this.bouwjaar = bouwjaar;
		++aantal;
	}
	
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBouwjaarl() {
		return bouwjaar;
	}
	public void setBouwjaarl(int bouwjaarl) {
		this.bouwjaar = bouwjaarl;
	}
	
	public static int getAantal() {
		return aantal;
	}
	
	public void drukAf() {
		System.out.println("Merk: " + merk + "\nType: " + type + "\nBouwjaar: " + bouwjaar);
	}
	
	
}
