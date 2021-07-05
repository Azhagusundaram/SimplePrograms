/*
 Word Reversal form the first occurrence of sub-string
Write a program to accept two strings S1 and S2 and reverse the words of S1,starting from the 
word where the first occurrence of S2 present in S1. Same empty spaces between the words 
must be maintained in the output. Write the program without splitting up the strings into array 
of words.
DON'T use any inbuilt functions 
Input: S1= This is a test input string S2=st
Output : This is a string input test
Sample Input 1
this is a test sentence
st
Sample Output 1
this is a sentence test
 */
package com.simplecodes;

import java.util.Scanner;

public class ReversalFormOfFirstOccuranceOfSubString {

	public static void main(String[] args) {
		int index=0,index2=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=scan.nextLine();
		System.out.println("Enter the SubString:");
		String s2=scan.nextLine();
		int l=s1.length();
		for(int i=0;i<s1.length()-s2.length();i++) {
			int k=i,count=0;
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(k)==s2.charAt(j)) {
					count++;
				}
				k++;
			}
			if(count==s2.length()) {
				index=i;
				break;
			}
		}
		for(int i=0;i<index;i++) {
			if(s1.charAt(i)==' ') {
				index2=i;
			}
		}
		for(int i=0;i<index2;i++) {
			System.out.print(s1.charAt(i));
			if(i==index2-1) {System.out.print(" ");}
		}
		for(int j=s1.length()-1;j>=index2;j--) {
			if(j==0||s1.charAt(j-1)==' ') {
				for(int i=j;i<l;i++) {
					System.out.print(s1.charAt(i));
				}
				System.out.print(" ");
				l=j-1;
			}
		}
		scan.close();
	}

}
