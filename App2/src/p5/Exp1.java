package p5;

public class Exp1 {
	int id = 101;
	static int pin = 1919191;
	
	public void disp()
	{
		System.out.println(id+" "+Exp1.pin);
	}
	//factory method
	
	public Exp1 getObj()
	{
		return new Exp1();
	}
	
	/*public Exp1 getObj(Exp1 obj)
	 * {
	 * 	return obj;
	 * }
	 */
	
	public static void main(String[] args)
	{
		Exp1 obj = new Exp1();
		obj.disp();
		
		Exp1 obj1 = obj.getObj();//new keyword is not required
		System.out.println(obj.hashCode());
	}

}
