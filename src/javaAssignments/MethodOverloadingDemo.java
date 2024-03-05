package javaAssignments;

public class MethodOverloadingDemo {
	
	void add()
	{
		System.out.println("Non static method 1");
	}
	void add(int a)
	{
		System.out.println("Non static method 2");
	}
	void add(int x, int y)
	{
		System.out.println("Non static method 3");
	}
	void add(char c)
	{
		System.out.println("Non static method 4");
	}
	static void add(int a, double b)
	{
		System.out.println("Static method 1");
	}
	static void add(String s)
	{
		System.out.println("Static method 2");
	}
	static void add(double a, int b)
	{
		System.out.println("Static method 3");
	}
	static void add(boolean c)
	{
		System.out.println("Static method 4");
	}

	public static void main(String[] args) {
		
		MethodOverloadingDemo mo=new MethodOverloadingDemo(); //creating object with ref variable
		mo.add(); //calling non static methods using ref variable
		mo.add(5);
		mo.add(10, 20);
		mo.add('F');
		add(20,23.25); //calling static methods
		add("Jaya");
		add(256.309,100);
		add(true);
	}

}
