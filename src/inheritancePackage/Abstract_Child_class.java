package inheritancePackage;

abstract class Parent_class //abstract class - exposing outside
{
	abstract void add(); //abstract method - only non static
	abstract void sub();
	
	void multi() //concrete method non static
	{
		System.out.println("expose 1");
	}
	
	static void mod() //concrete method static
	{
		System.out.println("expose 2");
	}
}

public class Abstract_Child_class extends Parent_class //main class inheriting abstract class

{
	void add() //abstract method implementation in main class
	{
		System.out.println("one"); // real logic and not exposed
	}
	
	public static void main(String[] args) //concrete
	{
		
		Abstract_Child_class c1=new Abstract_Child_class();
		c1.add();
		c1.sub();
		c1.multi();
		mod();
	}
	
	void sub() {
		
		System.out.println("two");
		
	}

}
