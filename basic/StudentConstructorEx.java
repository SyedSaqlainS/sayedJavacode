package basic;

public class StudentConstructorEx {
	int rno;
	String name;

	public StudentConstructorEx(StudentConstructorEx s) {
		rno = s.rno;
		name = s.name;
	}

	public StudentConstructorEx() {
		rno = 12345;
		name = "BMW";
	}

	public StudentConstructorEx(int rno, String nm) {
		this.rno = rno;
		name = nm;
	}

	public StudentConstructorEx(String nm) {
		rno = 33;
		name = nm;
	}

	void display() {
		System.out.println("Student Roll number " + rno);
		System.out.println("Student Name " + name);

	}

	public static void main(String[] args) {

		StudentConstructorEx s = new StudentConstructorEx(); // object
		s.rno = 123;
		s.name = "Saqeeb";
		s.display();
		StudentConstructorEx s1 = new StudentConstructorEx();
		s1.rno = 1234;
		s1.name = "Saqlain";
		s1.display();
		StudentConstructorEx s2 = new StudentConstructorEx();// default
		s2.display();
		StudentConstructorEx s3 = new StudentConstructorEx(11, "Audi"); // Parametrerzed
		s3.display();
		StudentConstructorEx s4 = new StudentConstructorEx(s); // copy
		s4.display();
		StudentConstructorEx s5 = new StudentConstructorEx("Fiza"); // Parametrerzed
		s5.display();
	}

}
