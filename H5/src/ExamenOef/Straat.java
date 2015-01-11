package ExamenOef;

import java.util.ArrayList;

public class Straat implements Doorloopbaar {

	private ArrayList<Structuur> structuren;

	public Straat() {
		this.structuren = new ArrayList<Structuur>();
	}

	@Override
	public int geefAantal() {
		return structuren.size();
	}

	@Override
	public Object geefWaarde(int i) {
		return new Integer(i);
	}

	public void voegStructuurToe(Structuur s) {
		for (Structuur s1 : structuren) {
			if (s1.getNummer().getHuisnummer() != s.getNummer().getHuisnummer()) {
				structuren.add(s);
			}
		}
	}

}
