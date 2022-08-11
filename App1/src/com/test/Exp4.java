package com.test;
import java.util.Scanner;

public class Exp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter company");
		String company = sc.nextLine();
		
		System.out.printf("%s\t%s",name,company);
	}

}
