package encapsulationPackage;

class Sensitive {
	private String username = "mukulpandey95";
	private String password = "As@3*00";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

public class Encap_Practice {

	public static void main(String[] args) {

		Sensitive s1 = new Sensitive();
		s1.setUsername("MukulPandey1928@");
		System.out.println(s1.getUsername());

		s1.setPassword("As%%%000");
		System.out.println(s1.getPassword());

	}

}
