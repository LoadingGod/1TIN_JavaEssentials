package be.pxl.voorbeeld3;

public class Boot implements Bewegend, Beschrijving {
	private int snelheid;
	private String naam;

	public Boot(int snelheid, String naam){
		this.snelheid = snelheid;
			this.naam=naam;
	}
	public void stop() {
		snelheid = 0;
	}
	public void versnel() {
		snelheid += verhoging;
	}
	public void versnel(int v) {
		snelheid += v;
	}
	public void geefBeschrijving() {
		System.out.println("De boot " + naam + 
			" heeft snelheid " + snelheid);
	}
}
