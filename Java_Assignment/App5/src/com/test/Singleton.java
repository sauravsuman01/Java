package com.test;
import java.util.Scanner;

class SingleTn
{
	public int roll;
	public String name; 
	
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
	
	public void display() {
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
	}
}


public class Singleton {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTn obj1 = SingleTn.getObj();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Roll and Name");
		obj1.roll = sc.nextInt();
		obj1.name = sc.next();
		
		System.out.println("======================Details======================");
		obj1.display();
		
	
	}

}
