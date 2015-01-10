package Oef01;

import java.util.ArrayList;
import java.util.LinkedList;


public class Oef01 {
	
	public static void main(String[] args) {
	
		int aantal = Integer.parseInt(args[0]) ;
		int minimum =Integer.parseInt(args[1]) ;
		int maximum = Integer.parseInt(args[2]) ;
		int som = 0;
		double gemiddelde;
		
		ArrayList<Integer> getallen = new ArrayList<Integer>();
		
		for (int i = 0; i < aantal; i++) {
			int temp = Invoer.leesInt("Geef getal in: ");
			if (temp < minimum) {
				getallen.add(minimum);
			} else if (temp > maximum) {
				getallen.add(maximum);
			} else {
				getallen.add(temp);
			}
		}
		
		for (int temp : getallen) {
			som += temp;
		}
		
		gemiddelde = (double)som / aantal;
		
		System.out.println("Maximum: " + maximum + "\tMinimum: " + minimum + "\tGemiddelde: " + gemiddelde);
		
		Integer[] getallenlijst = getallen.toArray(new Integer[0]);
		
		for (int i = 0; i < getallenlijst.length; i++) {
			System.out.println(getallenlijst[i]);
		}
		
		LinkedList<Integer> linkedlijst = new LinkedList<Integer>();
		
		for (int i = 0; i < getallenlijst.length; i++) {
			linkedlijst.add(getallenlijst[i]);
		}
		
		for (int i = 0; i < linkedlijst.size(); i++) {
			System.out.println(linkedlijst.get(i));
		}
	}
	
	
	

}
