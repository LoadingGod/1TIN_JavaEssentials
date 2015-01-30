package H7_Oef07;

import java.util.ArrayList;
import java.util.LinkedList;

public class Oef {

	public static void main(String[] args) {
		int aantal = Integer.parseInt(args[0]);
		int minimum = Integer.parseInt(args[1]);
		int maximum = Integer.parseInt(args[2]);
		int som = 0;
		ArrayList<Integer> getallen = new ArrayList<Integer>();

		for (int i = 0; i < aantal; i++) {
			int getal = Invoer.leesInt("Geef een getal in: ");
			if (getal < minimum) {
				getallen.add(minimum);
			} else {
				if (getal > maximum) {
					getallen.add(maximum);
				} else {
					getallen.add(getal);
				}
			}
		}
		
		for (int temp : getallen) {
			som += temp;
		}
		
		double gem = (double) som / getallen.size();
		
		System.out.println("Het minimum is: " + minimum + "\nHet maximum is: " + maximum + "\nHet gemiddelde is: " + gem);
		
		Integer[] arrayGetallen = getallen.toArray(new Integer[0]);
		for (int temp : arrayGetallen) {
			System.out.println(temp);
		}
		
		LinkedList<Integer> LLgetallen = new LinkedList<Integer>();
		
		for (int i = 0; i < arrayGetallen.length; i++) {
			LLgetallen.add(arrayGetallen[i]);
		}
		
		for (int temp : LLgetallen) {
			System.out.println(temp);
		}
		
	}

}
