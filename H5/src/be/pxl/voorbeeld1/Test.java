package be.pxl.voorbeeld1;

public class Test {
	public static void main(String[] args) {
		final Cirkel c1  = new Cirkel();
		System.out.println(c1.getStraal());
		c1.setStraal(12.2);
		System.out.println(c1.getStraal());
		Cirkel c2 = new Cirkel();;
		//c1 = c2;
	}

}
