
public class Test {

	public static void main(String[] args) {
		Persoon p = new Persoon("Frankie", "Claessens");
		String vn = p.geefVoornaam();
		System.out.println(vn);
		Persoon.drukGroepen(12);

	}

}
