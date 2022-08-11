package com.perfios1;
import com.perfios.*;

public class Exp2 {
	
	Exp1 obj = new Exp1();
	
	public void disp()
	{
		//System.out.println(obj.x);//private
		//System.out.println(obj.y);//default
		//System.out.println(obj.z);//protected
		System.out.println(obj.a);
	}
}

class Exp3 extends Exp1
{
	public void disp()
	{
		//System.out.println(x);//private
		//System.out.println(y);//default
		System.out.println(z);
		System.out.println(a);
	}
}
	
	