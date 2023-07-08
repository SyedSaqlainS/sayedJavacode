package basic;

public class ConstructorOverloadingEx {
	ConstructorOverloadingEx() {
		System.out.println("default");
		System.out.println("Introduction:");
	}
	ConstructorOverloadingEx(String name) {
		System.out.println("Name: " + name);
	}
	ConstructorOverloadingEx(String scname, int rollNo) {
		System.out.println("School name: " + scname + ", " + "Roll no:" + rollNo);
	}
	public static void main(String[] args) {
		ConstructorOverloadingEx p1 = new ConstructorOverloadingEx();
		ConstructorOverloadingEx p2 = new ConstructorOverloadingEx("Hanu");
		ConstructorOverloadingEx p3 = new ConstructorOverloadingEx("Greenfinger", 12);
		
	}

}
