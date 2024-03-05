package typeCastingPackage;

class Parent_class
{
	void add()
	{
		System.out.println("Addition");
	}
}

public class UpCasting extends Parent_class
{
	
	void subject()
	{
		System.out.println("subject method");
	}

	public static void main(String[] args) {
		
		Parent_class c1=new UpCasting();
		c1.add();
	}

}
