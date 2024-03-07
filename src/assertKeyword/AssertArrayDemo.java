package assertKeyword;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AssertArrayDemo {

	public static void main(String[] args) {
		
		int age[]=new int[3];
		age[0]=12;
		age[1]=10;
		age[2]=15;
		
		int ageNew[]=new int[3];
		ageNew[0]=12;
		ageNew[1]=10;
		ageNew[2]=15;
		
		assert Array.getLength(age)>1; //true
		//assert Array.getLength(age)>10; //false
		
		boolean answer=Arrays.equals(age, ageNew); //when both arrays have same length and same values then they are equal
		System.out.println(answer);

	}

}
