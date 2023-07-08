package basic;

import java.util.Scanner;

public class PracticeAOEx {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter the opertors /, +, *, -");
		String op = scan1.nextLine();
		int a = 10, b = 10;
		op="Division";

		switch (op) {
		case "Addition":
			System.out.println("addition" + (a + b));
			break;

		case "Division":
			System.out.println("division" + (a / b));
			break;

		case "Subtraction":
			System.out.println("Subtraction" + (a - b));
			break;
		case "Multiplication":
			System.out.println("addition" + (a * b));
			break;
		default: System.out.println("invalid op");

		}

	}

}
