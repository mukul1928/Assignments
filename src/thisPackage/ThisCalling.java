package thisPackage;

public class ThisCalling {
	
	ThisCalling()
	{
		this(100); //this calling statement calling ThisCalling(int a)
		System.out.println("Constructor 1");
	}
	ThisCalling(int a)
	{
		this(23.5,100);
		System.out.println("Constructor 2");
	}
	ThisCalling(double a, int b)
	{
		this("jaya");
		System.out.println("Constructor 3");
	}
	ThisCalling(String s)
	{
		this('n');
		System.out.println("Constructor 4");
	}
	ThisCalling(char c)
	{
		System.out.println("Constructor 5");
	}
	
	public static void main(String[] args) {
		
		ThisCalling tc=new ThisCalling(); //calling non parameterized constructor
		
	}

}
