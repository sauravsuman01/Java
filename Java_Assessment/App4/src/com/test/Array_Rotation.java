package com.test;
import java.util.Scanner;

public class Array_Rotation {
	
	public static void rotate(int[] arr, int n, int d) {
		int i = 1;
		while(i<=d) {
			int last = arr[0];
			for(int j=0; j<n-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[n-1] = last;
			i++;
		}
		for(int k=0; k<n; k++) {
			System.out.println(arr[k]);
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[10];
		int d,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		System.out.println("Enter the Array Elements:");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter number of elements to be rotated:");
		d = sc.nextInt();
		System.out.println("Rotated Array");
		rotate(arr,n,d);
	}

}
