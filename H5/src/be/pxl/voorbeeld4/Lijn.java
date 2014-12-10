package be.pxl.voorbeeld4;

public class Lijn extends GrafischElement{
	private double hoek, lengte ;
	public Lijn(double x, double y, 
			 double hoek, double lengte) {
		super(x, y);
		this.hoek = hoek;
		this.lengte= lengte;
	}
	public void teken() {
		System.out.println("Lijn: startpunt = (" + 						
			super.getX() + "," + super.getY() +"), "+
			"hoek = " + hoek + ", lengte = " + lengte);
	}
	public void herschaal(double factor) {
		lengte = lengte * factor;
	}
}
