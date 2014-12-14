package Oef01;

public class Achtergrond implements TekenObject{
	private String kleur;
	private boolean doorschijnend;
	
	public Achtergrond(String kleur, boolean doorschijnend){
		this.kleur = kleur;
		this.doorschijnend = doorschijnend;
	}
	public void teken() {
		System.out.println("Achtergr kleur = " + kleur +
				", doorschijnend= " + doorschijnend) ;
	}
}
