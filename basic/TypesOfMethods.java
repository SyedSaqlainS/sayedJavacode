package basic;

class Operation1 {
	void addition(int a, int b, int c) {
		System.out.println("Addition of 3 numbera " + (a + b + c));
	}

	int divide(int a, int b) {
		return a / b;
	}

	int multiply(int a, int b) {
		return a * b;
	}

	int Subtract(int a, int b) {
		return a - b;
	}
}

public class TypesOfMethods {

	public static void main(String[] args) {
		Operation1 o = new Operation1();
		o.addition(1, 20, 3);
		o.divide(10, 2);
		o.multiply(2, 10);
		o.Subtract(100, 4);
		System.out.println("Multiplication of 2 numbers " + o.multiply(3, 40));
		System.out.println("Division of 2 numbers " + o.divide(100, 5));
		System.out.println("Subtraction of 2 numbers " + o.Subtract(10000, 3000));
	}
}

//modifier returnType nameOfMethod (Parameter List) {
// method body
