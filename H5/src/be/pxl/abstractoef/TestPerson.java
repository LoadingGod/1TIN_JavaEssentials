package be.pxl.abstractoef;

public class TestPerson {
	
	public static void main(String[] args) {
		Person[] rij = {new Student(), new Staff()};
		
		for (int i = 0; i <= 1; i++) {
			rij[i].printAll();
		}
	}

}
