package assertKeyword;

public class AssertWithMessage {

	public static void main(String[] args) {
		
		String name="I am student";
		
		assert name.length()>21 : "The given string is less than 21"; //assert is false here
		
		for(int i=0; i<name.length(); i++)
		{
			System.out.println(name.concat("of batch AB 39"));
		}


	}

}
