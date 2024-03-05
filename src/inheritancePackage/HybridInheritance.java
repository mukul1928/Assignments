package inheritancePackage;

class One1
{
	void one()
	{
		System.out.println("Parent class method");
	}
}

class Two2 extends One1 //single level inheritance
{
	void two()
	{
		System.out.println("single level inheritance");
	}
}

class Three3 extends Two2 //multi level inheritance
{
	void three()
	{
		System.out.println("multi level inheritance");
	}
}

class Four4 extends One1 //hierarchical inheritance
{
	void four()
	{
		System.out.println("hierarchical inheritance");
	}
}

class Five5 extends One1 //hierarchical inheritance
{
	void five()
	{
		System.out.println("hierarchical inheritance");
	}
}

public class HybridInheritance {
	
	void child()
	{
		System.out.println("hybrid inheritance example");
	}

	public static void main(String[] args) {
		
		HybridInheritance h1=new HybridInheritance();
		h1.child();
		
		Three3 t1=new Three3();
		t1.one();
		t1.two();
		t1.three();
		
		Four4 f1=new Four4();
		f1.one();
		f1.four();
		
		Five5 f2=new Five5();
		f2.one();
		f2.five();		

	}

}
