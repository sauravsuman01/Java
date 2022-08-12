package com.test;
import java.util.Scanner;

public class Exp2 {
	public static void check(int age) {
		if(age<18){
			System.out.println("Cannot vote: Minor");
		}
		else if(age>75) {
			System.out.println("Voter id cannot be created");
		}
		else
			System.out.println("Can vote");
	}
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age to check validity");
		age = sc.nextInt();
		check(age);
	}

}
