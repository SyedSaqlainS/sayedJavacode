package basic;

public class FactorialEx {
	public static void main(String args[]) {
		
		int fact = 1;
		int num = 5;
		// It is the number to calculate factorial
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " = " + fact);
		
		//While loop
		int fact1=1;
		int num1 = 3;
		int i =1;
		while(i<=num1) {
			fact1 = fact1 * num1;
			i++;
		}
		 System.out.println("Factorial using while loop of " + num1 + " = " + fact1);  
	//do while
		 int fact2=1;
			int num2 = 100;
			int i1 =1;
			 do{
				fact2 = fact2 * num2;
				i1++;
			}
			 while(i1<=num1); {
			 System.out.println("Factorial using do while loop of " + num2 + " = " + fact2);  
		
	}

}
}
