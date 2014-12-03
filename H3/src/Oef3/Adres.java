package Oef3;

public class Adres {
	private String straat, huisnr, postcode, gemeente;
	public Adres(String straat, String huisnr, String postcode, String gemeente) {
		this.straat = straat;
		this.huisnr = huisnr;
		this.postcode = postcode;
		this.gemeente = gemeente;
		if (postcode.length() == 4) {
		for (int i = 0; i <= 3; i++) {
			if (Character.isDigit(postcode.charAt(i))) {
				this.postcode += postcode.charAt(i);
			} else {
				i = 4;
				this.postcode = "9999";
			}
		}
		} else {
			this.postcode = "9999";
		}
	}
	
	public String getStraat() {
		return straat;
	}
	
	public String getHuisnr() {
		return huisnr;
	}
	
	public String getPostcode() {
		return postcode;
	}
	
	public String getGemeente() {
		return gemeente;
	}
}
