package ExamenOef;

public class Huisnummer {
	private int getal;
	private char symbool;
	
	public Huisnummer(int getal, char symbool) {
		if (getal > 0 && getal < 1000) {
			this.getal = getal;
		} else {
			this.getal = -1;
		}
		
		if (Character.isLetter(symbool) || Character.isSpaceChar(symbool)) {
		this.symbool = symbool;	
		} else {
			this.symbool = ' ';
		}
	}
	
	public Huisnummer(Huisnummer h1) {
		this.getal = h1.getal;
		this.symbool = h1.symbool;
	}
	
	public String getHuisnummer() {
		return this.getal + "" + this.symbool;
	}
	
	public boolean equals(Huisnummer h1) {
		if (h1.getal == this.getal && h1.symbool == this.symbool) {
			return true;
		} else {
			return false;
		}
	}
}
