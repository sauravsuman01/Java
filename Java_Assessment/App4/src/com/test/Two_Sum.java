package com.test;
import java.util.Scanner;

public class Two_Sum {
	public static void sum(int[] arr, int n, int tar) {
		//int[] res = new int[2];
		int flag = 1;
		int a=0,b = 0;
		for(int i=0; i<n;i++)
			for(int j=i+1;j<n;j++)
				if(arr[i]+arr[j]==tar) {
					a = i;
					b = j;
					flag = 1;
					break;
				}
		if(flag==1)
			System.out.printf("Target Sum found at indices %d and %d", a, b);
		else
			System.out.println("No indices found");
		//return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		System.out.println("Enter the array elements:");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter the target value:");
		int tar = sc.nextInt();
		sum(arr,n,tar);
		}
	

}
