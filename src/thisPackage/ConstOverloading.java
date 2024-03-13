package thisPackage;

public class ConstOverloading {
	
	ConstOverloading() //constructor1
	{
		this(10);
		System.out.println("Constructor 1");
	}
	
	ConstOverloading(int a) //constructor2
	{
		this(10,12,15.5,"jaya");
		System.out.println("Constructor 2");
	}
	
	ConstOverloading(int a, int b, double d, String s) //constructor3
	{
		this("jaya");
		System.out.println("Constructor 3");
		System.out.println(a);
		System.out.println(s);
	}
	
	ConstOverloading(String s) //constructor4
	{
		this('s',"jnm");
		System.out.println("Constructor 4, My name is Jayashree");
	}
	
	ConstOverloading(char c,String s) //constructor5
	{
		this(20.4f, 356.34);
		System.out.println("Constructor 5");
		System.out.println("Gender:"+c);
		System.out.println("Name:"+s);
	}
	
	ConstOverloading(float f, double d) //constructor6
	{
		this(10, 9876567, "sachu");
		System.out.println("Constructor 6");
		System.out.println(f);
		System.out.println(d);
		System.out.println("Rate="+(f+d));
	}
	
	ConstOverloading(int i,long mobileNum, String name) //Constructor7
	{
		this(20,30);
		System.out.println("Constructor 7");
		System.out.println(i);
		System.out.println(mobileNum);
		System.out.println(name);
	}
	
	ConstOverloading(int a, int b)//Constructor8
	{
		this('m');
		System.out.println("Constructor 8");
		System.out.println("Addition of a and b = "+(a+b));
	}
	
	ConstOverloading(char gender) //constructor9
	{
		this(19,"sachit",1,'B',"Bailhongal");
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

	public static void main(String[] args) {
		
		new ConstOverloading(); //creating object and invoking non parameterized constructor
		
	}

}
