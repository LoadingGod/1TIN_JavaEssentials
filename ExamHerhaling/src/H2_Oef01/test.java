package H2_Oef01;

public class test {
	
	public static void main(String[] args) {
		GSM g1 = new GSM();
		GSM g2 = new GSM("Samsung", "+32478608364");
		g1.toonGSM();
		g2.toonGSM();
		g2.setNaamEigenaar("Claessens");
		g2.setVoornaamEigenaar("Frankie");
		g2.laadOp();
		g2.toonGSM();
		g2.tick();
		g2.toonGSM();
	}

}
