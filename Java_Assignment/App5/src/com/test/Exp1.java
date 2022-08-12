package com.test;


class Student
{
	private int id;
	private String name;
	private String city;
	private double score;
		
	public Student(int id, String name, String city, double score)
	{
		this.id = id;
		this.name = name;
		this.city = city;
		this.score = score;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String setCity){
		this.city = city;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
}
public class Exp1 {
	public static void main(String[] args)
	{
		Student[] data = new Student[5];
		
		Student s1 = new Student(101, "Saurav", "Blr", 80.00);
		Student s2 = new Student(102, "Suman", "Pune", 98.32);
		Student s3 = new Student(103, "Satya", "Hyd",91.03);
		Student s4 = new Student(104, "Tim", "Goa",65.05);
		Student s5 = new Student(105, "John", "Delhi", 93.02);
		
		data[0] = s1;
		data[1] = s2;
		data[2] = s3;
		data[3] = s4;
		data[4] = s5;
		
		for(Student obj: data)
			System.out.println("ID: "+obj.getId()+", Name: "+obj.getName()+", City: "+obj.getCity()+", Score: "+obj.getScore());
	}

}
