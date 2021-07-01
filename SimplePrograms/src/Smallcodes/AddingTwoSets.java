/*
  Input:
Number of elements in set1: 4
Elements are: 9, 9, 9, 9
Number of elements in set 2: 3
Elements are: 1,1,1
Output:
1, 0, 1, 1, 0
Input:
Number of elements in set1: 11
Elements are: 7,2,3,4,5,3,1,2,7,2,8
Number of elements in set 2: 3
Elements are: 1,2,3
Output: 7,2,3,4,5,3,1,2,8,5,1
 */
package Smallcodes;

import java.util.Scanner;

public class AddingTwoSets {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Number of Elements in set1:");
		int n1=scan.nextInt();
		System.out.println("Number of Elements in set2:");
		int n2=scan.nextInt();
		System.out.println("Enter the Elements in set1:");
		int[]set1=new int[n1];
		String str1="";
		for(int i=0;i<n1;i++) {
			set1[i]=scan.nextInt();
			str1+=set1[i];
		}
		System.out.println("Enter the Elements in set2:");
		int[]set2=new int[n2];
		String str2="";
		for(int i=0;i<n2;i++) {
			set2[i]=scan.nextInt();
			str2+=set2[i];
		}
		String output=Long.toString(Add(str1,str2));
		for(int i=0;i<output.length();i++) {
			System.out.print(output.charAt(i)+",");
		}
		scan.close();
	}
	public static long Add(String str1,String str2) {
		return(Long.parseLong(str1)+Long.parseLong(str2));
		
	}

}
