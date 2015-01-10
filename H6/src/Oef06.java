import java.util.ArrayList;


public class Oef06 {

	public static void main(String[] args) {
	
		ArrayList<Integer> afdeling = new ArrayList<Integer>();
		ArrayList<Integer> sporten = new ArrayList<Integer>();
		ArrayList<Integer> afdAantal = new ArrayList<Integer>();
		ArrayList<Integer> sportAantal = new ArrayList<Integer>();
		int afdVar = Invoer.leesInt("Geef de afdeling in: ");
		int afdNummer = 1;
		while (afdVar != 0) {
			int sportVar = Invoer.leesInt("Geef de sport in: ");
			afdeling.add(afdVar);
			sporten.add(sportVar);
			afdVar = Invoer.leesInt("Geef de afdeling in: ");
		}
		
		for (int i = 0; i < afdeling.size(); i++) {
			if (afdeling.get(i).equals(afdNummer)) {
			}
			++afdNummer;
		}
		
		System.out.println("Afdeling " + afdeling.get(i) + ":\t" + afdAantal);
		afdAantal = 0;
		
	}
}
