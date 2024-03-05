package inheritancePackage;

class Supermostparent //grand parent
{
	void add() {
		System.out.println("add");
	}
	
	void sub() {
		System.out.println("sub");
	}
	
}

class Superparent extends Supermostparent //parent inheriting grand parent
{
	void multi() {
		System.out.println("multi");
	}
	
	void div() {
		System.out.println("div");
	}
	
}

public class MultilevelInheritance extends Superparent //child inheriting parent
{
	
	void mod() {
		System.out.println("mod");
	}

	public static void main(String[] args) 
	{
		
		MultilevelInheritance m1=new MultilevelInheritance();
		m1.add();
		m1.sub();
		m1.multi();
		m1.div();
		m1.mod();

	}

}
