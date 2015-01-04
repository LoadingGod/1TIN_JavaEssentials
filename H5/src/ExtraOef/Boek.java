package ExtraOef;

public class Boek extends Product{
	private String titel, auteur;
	public Boek(String ID, String titel, String auteur) {
		super(ID);
		this.titel = titel;
		this.auteur = auteur;
		}

	@Override
	public void drukEtiket() {
		System.out.println("ID:\t"+ super.ID + "\nTitel:\t" + this.titel + "\nAuteur:\t" + this.auteur);
			}

}
