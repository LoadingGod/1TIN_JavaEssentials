package be.plx.opdracht3_boek;

public class TestBoek {
	
	public static void toonHoofdLetters(String tekst){
		System.out.println("----->");
		System.out.println(tekst.toUpperCase());
		System.out.println("-------->");
	}
	
	
	public static void main(String[] args) {
		String titel="begin van de toepassing";
		toonHoofdLetters(titel);
		Boek b1=new Boek();
		Boek b2=new Boek("0-7645-6874-4","Beginning Java tm 2", "Ivor Horton",1470);
		b1.toonBoekGegevens();
		b2.toonBoekGegevens();
		System.out.println("Titel van de boek 2" + b2.getTitel());
		Boek b3=new Boek("0-9999-9999-9","BlaBlaBla", "Frankie Claessens",2780);
		System.out.println("Aantal Bladzijden: " + b1.getBladzijden() + b2.getBladzijden() + b3.getBladzijden());
		toonHoofdLetters(b3.getSchrijver());
	}

}
