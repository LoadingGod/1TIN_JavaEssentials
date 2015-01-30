package repr_ex;

public abstract class Structuur {

	Huisnummer nummer;

	public Structuur(Huisnummer h1) {
		this.nummer = new Huisnummer(h1);
	}

	public abstract void beschrijf();

	public Huisnummer getNummer() {
		return this.nummer;
	}
	
//	public boolean equals(Structuur s1) {
//		if (this.nummer.equals(s1.getNummer())) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public boolean equals (Object obj) {
		if (obj instanceof Structuur) {
			if (((Structuur) obj).getNummer().equals(this.nummer)){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
