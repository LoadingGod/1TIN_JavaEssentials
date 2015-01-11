package ExamenOef;

public class Park extends Structuur{

	public Park(Huisnummer h1)  {
		super(h1);
	}
	
	public void beschrijf() {
		System.out.println("Park gelegen op nummer " + this.getNummer().getHuisnummer());
	}
}
