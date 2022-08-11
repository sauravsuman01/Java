package com.perfios;

public class Exp1 {
	
	private int x = 100;
			int y = 30;
	protected int z = 44;
	public int a = 22;
	
	public void disp()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
	
}

class Exp2 extends Exp1
{
	public void disp()
	{
		//System.out.println(x);//private
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
}
	

	