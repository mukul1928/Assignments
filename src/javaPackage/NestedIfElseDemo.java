package javaPackage;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		
		int a=100, b=200, c=300;
		
		if(a==b)
		{
			if(b==c)
			{
				System.out.println(1);
			}
			else {
				System.out.println(2);
			}
		}
		else
		{
			System.out.println(3);
		}
		

	}

}
