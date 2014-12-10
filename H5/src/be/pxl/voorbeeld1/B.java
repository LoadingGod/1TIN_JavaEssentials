package be.pxl.voorbeeld1;

public class B extends A {
	public void print() {
		System.out.println("B: print ");
		System.out.println("x = " + super.getX());
	}
	public void print(int aantal){
		System.out.println("B: print ");
		for(int i = 0; i < aantal; i++){
			System.out.println("x = " + super.getX());
		}
	}
	public void setX(int x) {
		System.out.println("B: setX ");
		super.setX(x);
	}
}

