package inheritancePackage;

public class City_class extends State_class //child class inheriting parent class
{

	void multi() //child class non static method
	{
		System.out.println("multiplication of child class");
	}
	
	void div() //child class non static method
	{
		System.out.println("division of child class");
	}
	
	public static void main(String[] args) {
		
		add(); //invoking static method of parent
		
		City_class cs=new City_class(); //object of child class
		
		cs.sub(); //invoking non static method of parent
		
		cs.multi(); //invoking non static method of child
		cs.div();
		
	}

}
