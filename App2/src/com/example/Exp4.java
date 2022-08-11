package com.example;

class SingleTn
{
	static SingleTn obj = null;
	
	private SingleTn()
	{
		
	}
	
	public static SingleTn getObj()
	{
		if(obj==null)
		{
			obj = new SingleTn();
		}
		return obj;
	}
}

public class Exp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTn obj1 = SingleTn.getObj();
		SingleTn obj2 = SingleTn.getObj();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
