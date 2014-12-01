public class Bankrekening {
	String bankrekeningnummer;
	int pincode;
	double benedengrens, saldo;
	int statusrekening;
	int aantalpogingen;

	public Bankrekening() {
		this.saldo = 0;
		this.pincode = 0000;
		this.aantalpogingen = 0;
		this.statusrekening = 0;
	}

	public Bankrekening(String bankrekeningnummer, double saldo, int pincode) {
		if (saldo < 0) {
			this.saldo = 0;
		}
		if (pincode > 999 && pincode < 10000) {
			this.pincode = pincode;
		} else {
			this.pincode = 0000;
		}
		this.statusrekening = 0;
	}

	public void stortOp(int pincode, double bedrag) {
		if (checkPinBlock(pincode) == true) {
			this.saldo += bedrag;
			this.statusrekening = 1;
		}
	}

	public void haalAf(int pincode, double bedrag) {
		if (checkPinBlock(pincode) == true) {
			this.saldo -= bedrag;
			this.statusrekening = 1;
		}
	}

	public boolean checkPinBlock(int pincode) {
		boolean value = false;
		if (this.statusrekening == 2) {
			System.out.println("Rekening geblokkeerd!");
			value = false;
		} else if (pincode == this.pincode) {
			value = true;
		} else {
			System.out.println("Foutieve Pin!");
			aantalpogingen++;
			if (aantalpogingen > 2) {
				statusrekening = 2;
			}
			value = false;
		}
		return value;
	}

	public void getMaxAmount(int pincode) {
		if (checkPinBlock(pincode) == true) {
			System.out.println("Max amount = " + saldo + 1500);
		} else {
			System.out.println("Max bedrag opvragen niet mogelijk!");
		}
	}

	public void getBankAccountInfo() {
		String status = "";
		if (statusrekening == 2) {
			status = "Geblokkeerd";
		} else if (statusrekening == 1) {
			status = "Actief";
		} else {
			status = "Nieuwe rekening";
		}
		System.out.println("Rekeningnummer: " + bankrekeningnummer
				+ "\nPincode: " + pincode + "\nBenedengrens: " + benedengrens
				+ "\nSaldo: " + saldo + "\nAantal Pogingen: " + aantalpogingen
				+ "Status Rekening: " + status);
	}

}
