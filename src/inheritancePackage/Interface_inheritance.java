package inheritancePackage;

interface Jaya
{
	void circle();
	void triangle();
}

interface Two extends Jaya
{
	void square();
	void rectangle();
}

interface Three extends Two
{
	void jaya();
}

public class Interface_inheritance implements Three
{

	void add()
	{
		System.out.println("addition");
	}
	
	static void disp()
	{
		System.out.println("display");
	}
	
	public static void main(String[] args) {
		
		Interface_inheritance s1=new Interface_inheritance();
		s1.add();
		disp();
		s1.circle();
		s1.triangle();
		s1.square();
		s1.rectangle();

	}

	public void circle() {
		
		System.out.println("circle");
	}

	public void triangle() {
		
		System.out.println("triangle");
		
	}

	public void square() {
		
		System.out.println("square");
		
	}

	public void rectangle() {
		
		System.out.println("rectangle");
		
	}

	
	public void jaya() {
		System.out.println("jayashree sureban");
		
	}

}
