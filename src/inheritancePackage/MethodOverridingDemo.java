package inheritancePackage;

class Parent
{
	void add() //method in parent class
	{
		int a=10;
		int b=15;
		System.out.println(a+b);
	}
}

class Child extends Parent
{
	void add() //method in child class with same name but different implementation
	{
		System.out.println("method overriding demo");
	}
}

public class MethodOverridingDemo 
{

	public static void main(String[] args) {
		
		Child c1=new Child();
		c1.add(); //child class method will be displayed and parent class method will be overridden
		
		Parent p1=new Parent();
		p1.add(); //when parent class object is created, parent class method will be invoked

	}

}
