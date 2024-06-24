package exceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
				int number=scan.nextInt();
				int c=1/number;
				System.out.println(c);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("Arithmetic exception handled");	
			}
			catch(InputMismatchException a1)
			{
				System.out.println("Input mis match exception handled");
			}
			finally
			{
				System.out.println("finally block - I am always there");
			}
	}

}
