package Inheritance;

//SuperClass 
class Student {
	String name = "saqeeb";

	void display() {
		System.out.println(name);
	}
}

//Subclass 
class Developer extends Student {
	String role ="Full Stack";
	
	void displayRole() {
		System.out.println(role);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Developer d1 = new Developer();
		d1.display();
		d1.display();

	}

}
