package javaAssignments;

public class MultipleSIB_Demo {
	
	//multiple SIBs will be executed sequentially
	static
	{
		System.out.println("SIB 1");
	}
	
	static
	{
		System.out.println("SIB 2");
	}
	
	static
	{
		System.out.println("SIB 3");
	}
	
	static
	{
		System.out.println("SIB 4");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method ececution");

	}

}
