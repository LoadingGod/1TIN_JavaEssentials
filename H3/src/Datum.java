
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
	
	int getDag() {
		return this.dag;
	}
	
	int getMaand() {
		return this.maand;
	}
	
	int getJaar() {
		return this.jaar;
	}
	
	void setDag(int dag) {
		this.dag = dag;
	}
	
	void setMaand(int maand) {
		this.maand = maand;
	}
	
	 void setJaar(int jaar) {
		this.jaar = jaar;
	}
	
	public String toString() {
		return dag + "/" + maand + "/" + jaar;
	}
	
	void toon() {
		System.out.println(this.toString());
	}
}
