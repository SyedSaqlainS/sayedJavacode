package basic;
class Student {
	public static int fee = 123;
	public static String name = "saqeeb";
	//String degree = "BE";
}

public class StaticEx {
	public static void main(String[] args) {
		String name1 = "Syed";
		Student.fee=100;
		System.out.println("Fee "+Student.fee);
		Student.name="Saqlain";
		System.out.println("Name "+Student.name);
		System.out.println("Name "+name1);
		
		
		
		//ex for craeting object class
		//Student s = new Student();
		//System.out.println("Fee "+s.degree);
	}

}
