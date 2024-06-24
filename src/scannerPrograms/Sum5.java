package scannerPrograms;

import java.util.Scanner;

public class Sum5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++)
		{
			int num=scan.nextInt();
			sum=sum+num;
		}
		System.out.println(sum);
		scan.close();
	}

}
