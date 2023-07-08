package basic;

public class RevEx {

	public static void main(String[] args) {
		// Reverse of the number

		int rev = 0;
		int num = 123;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;

		}
		System.out.println("rev num: " + rev);

		// Palindrome
		int num1 = 454;
		int r = 0, temp = 0;
		int rev1 = 0;

		while (num1 != 0) {
			r = num1 % 10;
			rev = rev * 10 + r;
			num1 = num1 / 10;
		}

		System.out.println("rev num: " + rev1);
		if (temp == r) {
			System.out.println("The number is Pali");

		} else {
			System.out.println("The number is not Pali");
		}

		// Reverse of the string using String Builder

		String s = "abc";
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println("Reverse of the String using String Builder :" + sb);

		// Reverse of the string using String Builder
		String s1 = "abc";
		StringBuffer sb1 = new StringBuffer(s1);
		// sb1.append(s1);
		sb1.reverse();
		System.out.println("Reverse of the String using String Buffer :" + sb1);
		// Reverse The String using for Loop

		String s12 = "Welcome";
		String rev11 = "";
		for (int i = s12.length() - 1; i >= 0; i--) {
			rev11 = rev11 + s12.charAt(i);

		}
		System.out.println("Reverse of the String using For Loop :" + rev11);

		// Check for palindrome
		String s123 = "Malayalam";
		String rev111 = "";
		for (int i = s123.length() - 1; i >= 0; i--) {
			rev111 = rev111 + s123.charAt(i);

		}
		System.out.println("Reverse of the String using For Loop :" + rev111);
		if (s123.equalsIgnoreCase(rev111)) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is Not Palindrome");
		}
	}
}
