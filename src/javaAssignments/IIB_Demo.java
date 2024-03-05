package javaAssignments;

public class IIB_Demo {
	
	//multiple IIBs are called using single object
	{
		System.out.println("IIB1");
	}
	
	{
		System.out.println("IIB2");
	}
	
	{
		System.out.println("IIB3");
	}

	public static void main(String[] args) {
		
		new IIB_Demo(); //object 1 calls all 3 IIBs
		new IIB_Demo(); //object 2 calls all 3 IIBs
		new IIB_Demo();	//object 3 calls all 3 IIBs

	}

}
