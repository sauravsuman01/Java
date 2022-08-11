package p7;

class MethodChn {
	
	public void m1()
	{
		System.out.println("method 1");
		m2();
	}
	
	public void m2()
	{
		System.out.println("method 2");
		m3();
	}
	
	public void m3()
	{
		System.out.println("method 3");
		methodn();
	}
	
	public void methodn()
	{
		System.out.println("method n");
	}

}

public class Exp2
{
	public static void main(String[] args)
	{
		MethodChn obj = new MethodChn();
		obj.m1();
	}
}
