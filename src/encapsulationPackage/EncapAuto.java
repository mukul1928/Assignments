package encapsulationPackage;

class Login {
	private int age = 18;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String userName = "customer@gmail.com";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String pwd = "Cust123@#$%";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	private int otp = 1234;

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}
}

public class EncapAuto {

	public static void main(String[] args) {

		Login log = new Login();

		log.setAge(21);
		System.out.println("Updated age : " + log.getAge());

		log.setUserName("mukul@gamil.com");
		System.out.println("Updated email : " + log.getUserName());

		log.setPwd("Mukul@12345");
		System.out.println("Updated password : " + log.getPwd());

		log.setOtp(5932);
		System.out.println("OTP : " + log.getOtp());
	}

}
