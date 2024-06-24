package javaAssignments;

public class MainMethodOverloading {
	public static void main(String name)
	{
		System.out.println("main method can be overloaded");
	}
	
	public static void main(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void main()
	{
		System.out.println("main method non parameterized");
	}

	public static void main(String[] args) 
	{
		main();
		main("jaya");
		main(14,26);
	}

}
