package com.test;
import java.util.Scanner;

public class Exp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 for Hindi, 2 for English, 3 for Kannada");
		int x = sc.nextInt();
		
		switch(x) {
		case 1: System.out.println("Hindi");
		break;
		case 2: System.out.println("English");
		break;
		case 3: System.out.println("Kannada");
		break;
		default: System.out.println("None");
		}

	}

}
