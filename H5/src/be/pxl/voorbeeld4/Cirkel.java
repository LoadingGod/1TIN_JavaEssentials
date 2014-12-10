package be.pxl.voorbeeld4;

public class Cirkel extends GrafischElement {
	private double straal;

	public Cirkel(double x, double y, double straal) {
		super(x, y);
		this.straal = straal;
	}

	@Override
	public void teken() {
		System.out.println(	"Cirkel: middelpunt = (" + 					
				super.getX() + "," + 
				super.getY() +"), "+
				"straal = " + straal);
	}

	@Override
	public void herschaal(double factor) {
		straal += factor;

	}

}
