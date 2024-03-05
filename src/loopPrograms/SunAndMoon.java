package loopPrograms;

public class SunAndMoon {

	public static void main(String[] args) {

		for(int i=1; i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.println(i+" sun");
			}
			
			if(i%5==0)
			{
				System.out.println(i+" moon");
			}
			
			if(i%3==0 && i%5==0)
			{
				System.out.println(i+" sun and moon");
			}
		}

	}

}
