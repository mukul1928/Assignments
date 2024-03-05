package typeCastingPackage;

class Teacher2
{
	void teach()
	{
		System.out.println("Teaching");
	}
}

class Mentor2 extends Teacher2
{
	void mean()
	{
		System.out.println("Mentoring");
	}
}

class Student_Exp extends Mentor2
{
	void exp()
	{
		System.out.println("Exp student");
	}
}

public class Student_upcasting4 extends Mentor2
{

	public static void main(String[] args) {
		
		Mentor2 t2=new Student_Exp();//up casting
		t2.teach();
		t2.mean();
		
		Student_upcasting4 s1= (Student_upcasting4)t2;//down casting
		s1.teach();
		s1.mean();
		
	}

}
