package Inheritance;

//super class
class laptop {
	String name = "HP";

	laptop(String name) {
		this.name = "Laptop i have is";
		System.out.println(this.name);
	}
}

//subclass
class HP extends laptop {

	String model;
	String name;

	HP(String name, String model) {
		super(name);
		this.model = "RYzEN";

		System.out.println("Model is :" + this.model);
	}

}

class Version extends HP {
	String brand;
	String model;
	String name;

	Version(String name, String brand, String model) {
	super(name,model);
	
	this.brand = brand;
	System.out.println("Brand is :" +this.brand);
	}

}

public class Multilevel {

	public static void main(String[] args) {
		Version v = new Version("laptop", "hp", "model");
		

	}

}