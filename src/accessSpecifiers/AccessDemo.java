package accessSpecifiers;

public class AccessDemo {
	
	public static void add()
	{
		
	}

	protected void subtract() 
	{
		
	}
	
	private void multi()
	{
		
	}
	
	static void div()
	{
		
	}
	
	public static void main(String[] args) {
		
		//Within the class, we can access all type of methods (public, private, protected, default)
		 
		add();
		div();
		
		AccessDemo a1=new AccessDemo();
		a1.subtract();
		a1.multi();
		
		//not possible to access private methods of class within package
		
		AccessDemo1 a2=new AccessDemo1();
		a2.add(); //public
		a2.subtract(); //protected
		a2.div(); // default
			
	}

}
