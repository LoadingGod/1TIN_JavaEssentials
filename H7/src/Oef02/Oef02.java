package Oef02;

public class Oef02 {
	
	public static void main(String[] args) { 
		Object[] objecten = {new Byte("5"), new Short("5"), new Integer(5), new Long(5), new Float(5.0), new Double(5.0), new Character('5'), new Boolean(true)};
		
		for (int i = 0; i < objecten.length; i++) {
			System.out.println(objecten[i].getClass());
		}
		
	}

}
