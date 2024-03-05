package exceptionalHandling;

public class ArrayException {

	public static void main(String[] args) {
		
		int age[]=new int[3];
		age[0]=13;
		age[1]=23;
		age[2]=30;
		try {
			age[3]=34;
		}
		
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
	}

}
