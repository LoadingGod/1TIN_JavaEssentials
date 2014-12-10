package be.pxl.voorbeeld4;

public abstract class GrafischElement implements Tekenbaar, Herschaalbaar {
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
}
