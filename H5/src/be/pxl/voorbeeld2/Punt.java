package be.pxl.voorbeeld2;

public class Punt extends GrafischElement {
	

	public Punt(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void teken() {
		System.out.println(	"Lijn: startpunt = (" + 					
				super.getX() + "," + 
				super.getY());

	}

	@Override
	public void herschaal(double factor) {
		// TODO Auto-generated method stub

	}

}
