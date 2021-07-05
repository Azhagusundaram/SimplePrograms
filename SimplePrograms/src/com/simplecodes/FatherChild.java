/*
. Given a two dimensional array of string like 
<”luke”, “shaw”>
<”wayne”, “rooney”>
<”rooney”, “ronaldo”>
<”shaw”, “rooney”> 
Where the first string is “child”, second string is “Father”. And given “ronaldo” we have to find his 
no of grandchildren Here “ronaldo” has 2 grandchildren. So our output should be 2.
*/
package com.simplecodes;

import java.util.Scanner;

public class FatherChild {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int count=0;
		String[][]arr=new String[num][2];
		scan.nextLine();
		for(int i=0;i<num;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=scan.nextLine();
			}
		}
		String str=scan.nextLine();
		scan.close();
		for(int i=0;i<num;i++) {
			if(arr[i][1].equals(str)) {
				str=arr[i][0];
				for(int j=0;j<num;j++) {
					if(arr[j][1].equals(str)) {
						count++;
					}
				}
			}
		
		System.out.println(count);
	}
	}
}
