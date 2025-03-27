
package encapsulationPackage;

class Sensitive_Info
{
	private String userName = "customer@info.com"; //global variable
	
	public void setUserName(String userName) //non static method
	{
		this.userName=userName; //assigning local variable value to global variable
	} 
	
	public String getUserName()
	{
		return userName; //return cannot have void type
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		
		Sensitive_Info s1=new Sensitive_Info();
		s1.setUserName("mukul@gmail.com");
		
		System.out.println(s1.getUserName());
	}

}
