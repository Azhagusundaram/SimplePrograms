/*
 Write a program to give the following output for the given input 
Eg 1: Input: a1b10
 Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
 Output: bbbccccccddddddddddddddd
 */
package Smallcodes;

import java.util.Scanner;

public class AlphaNumeric {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String num="",alp="";
		System.out.println("Enter the input");
		String input=scan.nextLine();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)>=48&&input.charAt(i)<=57) {
				num=num+""+input.charAt(i);
			}
			else {
				alp=alp+""+input.charAt(i);
			}
			if(alp.length()==2||i==input.length()-1) {
				int number=Integer.parseInt(num);
				for(int j=0;j<number;j++) {
					System.out.print(alp.charAt(0));
				}
				num="";
				alp=alp.replaceAll(""+alp.charAt(0),"");
			}
		}
		scan.close();
	}

}
