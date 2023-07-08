package oops;

class Privatedemo {
	private int b = 1;

	private void display() {
		System.out.println("b :" + b);

	}

}

public class PrivateAccessEx {
	private int a;

	public static void main(String[] args) {
		Privatedemo d = new Privatedemo();
		//System.out.println("Value of b:" + d.b);// error when we put private in line 4
		d.display();
		PrivateAccessEx p = new PrivateAccessEx();
		p.a = 10;

		System.out.println(p.a);

	}

}
