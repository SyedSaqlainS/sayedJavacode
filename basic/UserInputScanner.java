package basic;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur name ?");
		String name;
		name = sc.nextLine();
		// System.out.println(" name is :"+name);

		System.out.println("enter ur age ");
		int a;
		a = sc.nextInt();
		// System.out.println("name is : " + name);
		// System.out.println("age is " + a);

		System.out.println("enter ur percentage ");
		float f;
		f = sc.nextFloat();
		System.out.println("Name is : " + name);
		System.out.println("Age is " + a);
		System.out.println("Percenatge is " + f);
		 
		System.out.println("enter number b , c and d ");
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if (b > c && b > c) {
			System.out.println("number " + b);
		}
		// System.out.println("number " +b);

		else if (c > b && b > d) {
			System.out.println("number " + c);
		} 
		else {
			System.out.println("number " + d);
		}

	}

}
