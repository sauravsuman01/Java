package p4;
import java.util.Scanner;

import p3.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Exp1 e1 = new Exp1();
		System.out.println("Enter id");
		e1.id = sc.nextInt();
		
		System.out.println("Enter name");
		e1.name = sc.next();
		
		e1.show();
		
		Exp2 e2 = new Exp2();
		e2.disp(e1.id, e1.name);
		
		sc.close();
		
	}
}
