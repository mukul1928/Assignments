package javaAssignments;

public class StaticMethodDemo {
	
	static void add() //static method
	{
		System.out.println("Addition method");
	}

	public static void main(String[] args) {
		
		System.out.println("calling static method inside main method");
		
		add(); // static methods are called directly by name
		
	}

}
