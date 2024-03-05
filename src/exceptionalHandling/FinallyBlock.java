package exceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
		int number=scan.nextInt();
		
		}
		catch(InputMismatchException a1)
		{
			System.out.println("exception handled");
		}
		finally
		{
			System.out.println("I am always there");
		}
	}

}
