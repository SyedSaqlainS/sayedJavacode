package Inheritance;

import java.util.Scanner;

//SuperClass 
class Student1 {
	String name;

	Student1(String nm) {
		name = nm;
		System.out.println(name);
	}
}

//Subclass 
class Developer1 extends Student1 {
	String role;
	String name;
	public Developer1(String role, String name) {
//Super As Constructor
		super(name);
		this.role = role;
		System.out.println(role);
	}
}

public class SingleInheritanceConstructor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Role ane Name");
		String role = scan.next();
		String name = scan.next();
		Developer1 d1 = new Developer1(role, name);

	}

}
