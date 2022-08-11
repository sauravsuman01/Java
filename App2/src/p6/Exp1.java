package p6;

//Clone
public class Exp1 implements Cloneable {
	int id = 101;
	static int pin = 1919191;
	
	public void disp()
	{
		System.out.println(id+" "+Exp1.pin);
	}
	
	public static void main(String[] args) throws Exception
	{
		Exp1 obj = new Exp1();
		obj.disp();
		
		Exp1 obj1 = (Exp1) obj.clone();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());

	}

}
