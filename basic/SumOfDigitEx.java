package basic;

public class SumOfDigitEx {

	public static void main(String[] args) {
		int num =24;
		int rem, sum=0;
		while(num!=0) {
			rem=num%10; //removing last digit
			sum=sum+rem; //adding reminder to sum
			num=num/10;   //dividing a number by 10
			System.out.println(rem);
			
		}
		
		System.out.println(sum);
	}
}

	
	
	