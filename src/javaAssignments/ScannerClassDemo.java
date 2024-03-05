package javaAssignments;

import java.util.Scanner;

public class ScannerClassDemo {
	
	static int num1; //global variables
	static int num2;
	
	void add()
	{
		System.out.println("Addition of num1 and num2 = "+(num1+num2));
	}
	
	void substract()
	{
		System.out.println("Subtraction of num1 and num2 = "+(num1-num2));
	}
	
	static void multiply()
	{
		System.out.println("Multiplication of num1 and num2 = "+(num1*num2));
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number 1:");
		num1=s.nextInt();
		System.out.println("Enter number 2:");
		num2=s.nextInt();
		
		ScannerClassDemo s1=new ScannerClassDemo();
		s1.add();
		s1.substract();
		multiply();
		s1.div();
		mod();		

	}
	
	void div()
	{
		System.out.println("Division of num1 and num2 = "+(num1/num2));
	}
	
	static void mod()
	{
		System.out.println("Modulus of num1 and num2 = "+(num1%num2));
	}

}

