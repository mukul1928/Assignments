package typeCastingPackage;

public class Jayashree {
	
	void add()
	{
		System.out.println("addition");
	}

	public static void main(String[] args) {
		
		Object obj=new Jayashree();	// upcasting
		System.out.println(obj.getClass());

	}

}
