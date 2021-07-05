package com.simplecodes;

import java.util.Scanner;

public class SumOfElementsDivisibleByNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements is Array:");
		int num=scan.nextInt();
		int [] arr=new int[num];
		System.out.println("Enter the array:");
		for(int i=0;i<num;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		System.out.println("Enter X:");
		int x=scan.nextInt();
		for(int i=0;i<num-1;i++) {
			for(int j=i+1;j<num;j++) {
				if((arr[i]+arr[j])%x==0&&arr[i]%x==0&&arr[j]%x==0) {
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}
}
