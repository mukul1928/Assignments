package javaAssignments;

public class NonStaticDemo {
	
	void add()
	{
		int a=100;
		int b=200;
		System.out.println("addition " +(a+b));
	}

	public static void main(String[] args) {
		
		System.out.println("start");
		
		NonStaticDemo s1=new NonStaticDemo(); //creating object with reference variable
		s1.add(); //calling non static method in main method
	}

}
