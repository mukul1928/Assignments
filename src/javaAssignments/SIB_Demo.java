package javaAssignments;

public class SIB_Demo {
	
	//SIB - Static Initialization Block
	
	static //SIB - executes before main method 
	{
		System.out.println("SIB");
	}
	
	SIB_Demo() //constructor
	{
		System.out.println("Constructor");
	}
	
	//IIB - Instance Initialization Block
	{
		System.out.println("IIB"); //IIB - invoke by just creating object
	}

	public static void main(String[] args) {
		
		System.out.println("Main method"); //main method will be executed after SIB
		new SIB_Demo(); //creating object
		
		//when we create object IIB will execute first then constructor will execute
		
	}

}
