
public class Hond {
	String grootte, naam, chip, activiteit;
//default constructor
	
	public Hond() {		
	}

//constructor w/ parameters
	
	public Hond( int grootte, String naam, String chip, String activiteit) { 
		if (grootte < 70) {
			this.grootte = "klein";
		} else {
			this.grootte = "groot";
		}
		this.naam = naam;
		if (chip.length() == 15) {
			for (int i = 0; i <= 14; i++) {
				if (Character.isDigit(chip.charAt(i))) {
					this.chip += chip.charAt(i);
				} else {
					System.out.println("Foutief ISO-Nummer!");
					break;
				}
			}
		} else {
			System.out.println("Foutief ISO-Nummer!");
		}
		this.activiteit = activiteit;
	}
	
	public void setGrootte(int grootte) {
		if (grootte < 70) {
			this.grootte = "klein";
		} else {
			this.grootte = "groot";
		}
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public void setChip(String chip) {
		if (chip.length() == 15) {
			for (int i = 0; i <= 14; i++) {
				if (Character.isDigit(chip.charAt(i))) {
					this.chip += chip.charAt(i);
				} else {
					System.out.println("Foutief ISO-Nummer!");
					break;	// uit loop gaan wanneer char geen digit is
				}
			}
		} else {
			System.out.println("Foutief ISO-Nummer!");
		}
	}
	
	public void setActiviteit(String activiteit) {
		this.activiteit = activiteit;
	}
	
	public String getGrootte() {
		return this.grootte;
	}
	
	public String getNaam() {
		return this.naam;
	}
	
	public String getChip() {
		return this.chip;
	}
	
	public String getActiviteit() {
		return this.activiteit;
	}
	
	public void blaf() {
		if (grootte.equals("klein")) {
			System.out.println("wafwaf");
		} else {
			System.out.println("WOAAAFF");
		}
	}
	
	public void loop() {
		if (grootte.equals("klein")) {
			System.out.println("tippel tippel");
		} else {
			System.out.println("ZOEF ZOEF");
		}
	}
	
	public void zit() {
		if (activiteit.equals("zit")) {
			System.out.println("De hond zit");
		}
	}
}
