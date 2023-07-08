package Inheritance;

class Vehicle{
	void display() {
		int num = 90;
		System.out.println("parent class"+num);
	}
	
}
class Bikes extends Vehicle{
	void display1() {
		System.out.println("1st child");
	}
}

class Car extends Vehicle{
	void display2(){
		System.out.println("2nd child");
	}
}


public class Hierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car h=new Car();
		h.display();
		h.display2();
		Bikes b=new Bikes();
		b.display1();
		
		

	}

}