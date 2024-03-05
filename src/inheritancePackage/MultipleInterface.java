package inheritancePackage;

interface Parent1 //these 2 parents don't have relation
{
	void add();
	void sub();
}

interface Parent2
{
	void mul();
	void div();
}

interface Parent3
{
	void circle();
}

interface Parent4
{
	void square();
}

public class MultipleInterface implements Parent1,Parent2,Parent3,Parent4 //multiple inheritance
{

	public static void main(String[] args) {
		
		MultipleInterface c1=new MultipleInterface();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
		c1.circle();
		c1.square();
	}

	public void mul() {
		System.out.println("multiplication");
		
	}

	public void div() {
		System.out.println("division");
		
	}

	public void add() {
		System.out.println("addition");
		
	}

	public void sub() {
		System.out.println("subtraction");
		
	}

	public void square() {
		System.out.println("Square method");
		
	}

	public void circle() {
		System.out.println("Circle method");
		
	}

}
