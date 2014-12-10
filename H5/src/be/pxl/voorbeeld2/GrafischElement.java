package be.pxl.voorbeeld2;

public abstract class GrafischElement {
	private double x, y;
	public GrafischElement(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void wijzigXY(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public abstract void teken();
	public abstract void herschaal(double factor);
}
