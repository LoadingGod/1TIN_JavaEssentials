package be.pxl.voorbeeld4;

public class Achtergrond implements Tekenbaar{
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
