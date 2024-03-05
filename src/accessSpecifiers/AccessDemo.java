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
		
		add();
		div();
		
		AccessDemo a1=new AccessDemo();
		a1.subtract();
		a1.multi();
		
		AccessDemo1 a2=new AccessDemo1();
		a2.add();
		a2.subtract();
		a2.div();
			
	}

}
