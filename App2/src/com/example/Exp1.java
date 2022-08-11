package com.example;

class Book
{
	
	//Book obj = new Book();
	public Book()
	{
		this("java");
		//Book obj = new Book("java");
		System.out.println("Default");
	
	}
	
	public Book(String str)
	{
		this(22);
		System.out.println("Single arg");
	}
	
	public Book(int x)
	{
		System.out.println("Hello");
	}
}

public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj = new Book();

	}

}
