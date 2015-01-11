package ExamenOef;

public class Huis extends Structuur {
	String eigenaar;
	public Huis(String eigenaar, Huisnummer h1) {
		super(h1);
		this.eigenaar = eigenaar;
	}
	
	public void beschrijf() {
		System.out.println(this.eigenaar + "woont op nummer " + super.getNummer().getHuisnummer());
	}
}
