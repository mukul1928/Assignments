package assertKeyword;

public class AssertDemo {

	public static void main(String[] args) {
		
		String name="I am student";
		
		assert name.length()>2; //assert is true here
		
		for(int i=0; i<name.length(); i++)
		{
			System.out.println(name.concat("of batch AB 39"));
		}

	}

}
