package javaAssignments;

import java.util.Scanner;

public class ScannerAssignment {
	
	void add(int a, int b) //non static method with local variables
	{		
		int add=a+b;
		System.out.println("Addition: "+add);	
	}
	
	void sub(int a, int b) //non static method with local variables
	{		
		int sub=a-b;
		System.out.println("Subtraction: "+sub);	
	}
	
	static void multi(int a, int b) //static method with local variables
	{		
		int mul=a*b;
		System.out.println("Multiplication: "+mul);	
	}
	
	void div(int a, int b) //non static method with local variables
	{		
		int div=a/b;
		System.out.println("Division: "+div);	
	}
	
	static void mod(int a, int b) //static method with local variables
	{		
		int mod=a%b;
		System.out.println("Modulus: "+mod);	
	}

	
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in); //local variables are taken from scanner
		int num1=s1.nextInt();
		int num2=s1.nextInt();
		
		ScannerAssignment sa=new ScannerAssignment();
		sa.add(num1, num2); //passing scanner inputs as a parameters in methods
		sa.sub(num1, num2); //non static method invoke
		multi(num1, num2); //static method invoke
		sa.div(num1, num2);
		mod(num1, num2);
		
	}
	

}
