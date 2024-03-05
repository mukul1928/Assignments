package arrayPrograms;

public class ArrayAverage {

	public static void main(String[] args) {
		
		int avg[]=new int[5];
		avg[0]=10;
		avg[1]=15;
		avg[2]=23;
		avg[3]=30;
		avg[4]=40;
		
		int sum=0;
		double average=0;
		
		//double average=(avg[0]+avg[1]+avg[2]+avg[3]+avg[4])/5;
		//System.out.println(average);
		
		for(int i=0;i<avg.length;i++)
		{
			sum=sum+avg[i];
		}
		System.out.println(sum);
		
		average=sum/avg.length;
		System.out.println("Average of array : "+average);

	}

}
