package com.test;
import java.util.Scanner;

public class Balance_Parantheses {
	public static void check(String exp) {
		int x=0; 
		int flag = 0;
		for(int i=0; i<exp.length();i++) {
			char ch = exp.charAt(i);
			if(ch=='(')
				x++;
			else if(ch==')')
				x--;
			
			if(x<0) {
				flag=1;
				break;
			}
			}
		if(flag==0 &&x==0)
			System.out.println("Matching");
		else
			System.out.println("Not Matching");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String exp;
		System.out.println("Enter the expression");
		exp = sc.next();
		check(exp);
		}

}
