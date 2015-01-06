public class Demo {

	public static void main(String[] args) {
		int x = 0;
		int[][] a;
		a = new int[5][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = x++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}
