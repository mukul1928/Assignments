package exam7;

public class AverageOfArrays {

	public static void main(String[] args) {
		
		int num[]=new int[4];
		num[0]=4;
		num[1]=7;
		num[2]=3;
		num[3]=6;
		
		double d1[]=new double[4];
		d1[0]=2.5;
		d1[1]=5.5;
		d1[2]=3.5;
		d1[3]=1.5;
		
		int sum=0;
		double sum1=0;
		double average=0;
		
		for(int i=0; i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println("sum of integer array values : "+sum);
		
	
		for(int j=0; j<d1.length; j++)
		{
			sum1=sum1+d1[j];
		}
		System.out.println("sum of double array values : "+sum1);
		
		average=(sum+sum1)/(num.length+d1.length);
		
		System.out.println("Average of both arrays : "+average);	

	}

}
