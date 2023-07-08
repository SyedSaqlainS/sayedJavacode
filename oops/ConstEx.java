package oops;

public class ConstEx {
	// instance variables of the class
	int id;
	String name;

	public void Student() {
					System.out.println("this a default constructor");
				}

	public void Student(int i, String n) {
					id = i;
					name = n;
				}

	public static void main(String[] args) {

		// object creation
		Student s = new Student();
		System.out.println("\nDefault Constructor values: \n");
		System.out.println("Student Id : " + s.id + "\nStudent Name : " + s.name);

		System.out.println("\nParameterized Constructor values: \n");
		Student student = new Student(10, "David");
		System.out.println("Student Id : " + student.id + "\nStudent Name : " + student.name);
	}
}
