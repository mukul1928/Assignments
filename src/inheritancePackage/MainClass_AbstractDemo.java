package inheritancePackage;

abstract class Third_class
{
	abstract void method3();
	abstract void method4();
	
	void add1()
	{
		System.out.println("addition 1");
	}
	
	void add2()
	{
		System.out.println("addition 2");
	}
}

abstract class Second_class extends Third_class
{
	abstract void method1();
	abstract void method2();
	
	void add3()
	{
		System.out.println("addition 3");
	}
	
	void add4()
	{
		System.out.println("addition 4");
	}
}

public class MainClass_AbstractDemo extends Second_class{
	
	public static void main(String[] args) {
		
		MainClass_AbstractDemo m1=new MainClass_AbstractDemo();
		m1.add1();
		m1.add2();
		m1.add3();
		m1.add4();
		
		m1.method1();
		m1.method2();
		m1.method3();
		m1.method4();

	}

	@Override
	void method1() {
		System.out.println("method 1");
		
	}

	@Override
	void method2() {
		System.out.println("method 2");
		
	}

	@Override
	void method3() {
		System.out.println("method 3");
		
	}

	@Override
	void method4() {
		System.out.println("method 4");
		
	}

}
