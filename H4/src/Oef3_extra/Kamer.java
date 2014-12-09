package Oef3_extra;

public class Kamer {
	private String nummer;
	private String type;
	
	public Kamer() {
		this.nummer = "Z000";
		this.type = "Standaard";
	}

	public String getNummer() {
		return nummer;
	}

	public void setNummer(String nummer) {
		this.nummer = nummer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void drukAf() {
		char blok = this.nummer.charAt(0);
		char verdiep = this.nummer.charAt(1);
		String kamer = this.nummer.substring(2);
		
		System.out.println("Blok: " + blok + "Verdiep: " + verdiep + "Kamer: " + kamer + "Type: " + type);
		
	}
}
