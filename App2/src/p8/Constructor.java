package p8;

class Employee{
	//default constructor
	public Employee()
	{
		System.out.println("default");
	}
	
	//parameterized constructor
	public Employee(int x, String y)
	{
		System.out.println("parameterized");
	}
	
	//overloaded constructor
	public Employee(double x, char y)
	{
		System.out.println("overloaded");
	}
	
	//object parameterized constructor
	public Employee(Employee obj)
	{
		System.out.println("Object Parameterized");
	}
	
	public void disp()
	{
		System.out.println("None");
	}
}
public class Constructor {
	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(1,"l");
		Employee emp3 = new Employee(1.0,'x');
		Employee emp4 = new Employee(emp2);
		emp2.disp();
	}

}
