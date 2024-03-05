package javaAssignments;

public class ConstOverloading {
	
	ConstOverloading() //constructor1
	{
		System.out.println("Constructor 1");
	}
	
	ConstOverloading(int a) //constructor2
	{
		System.out.println("Constructor 2");
	}
	
	ConstOverloading(int a, int b, double d, String s) //constructor3
	{
		System.out.println("Constructor 3");
		System.out.println(a);
		System.out.println(s);
	}
	
	ConstOverloading(String s) //constructor4
	{
		System.out.println("Constructor 4, My name is Jayashree");
	}
	
	ConstOverloading(char c,String s) //constructor5
	{
		System.out.println("Constructor 5");
		System.out.println("Gender:"+c);
		System.out.println("Name:"+s);
	}
	
	ConstOverloading(float f, double d) //constructor6
	{
		System.out.println("Constructor 6");
		System.out.println(f);
		System.out.println(d);
		System.out.println("Rate="+(f+d));
	}
	
	ConstOverloading(int i,long mobileNum, String name) //Constructor7
	{
		System.out.println("Constructor 7");
		System.out.println(i);
		System.out.println(mobileNum);
		System.out.println(name);
	}
	
	ConstOverloading(int a, int b)//Constructor8
	{
		System.out.println("Constructor 8");
		System.out.println("Addition of a and b = "+(a+b));
	}
	
	public static void main(String[] args) {
		
		new ConstOverloading(); //constructor1
		new ConstOverloading(10,20,39.46,"jaya"); //constructor3
		new ConstOverloading(10); //constructor2
		new ConstOverloading("name"); //constructor4
		new ConstOverloading(23.4f,564.65); //constructor6
		new ConstOverloading('F',"Rani"); //constructor5
		new ConstOverloading(25,987654321,"manu"); //Constructor7
		new ConstOverloading('F'); //constructor9
		new ConstOverloading(20,30); //constructor8
		new ConstOverloading(10,"Sachit",1,'B',"Bailhongal");//constructor10
	}
	
	ConstOverloading(char gender) //constructor9
	{
		System.out.println("Constructor 9");
		System.out.println("Gender: " +gender);
	}
	
	ConstOverloading(int rollNum, String name, int cls, char section, String city) //constructor10
	{
		System.out.println("Constructor 10");
		System.out.println("Roll number: "+rollNum);
		System.out.println("Student Name: "+name);
		System.out.println("Class: "+cls);
		System.out.println("Section: "+section);
		System.out.println("City: "+city);		
		
	}
}
