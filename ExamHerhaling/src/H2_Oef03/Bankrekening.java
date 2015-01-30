package H2_Oef03;

public class Bankrekening {

	private String bankrekeningNummer;
	private int pinCode;
	private double benedenGrens;
	private double saldo;
	private int aantalPogingen;
	private int statusRekening;

	public Bankrekening() {
		this.saldo = 0;
		this.pinCode = 0;
		this.aantalPogingen = 0;
		this.statusRekening = 0;
	}

	public Bankrekening(String bankrekeningNummer, double saldo, int pinCode) {
		this.bankrekeningNummer = bankrekeningNummer;
		this.saldo = saldo;
		if (this.saldo < 0) {
			this.saldo = 0;
		}
		this.pinCode = pinCode;
		if (this.pinCode < 0 || this.pinCode < 9999) {
			this.pinCode = 0000;
		}
	}

	public void stortop(double bedrag, int pinCode) {
		if (checkPinBlock(pinCode)) {
			this.saldo += bedrag;
		}
	}

	public void haalAf(double bedrag, int pinCode) {
		if (checkPinBlock(pinCode)) {
			if (bedrag > this.saldo + Math.abs(benedenGrens)) {
				System.out.println("Saldo ontoereikend!");
			} else {
				this.saldo -= bedrag;
			}
		}
	}

	private boolean checkPinBlock(int pinCode) {
		if (pinCode == this.pinCode || this.statusRekening != 2) {
			return true;
		} else {
			++aantalPogingen;
			if (aantalPogingen > 3) {
				this.statusRekening = 2;
			}
			return false;
		}

	}

	public String toString() {
		return "Bankrekeningnummer:" + this.bankrekeningNummer + "\nPincode: "
				+ this.pinCode + "\nBenedengrens: " + this.benedenGrens
				+ "\nSaldo: " + this.saldo + "\nAantal Pogingen: "
				+ this.aantalPogingen + "\nStatus rekening: "
				+ this.statusRekening;

	}

	public void toonRekening() {
		System.out.println("Bankrekeningnummer:" + this.bankrekeningNummer
				+ "\nPincode: " + this.pinCode + "\nBenedengrens: "
				+ this.benedenGrens + "\nSaldo: " + this.saldo
				+ "\nAantal Pogingen: " + this.aantalPogingen
				+ "\nStatus rekening: " + this.statusRekening);
	}

	public String getBankrekeningNummer() {
		return bankrekeningNummer;
	}

	public void setBankrekeningNummer(String bankrekeningNummer) {
		this.bankrekeningNummer = bankrekeningNummer;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public double getBenedenGrens() {
		return benedenGrens;
	}

	public void setBenedenGrens(double benedenGrens) {
		this.benedenGrens = benedenGrens;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAantalPogingen() {
		return aantalPogingen;
	}

	public void setAantalPogingen(int aantalPogingen) {
		this.aantalPogingen = aantalPogingen;
	}

	public int getStatusRekening() {
		return statusRekening;
	}

	public void setStatusRekening(int statusRekening) {
		this.statusRekening = statusRekening;
	}

}
