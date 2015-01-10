package Oef03;

public class Kamer {
	private String nummer;
	private String type;
	private Gast gast; 
	public Kamer(){
		this.nummer = "Z000";
		this.type = "standaard";		
	}
	
	public Kamer(String nummer, String type) {
		this.nummer = nummer;
		this.type = type;
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
	public void printgegevens(){
		System.out.print("blok " + nummer.substring(0,1)+ "\t");
		System.out.print("verdiep " + nummer.substring(1,2)+ "\t");
		System.out.print("kamer " + nummer.substring(2) + "\t");
		System.out.println("klasse " + this.getType());
	
		
		if (gast != null) 
		     gast.drukAf();
	}
	
	
    public void uitboekenKamer(){
    	gast = null;
    }
	public Gast getGast() {
		return gast;
	}

	public void setGast(Gast gast) {
		this.gast = gast;
		
	}
	
	@Override
	public boolean equals(Object object) {
		if (object instanceof Kamer && ((Kamer) object).nummer.equals(this.nummer)){
			return true;
		} else {
			return false;
		}
	}

}
