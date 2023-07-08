package basic;

public class ArrayEx {

	public static void main(String[] args) {
		int num[] = { 2, 3, 4 };
		int j[][] = { { 1, 2 }, { 4, 5 } };
		System.out.println("j[0][0] :" + j[0][0]);
		System.out.println("j[0][1] :" + j[0][1]);
		System.out.println("j[1][0] :" + j[1][0]);
		System.out.println("j[1][0] :" + j[1][1]);
		System.out.println(num.length);

		int a[][] = { { 1, 2 }, { 4, 5 } };
		System.out.println("a[0][0]: " + a[0][0]);
		System.out.println("a[0][1]: " + a[0][1]);
		System.out.println("a[1]0]: " + a[1][0]);
		System.out.println("a[1][1]: " + a[1][1]);
		// System.out.println(num.length);
		for (int i = 0; i < 2; i++) { // row
			for (int j1 = 0; j1 < 2; j1++) { // column
				System.out.println(a[i][j1]);
			}

		}

		//
		int k[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println("a[0][0]: " + a[0][0]);
		System.out.println("a[0][1]: " + a[0][1]);
		System.out.println("a[1]0]: " + a[1][0]);
		System.out.println("a[1][1]: " + a[1][1]);
		// System.out.println(num.length);
		for (int i = 0; i < 2; i++) { // row
			for (int k1 = 0; k1 < 2; k1++) { // column
				System.out.println(a[i][k1]);
			}

		}
	}

}
