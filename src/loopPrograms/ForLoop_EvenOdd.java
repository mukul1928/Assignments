package loopPrograms;

public class ForLoop_EvenOdd {

	public static void main(String[] args) {
		
		for(int i=0; i<=100; i++) //Even and odd numbers from 0-100
		{
			if(i%2==0)
			{
				System.out.println(i +" Even number");
			}
			else
			{
				System.out.println(i +" Odd number");
			}
			
		}
	}

}
