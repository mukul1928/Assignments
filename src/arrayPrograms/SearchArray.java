package arrayPrograms;

public class SearchArray {

	public static void main(String[] args) {
		
		int num[]=new int[4];
		num[0]=10;
		num[1]=20;
		num[2]=60;
		num[3]=34;
		
		int number_to_search=34;
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i]==number_to_search)
			{
				System.out.println("34 is present in array");
			}
			
		}	
		

	}

}
