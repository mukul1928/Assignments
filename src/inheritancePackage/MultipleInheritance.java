package inheritancePackage;

interface Employee //interface
{
	void name();
	void salary();
}

abstract class Employee1 implements Employee //abstract class is inheriting interface
{
	abstract void dept();
	abstract void id();
	
	void email()
	{
		System.out.println("jaya@gmail.com");
	}
	
	void contact()
	{
		System.out.println("9876543210");
	}
	
}

abstract class Employee2 extends Employee1 //abstract class is inheriting abstract class
{
	abstract void dept2();
	abstract void id2();
}


public class MultipleInheritance extends Employee2 //concrete class is inheriting abstract class
{
	
	void company()
	{
		System.out.println("wipro");
	}
	
	static void address()
	{
		System.out.println("bangalore");
	}

	public static void main(String[] args) 
	{
		MultipleInheritance m1=new MultipleInheritance();
		m1.name();
		m1.salary();
		m1.dept();
		m1.id();
		m1.email();
		m1.contact();
		m1.dept2();
		m1.id2();
		m1.company();
		address();
	}

	void dept2() {
		System.out.println("testing");
		
	}

	void id2() {
		System.out.println("emp100");
		
	}

	void dept() {
		System.out.println("development");
		
	}

	void id() {
		System.out.println("emp200");
		
	}

	public void name() {
		System.out.println("jayashree");
		
	}

	public void salary() {
		System.out.println("50000");
		
	}

}
