package javaPackage;

public class Local_Global_Demo {
	
	String name1="India"; //Non static global variable declaration and initialization
	
	static int m=100; // static global variable declaration and initialization
	
	char c; //Non static global variable declaration
	
	void method1()
	{
		c='J'; //Non static global variable initialization - we can initialize in method
		
		char gender1 = 'F'; //Local variable declaration and initialization
		char gender2 = 'M';
		System.out.println(gender1);	
	}

	public static void main(String[] args) {
		
		int a=10;				//local variables declaration and initialization
		String name="jaya";
		
		System.out.println(m); //static global variables can be called directly
		
		Local_Global_Demo m1=new Local_Global_Demo();
		m1.method1();
		
		System.out.println(m1.name1); //calling Non static global variables by creating object
		System.out.println(m1.c);

	}

}
