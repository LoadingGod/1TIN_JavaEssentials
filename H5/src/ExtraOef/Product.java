package ExtraOef;

public abstract class Product implements EtiketDrukker{
	protected String ID;
	
	public Product(String ID) {
		this.ID = ID;
	}
}
