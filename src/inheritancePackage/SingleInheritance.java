package inheritancePackage;

class ParentClass //parent class
{
	void method1()
	{
		System.out.println("Method 1");
	}
	
	static void method2(int a)
	{
		System.out.println(a);
	}
}

public class SingleInheritance extends ParentClass //child class
{
	
	void method3(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static void method4()
	{
		System.out.println("Method 4");
	}

	public static void main(String[] args) {
		
		SingleInheritance s1=new SingleInheritance();
		s1.method1();
		method2(10);
		s1.method3(20, 30);
		method4();
		
	}

}
