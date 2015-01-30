package H2_Oef03;

public class test {
	
	public static void main(String[] args) {
		Bankrekening b1 = new Bankrekening("FRA0001", 500.2, 4801);
		b1.setBenedenGrens(-200);
		System.out.println(b1);
		b1.haalAf(500, 4801);
		b1.stortop(300, 4801);
		b1.haalAf(500, 4801);
		b1.toonRekening();
	}

}
