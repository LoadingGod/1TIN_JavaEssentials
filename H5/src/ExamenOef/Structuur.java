package ExamenOef;

public abstract class Structuur {
	
	private Huisnummer nummer;
	
	public Structuur(Huisnummer h1) {
		nummer = new Huisnummer(h1);
	}
	
	public abstract void beschrijf();
	
	public Huisnummer getNummer() {
		return this.nummer;
	}
	
	public boolean equals(Huisnummer h1) {
		if (h1.getHuisnummer() == nummer.getHuisnummer()) {
			return true;
		} else {
			return false;
		}
	}


}
