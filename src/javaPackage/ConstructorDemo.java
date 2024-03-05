package javaPackage;

public class ConstructorDemo {
	
	ConstructorDemo()
	{
		System.out.println("this is constructor");
	}
	void name() {
		String name="jayashree sureban";
		System.out.println(name);
	}
	static void multiply() {
		int a=20, b=15;
		System.out.println("Multiplication of a and b = "+(a*b));
	}

	public static void main(String[] args) {
		
		System.out.println("this is main method");
		ConstructorDemo s1=new ConstructorDemo(); //calling constructor
		add(); //calling static method
		s1.substract(); //calling non static method
		s1.name();
		multiply();
		//new ConstructorDemo(); //another way of calling constructor
		
	}
	static void add() {
		int a=10, b=5;
		System.out.println("Addition of a and b = "+(a+b));
	}
	
	void substract() {
		double d=25.25, d1=30.75;
		System.out.println("Substraction of d1 and d = "+(d1-d));
	}

}
