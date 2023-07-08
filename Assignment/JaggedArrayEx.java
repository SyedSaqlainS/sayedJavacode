package Assignment;

public class JaggedArrayEx {

	public static void main(String[] args) {
		// an array of arrays of which the member
		// arrays can be of different lengths,
		// producing rows of jagged edges when
		// visualized as output.

		int a[][] = new int[3][];
		a[0] = new int[] { 1, 2, 3, 4, 5 };
		a[1] = new int[] { 11, 12, 13, 14, 15 };
		a[2] = new int[] { 1, 1, 1, 1, 1 };

		System.out.println("Elements of Jagged array");
		for (int i = 0; i < a.length; i++) {// row
			for (int j = 0; j < a[i].length; j++)// col
				System.out.print(a[i][j] + " ");
			System.out.println();// next line
		}

	}
}
