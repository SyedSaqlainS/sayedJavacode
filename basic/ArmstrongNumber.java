package basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//double m = Math.pow(3, 3);
		// Math Power
		int num = 153;
		int rem = 0, temp = num;
		double sum = 0;

		while (temp != 0) {
			rem = temp % 10;
			sum = sum + Math.pow(rem, 3);
			temp = temp / 10;

		}
		System.out.println("Sum "+sum);

		if (sum == num)

		{
			System.out.println("Is Amstrong");
		} else {
			System.out.println("Not Amstrong");
		}

	}
}
