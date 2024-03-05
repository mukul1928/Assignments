package assertKeyword;

public class AssertDemoFalse {

	public static void main(String[] args) {
		
		String name="jayashree";
		
		assert name.length()>21; //assert is false here
		
		for(int i=0; i<name.length(); i++)
		{
			System.out.println(name.concat(" sureban"));
		}

	}

}
