package basic;

public class TreePatternEx {

	public static void main(String[] args) {
		System.out.println("Pattern Of the Tree");
		System.out.println();
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Reverse Of the Tree");
		System.out.println();

		int row = 6;
		for (int i = 1; i <= row; i++) {
			for (int j = row; j >= i; j--) {
				System.out.print(i + "* ");
			}
			System.out.println();
		}

		System.out.println("Big Tree");
		System.out.println();
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		int row1 = 6;
		for (int i = 1; i <= row1; i++) {
			for (int j = row1 - 1; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Peers code
		System.out.println("Peers code Elancheliyan");
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}

		System.out.println("Left Triangle");
		// i for rows and j for columns
		// row denotes the number of rows you want to print
		int i, j;
		// Outer loop work for rows
		for (i = 0; i < 6; i++) {
			// inner loop work for space
			for (j = 2 * (6 - i); j >= 0; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (j = 0; j <= i; j++) {
				// prints star
				System.out.print("* ");
			}
			// throws the cursor in a new line after printing each line
			System.out.println();
		}

//Pyramind

		System.out.println("Pyramid");

		for (int i1 = 1; i1 <= 5; i1++) {
			// Print spaces before the stars
			for (int j1 = 1; j1 <= 5 - i1; j1++) {
				System.out.print(" ");
			}

			// Print stars
			for (int k = 1; k <= i1; k++) {
				System.out.print("* ");
			}

			// Move to the next line
			System.out.println();
		}

		System.out.println("Pooja maam code");
		int row2 = 3;
		for (int i2 = 0; i2 < row2; i2++) {

			for (int j2 = row2 - i2; j2 > 1; j2--) {

				System.out.print(" ");
			}

			for (int j2 = 0; j2 <= i; j2++) {
				System.out.print("* ");
			}
			System.out.println(); // Newline
		}
		
		System.out.println("Break Statement");
		int i3=0;
		while(i3<5) {
			if(i3==2) {
				i3++;
				break;
			}	
			System.out.println(i3++);
		}
		
		System.out.println("continue Statement");
		int i4=0;
		while(i4<5) {
			if(i4==2) {
				i4++;
				continue;
			}	
			System.out.println(i4++);
		}
		
	}

}
