package be.pxl.voorbeeld3;

public class Auto implements Bewegend{
	private int snelheid;
	private String nummerplaat;

	public Auto(int snelheid, String nummerplaat){
		this.snelheid = snelheid;
		this.nummerplaat = nummerplaat;
	}
	public void stop() {
		snelheid =0;
	}
	public void versnel() {
		snelheid += verhoging;
	}
	public void versnel(int v) {
		snelheid += v;
	}
}


