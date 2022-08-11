package com.test;
import java.util.Scanner;

public class Exp6 {
	
	public static int add(int x, int y)
	{
		return x+y;
	}
	
	public static int sub(int x, int y)
	{
		return x-y;
	}
	
	public static int mul(int x, int y)
	{
		return x*y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers a and b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(;;) {
		
		System.out.println("1 for addition, 2 for subtraction, 3 for multiplication, 4 Exit");
		int x = sc.nextInt();
		
		
		switch(x)
		{
		case 1: int r1 = add(a,b);
		System.out.println(r1);
		break;
		
		case 2: int r2 = sub(a,b);
		System.out.println(r2);
		break;
		
		case 3: int r3 = mul(a,b);
		System.out.println(r3);
		break;
		
		default: System.exit(0);
			
		}
		}
	}

}
