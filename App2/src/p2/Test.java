package p2;
import p1.*;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args)
	{
		DataStd std = new DataStd();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter ID: ");
		std.id = sc.nextInt();
		
		System.out.print("Roll: ");
		std.rol = sc.nextInt();
		
		System.out.print("Name: ");
		std.name = sc.next();
		
		System.out.print("College: ");
		std.college = sc.next();
		
		System.out.print("Score: ");
		std.score = sc.nextInt();
		
		System.out.print("City: ");
		std.city = sc.next();
		
		ValidateData obj = new ValidateData();
		obj.stdDetails(std.id,std.rol,std.name,std.score,std.college,std.city);
	}

}
