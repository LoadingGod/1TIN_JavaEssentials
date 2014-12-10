package be.pxl.voorbeeld1;

public class Cirkel {
	private final double PI = 3.1415;
	private double straal;

	public double getOmtrek() {
		return 2 * PI * straal;
	}
	public double getStraal() {
		return straal;
	}
	public void setStraal(double straal) {
		this.straal = straal;
	}
	public void setPi(double p) {
		//this.PI = p;
	}

}
