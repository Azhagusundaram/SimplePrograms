/*
 To output the given string for the given input which is an integer.
Input: 1
Output: A
Input: 26
Output: Z
Input : 27
Output: AA
Input: 28:
Output: AB
Input: 1000
Output: ALL
 */
package com.simplecodes;

import java.util.Scanner;

public class IntegetToString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input integer:");
		int n=scan.nextInt();
		scan.close();
	    System.out.println(convert(n));
	}
	public static String convert(int n) {
		String str="";
		if(n<=26) {
			if(n==0) {
				str+=(char)(64+26);
			}
			else {
				str+=(char)(64+n);
			}
			
			System.out.println(str+n);
		}
		else {
			str+=convert(n/26)+convert(n%26);
		}
		return str;
	}

}
