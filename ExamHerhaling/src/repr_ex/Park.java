package repr_ex;

public class Park extends Structuur{

	public Park(Huisnummer h1) {
		super(h1);
	}

	@Override
	public void beschrijf() {
		System.out.println("Park gelegen op nummer " + this.nummer.getHuisnummer());
		
	}

	
}
