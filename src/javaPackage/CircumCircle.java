package javaPackage;

import java.util.Scanner;

class CircumCircle {
	
	final static double pi=3.14;
	
	void circle(int r) 
	{
		double area=2*r*r;
		System.out.println("Area of circle: "+area);
		
		double circum=2*pi*r;
		System.out.println("Circumference of circle = "+circum);
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int radius=scan.nextInt();
		
		CircumCircle ar=new CircumCircle();
		ar.circle(radius);
	
		
	}

}
