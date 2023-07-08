package basic;

class NewStatic {
	void addition(int a, int b, int c) {
		System.out.println("the addition of 3 numbers is: " + (a + b + c));

	}

	int division(int a, int b) {
		return a / b;
	}

	String displayName(String s) {

		return "welcome " + s;

	}
}

public class DisplayName {

	public static void main(String[] args) {

		NewStatic s = new NewStatic();
		s.addition(2, 3, 4);
		int value = s.division(4, 2);
		System.out.println(s.displayName("Saqlain"));
		System.out.println(value);

	}

}