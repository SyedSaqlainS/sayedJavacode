package Assignment;

public class CloneArrayEx {

	public static void main(String[] args) {
		// single dimension memory address different
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int clonea[] = a.clone();
		System.out.println(a.length);
		// Deep copy is created following print statement will print false

		System.out.println(a == clonea);

		for (int i = 0; i < clonea.length; i++) {
			System.out.print(clonea[i] + " ");
		}

		// multi dimension /shalow copy memory address same
		int b[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		int cloneb[][] = b.clone();

		System.out.println(b == cloneb);

		// shallow copy is created following print statement will print true
		System.out.println(b[0] == cloneb[0]);

		System.out.println(b[1] == cloneb[1]);

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("=>" + b[i][j]);
			}
		}

		for (int i = 0; i < cloneb.length; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("=>" + cloneb[i][j] + " ");
			}

		}
		// Jagged Array
		// an array of arrays of which the member
		// arrays can be of different lengths,
		// producing rows of jagged edges when
		// visualized as output.

		int arr[][] = new int[5][];

		arr[0] = new int[] { 99, 100, 101 };
		arr[1] = new int[] { 199, 200 };
		arr[2] = new int[] { 299, 300, 301, 302, 303 };
		arr[3] = new int[] { 2, 3 };
		arr[4] = new int[] { 6, 89, 90, 45 };

		System.out.println("Elements of  Jagged Array");

		for (int i = 0; i < arr.length; i++) {// row
			for (int j = 0; j < arr[i].length; j++)// col
				System.out.print(arr[i][j] + " ");
			System.out.println();// next line]

		}
	}

}
