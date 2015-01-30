package repr_ex;

public class Test {
	
	public static void main(String[] args) {
		Straat s = new Straat();
		s.voegStructuurToe(new Huis("Jan", new Huisnummer(12, 'a')));
		s.voegStructuurToe(new Huis("Geert", new Huisnummer(12, 'a')));
		s.voegStructuurToe(new Park(new Huisnummer(13, 'b')));

		for (int i = 0; i < s.geefAantal(); i++) {
			((Structuur) s.geefWaarde(i)).beschrijf();
			}
	}

}
