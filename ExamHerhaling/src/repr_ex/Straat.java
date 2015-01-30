package repr_ex;

import java.util.ArrayList;

public class Straat implements Doorloopbaar {

	private ArrayList<Structuur> structuren;

	public Straat() {
		structuren = new ArrayList<Structuur>();
	}

	public void voegStructuurToe(Structuur s) {
		
		// indexOf gebruiken
		
		int pos = structuren.indexOf(s);
		if (pos == -1) {
			structuren.add(s);
		} else {
			System.out.println("Deze structuur bestaat al in deze straat!");
		}
		
		// contains

//		if (!structuren.contains(s)) {
//			structuren.add(s);
//		} else {
//		System.out.println("Deze structuur bestaat al in deze straat!");
//		}
		
		
		//for each
		
//		boolean found = false;
//		for (Structuur structuur : structuren) {
//		    if (structuur.equals(s)) {
//		       found = true;
//		    }
//		}
//
//		if (!found) {
//		    structuren.add(s);
//		} else {
//		System.out.println("Deze structuur bestaat al in deze straat!");
//	}
	}

	@Override
	public int geefAantal() {
		return structuren.size();
	}

	@Override
	public Object geefWaarde(int i) {
		return structuren.get(i);
	}

}
