package javaAssignments;

public class SIB2IIB2 {
	
	SIB2IIB2()
	{
		System.out.println("constructor");
	}
	
	static
	{
		System.out.println("SIB 1");
	}
	
	{
		System.out.println("IIB 1");
	}

	static
	{
		System.out.println("SIB 2");
	}
	
	{
		System.out.println("IIB 2");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main method");
		new SIB2IIB2();
	}

}
