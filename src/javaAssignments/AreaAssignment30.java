package javaAssignments;

import java.util.Scanner;

public class AreaAssignment30 {
	
	final static double pi=3.14;
	
	public void circle(int r) 
	{
		double area=2*r*r;
		System.out.println("Area of circle: "+area);
		
		double circum=2*pi*r;
		System.out.println("Circumference of circle = "+circum);
	}
	
	void triangleArea(int b, int h)
	{
		double tArea=0.5*b*h;
		 
		 System.out.println("Area of Triangle = "+tArea);
	}
	
	void triangleCircum(int s1, int s2, int s3)	 
	{
		 int tcircum=s1+s2+s3;
		 
		 System.out.println("Circumference of Triangle = "+tcircum);
	}

	static void square(int a)
	{
		int area=a*a;
		System.out.println("Area of Square = "+area);		
		
		int circum=4*a;
		System.out.println("Circumference of Square = "+circum);
	}
	
	static void rectangle(int l, int w)
	{
		double area=l*w;
		System.out.println("Area of Rectangle = "+area);
		
		double circum=(2*l)+(2*w);
		System.out.println("Circumference of Rectangle = "+circum);
	}
	
	void trapeziumArea(int b1, int b2, int h)
	{
		double area=0.5*h*(b1+b2);
		
		System.out.println("Area of trapezium = "+area);
	}
	
	void trapeziumCircum(int s1, int s2, int s3, int s4)
	{
		int circum=s1+s2+s3+s4;
		System.out.println("Circumference of trapezium = "+circum);
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int radius=scan.nextInt();
		
		AreaAssignment30 ar=new AreaAssignment30();
		ar.circle(radius);
		
		System.out.println("Enter base and height of triangle");
		int base=scan.nextInt();
		int height=scan.nextInt();
		
		ar.triangleArea(base, height);
		
		System.out.println("Enter 3 sides of triangle");
		int side1=scan.nextInt();
		int side2=scan.nextInt();
		int side3=scan.nextInt();
		
		ar.triangleCircum(side1, side2, side3);
		
		System.out.println("Enter side of square");
		int side=scan.nextInt();
		
		square(side);
		
		System.out.println("Enter length and width of rectangle");
		int length=scan.nextInt();
		int width=scan.nextInt();
		
		rectangle(length,width);
		
		System.out.println("Enter base1, base2 and height of trapezium");
		int base1=scan.nextInt();
		int base2=scan.nextInt();
		int height1=scan.nextInt();
		
		ar.trapeziumArea(base1, base2, height1);
		
		System.out.println("Enter 4 sides of trapezium");
		int sid1=scan.nextInt();
		int sid2=scan.nextInt();
		int sid3=scan.nextInt();
		int sid4=scan.nextInt();
		
		ar.trapeziumCircum(sid1, sid2, sid3, sid4);

	}

}
