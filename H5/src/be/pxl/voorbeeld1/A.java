package be.pxl.voorbeeld1;

public class A {
	private int x;

	public final void print() {
		System.out.println("A: print ");
		System.out.println("x = " + x);
	}
	public int getX() {
		System.out.println("A: getX ");
		return x;
	}
	public void setX(int x) {
		System.out.println("A: setX ");
		this.x = x;
	}

}
