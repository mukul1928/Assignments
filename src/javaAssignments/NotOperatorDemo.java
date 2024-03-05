package javaAssignments;

public class NotOperatorDemo {

	public static void main(String[] args) {
		
		int a=10, b=20;
		int sum=a+b;
		
		if(!(a<b || sum==40))
		{
			System.out.println("NOT with OR operator executed");
		}
		else
		{
			System.out.println("OR Not executed");
		}
		if(!(a>b && sum==a))
		{
			System.out.println("NOT with AND operator executed");
		}
		else
		{
			System.out.println("AND Not executed");
		}

	}

}
