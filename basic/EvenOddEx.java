package basic;

import java.util.Scanner;

public class EvenOddEx {

	public static void main(String[] args) {
		try (Scanner sc1 = new Scanner(System.in)) {
			int n = sc1.nextInt();
			
			
			
			if (n % 2 == 0) {
				System.out.println("The given number is " + n + " is even");
			} else {
				System.out.println("The given number is " + n + " is odd");
			}
		}

	}

}
