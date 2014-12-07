package Oef4_Extra;

public class Datum {
	int dag, maand, jaar;
	
	Datum() {
		dag = 1;
		maand = 1;
		jaar = 2013;
	}
	
	Datum(int dag, int maand, int jaar ){
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}
	
	Datum(Datum d) {
		this.dag = d.dag;
		this.maand = d.maand;
		this.jaar = d.jaar;
	}
	
	public int getDag() {
		return this.dag;
	}
	
	public int getMaand() {
		return this.maand;
	}
	
	public int getJaar() {
		return this.jaar;
	}
	
	public void setDag(int dag) {
		this.dag = dag;
	}
	
	public void setMaand(int maand) {
		this.maand = maand;
	}
	
	public void setJaar(int jaar) {
		this.jaar = jaar;
	}
	
	public String toString() {
		return dag + "/" + maand + "/" + jaar;
	}
	
	public void toon() {
		System.out.println(this.toString());
	}
	
	public void setDatum(int dag, int maand, int jaar){
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}
}
