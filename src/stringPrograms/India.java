package stringPrograms;

public class India {

	public static void main(String[] args) {
		{
			String name="India";
			String reverse=" ";
			for(int i=name.length()-1; i>=0; i--)
			{
				char ans=name.charAt(i);
				reverse=reverse+ans;
			}
			System.out.println("Reversed string : " +reverse);
			
			boolean b=name.equals(reverse);
			if(b==true)
			{
				System.out.println("India is palindrome");
			}
			else
			{
				System.out.println("India is not palindrome");
			}
		}

	}
}
