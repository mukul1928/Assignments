package javaAssignments;

public class NestedIfElseDemo {
	
	public static void main(String[] args) {
		
		char gender='M';
		char gender2='F';
		int age=20;
		
		if(gender=='M')
		{
			if(age>18)
			{
				System.out.println("Male is eligible for vote");
			}
			else {
				System.out.println("Person male is minor");
			}
		}
		else
		{
			System.out.println("Not eligible");
		}
		
		if(gender2=='F')
		{
			if(age>18)
			{
				System.out.println("Female is Eligible for vote");
			}	
			else {
				System.out.println("Person female is minor");
			}
		}
		else
		{
			System.out.println("Not eligible for vote");
		}
	}

}
