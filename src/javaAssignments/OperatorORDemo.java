package javaAssignments;

public class OperatorORDemo {

	public static void main(String[] args) {
		
		int age=19;
		char gender='M';
		
		if(age>18 || gender=='M')
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not eligible for vote");
		}
	}

}
