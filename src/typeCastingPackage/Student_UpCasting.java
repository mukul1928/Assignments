package typeCastingPackage;

class Teacher
{
	void teach()
	{
		System.out.println("Teaching");
	}
}

class Mentor extends Teacher
{
	void mean()
	{
		System.out.println("Mentoring");
	}
	
}

public class Student_UpCasting extends Mentor
{
	void stud()
	{
		System.out.println("Studying");
	}

	public static void main(String[] args) {
		
		Mentor m1=new Student_UpCasting();
		m1.teach();
		m1.mean();
		
	}

}
