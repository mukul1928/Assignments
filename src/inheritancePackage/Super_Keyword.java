package inheritancePackage;

class Super_Keyword_parent{
	
	void superMethod() //parent class method
	{
		System.out.println("parent class implementation");
	}
}

public class Super_Keyword extends Super_Keyword_parent { //Inheritance
	
	void superMethod() //child class method with same name and signature
	{
		super.superMethod(); //super keyword invoking parent class method
		System.out.println("child class implementation");
		//super.superMethod();
	}

	public static void main(String[] args) {
		
		Super_Keyword sk=new Super_Keyword(); //child class object
		sk.superMethod();
		
	}

}
