package encapsulationPackage;

class login1
{
	private int mobile=54321;
	private String email="amazon@gmail.com";
	private String pwd="Amaz@#12";
	
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}

public class Encapsulation_Practice {

	public static void main(String[] args) {
		
		login1 lg=new login1();
		lg.setMobile(12345);
		System.out.println("updated mobile: "+lg.getMobile());
		
		lg.setEmail("jaya@gmail.com");
		System.out.println("updated email: "+lg.getEmail());
		
		lg.setPwd("Jay@123");
		System.out.println("updated pwd: "+lg.getPwd());
	}

}
