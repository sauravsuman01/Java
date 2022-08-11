package p9;

class Student
{
	public Student()
	{
		this(30);
		System.out.println("constructor");
	}
	
	public Student(int x)
	{
		System.out.println("Single args");
	}
	
	static
	{
		System.out.println("Static Block");
	}
	{
		System.out.println("instance block");
	}
	
	public Student getObj()
	{
		return new Student();
	}
}
public class Exp1 {
	static {
		System.out.println("static block main");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		Student s = new Student();
		Student s1 = new Student();
		
		s1.getObj();
	}

}
//only one time execution for static block