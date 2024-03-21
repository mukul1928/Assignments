package inheritancePackage;

interface One
{
	void add();
	void substract();
}

public class InterfaceDemo implements One
{
	void rect_area()
	{
		System.out.println("Rectangle area");
	}
	
	void circle_area()
	{
		System.out.println("Area of circle");
	}

	public static void main(String[] args) 
	{
		InterfaceDemo id=new InterfaceDemo();
		id.add();
		id.substract();
		id.rect_area();
		id.circle_area();
	}
	
	public void add() {
		
		System.out.println("The real logic of add");
	}

	
	public void substract() {
		
		System.out.println("The real logic of subtract");
	}

}
