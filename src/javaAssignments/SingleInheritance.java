package javaAssignments;

class SingleParent //parent class
{
	void addition()
	{
		int a=10, b=15;
		System.out.println("Addition = "+(a+b));
	}
}

public class SingleInheritance extends SingleParent //child class inheriting parent class
{
	void sub()
	{
		int a=25, b=15;
		System.out.println("Subtraction = "+(a-b));
	}

	public static void main(String[] args) {
		
		SingleInheritance s1= new SingleInheritance();
		s1.addition();
		s1.sub();

	}

}
