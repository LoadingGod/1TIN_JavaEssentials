package repr_ex;

public class Huisnummer {
	
	private int nummer;
	private char symbool;
	
	public Huisnummer(int nummer, char symbool) {
		if (nummer < 1000 && nummer > 0) {
			this.nummer = nummer;	
		} else {
			this.nummer = -1;
		}
		if (Character.isLetter(symbool) || Character.isWhitespace(symbool)) {
			this.symbool = symbool;	
		} else {
			this.symbool = ' ';
		}		
	}
	
	public Huisnummer(Huisnummer h1) {
		this(h1.nummer, h1.symbool);
	}
	
	public String getHuisnummer() {
		return this.nummer + "" + this.symbool;
	}
	
//	public boolean equals(Huisnummer h1) {
//		if (this.nummer == h1.nummer && this.symbool == h1.symbool) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public boolean equals (Object obj) {
		if (obj instanceof Huisnummer) {
			if (((Huisnummer) obj).getHuisnummer().equals(this.getHuisnummer())){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
