package inheritancePackage;

class Parent_one
{
	public void add()
	{
		System.out.println(2+2);
	}
}

class Parent_two extends Parent_one
{
	public void sub()
	{
		System.out.println(10-8);
	}
}

class Parent_three extends Parent_two
{
	public void multi()
	{
		System.out.println(5*5);
	}
}

public class MultipleInheritancePractice extends Parent_three{
	
	public void div()
	{
		System.out.println(100/10);
	}

	public static void main(String[] args) {
		
		MultipleInheritancePractice m2=new MultipleInheritancePractice();
		m2.add();
		m2.sub();
		m2.multi();
		m2.div();
	}

}
