package exam7;

public class searchNumber {

	public static void main(String[] args) {
		
		int num[]=new int[5];
		num[0]=98;
		num[1]=76;
		num[2]=89;
		num[3]=65;
		num[4]=76;
		
		int num_to_check=65;
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i]==num_to_check)
			{
				System.out.println("65 is present at index " +i);
			}
		}
			
				
	}

}
