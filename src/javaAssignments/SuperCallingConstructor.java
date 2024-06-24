package javaAssignments;

class G_Parent
{
	G_Parent(int a, int b)
	{
		System.out.println("Grand parent constructor");
	}
}

class Parent extends G_Parent
{
	Parent(String name)
	{
		super(10,20); //super calling G_parent class constructor in parent class explicitly
		System.out.println("Parent constructor");
	}
}

public class SuperCallingConstructor extends Parent
{
	SuperCallingConstructor()
	{
		super("Jaya"); //super calling parent class constructor in child class explicitly
		System.out.println("Main or child class constructor");
	}

	public static void main(String[] args) {
		
		new SuperCallingConstructor(); //object of child
	}

}
