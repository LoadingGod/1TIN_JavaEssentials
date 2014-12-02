package be.plx.opdracht3_boek;

public class Boek {
	private String isbn;
	private String titel;
	private String schrijver;
	private int bladzijden;
	
	public Boek(){
		
	}
	public Boek(String isbn,String titel,String schrijver,int bladzijden){
		this.isbn=isbn;
		this.titel=titel;
		this.schrijver=schrijver;
		this.bladzijden=bladzijden;
	}
	public void toonBoekGegevens()
	{
		System.out.println("isbn-nummer : " + isbn);
		System.out.println("titel       : " + titel);
		System.out.println("schrijver   : " + schrijver);
		System.out.println("bladzijden  : " + bladzijden);
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getSchrijver() {
		return schrijver;
	}
	public void setSchrijver(String schrijver) {
		this.schrijver = schrijver;
	}
	public int getBladzijden() {
		return bladzijden;
	}
	public void setBladzijden(int bladzijden) {
		this.bladzijden = bladzijden;
	}

}