package basic;

class NewStatic1{
	void addition(int a, int b, int c) {
		System.out.println("the addition of 3 numbers is: "+ (a+b+c));
		
	}
	
	int division(int a, int b){
		return a/b;
	}
	
	String displayName(String s) {
		
		return "welcome "+ s ;
		
	}
	
	public static int multiply(int a, int b) {
		return a*b;
		
	}
}

public class StaticMethods {

	public static void main(String[] args) {
	
		NewStatic1 s=new NewStatic1();
		s.addition(2, 3, 4);
		int value=s.division(4, 2);
		System.out.println(s.displayName("Sharly"));
		System.out.println(value);
		int k=NewStatic1.multiply(5, 6);
		System.out.println(k);
		
		

	}

}
