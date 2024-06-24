package inheritancePackage;

class parent_super_class
{
	void method1()
	{
		System.out.println(2+5);
	}
}

public class SuperKeywordDemo extends parent_super_class {
	
	void method1()
	{
		super.method1();
		System.out.println(9-6);
	}

	public static void main(String[] args) {
		
		SuperKeywordDemo s1=new SuperKeywordDemo();
		s1.method1();
	}

}
