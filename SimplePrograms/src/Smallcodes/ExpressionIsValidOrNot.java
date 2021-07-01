/*
 Check whether a given mathematical expression is valid. 
 Eg.) Input : (a+b)(a*b)
 Output : Valid
 Input : (ab)(ab+)
 Output : Invalid
 Input : ((a+b)
 Output : Invalid
 */
package Smallcodes;

import java.util.Scanner;

public class ExpressionIsValidOrNot {
	public static void main(String[] args) {
		int i,b=0;
		System.out.println("Enter the Expression:");
		Scanner scanner = new Scanner(System.in);
		String str=scanner.nextLine();
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				b++;
			}
			else if(str.charAt(i)==')'){
				b--;
			}
			else if(str.charAt(i)=='-'||str.charAt(i)=='/'||str.charAt(i)=='*'||str.charAt(i)=='+'){
				if((str.charAt(i-1)>96&&str.charAt(i-1)<123)||(str.charAt(i+1)>96&&str.charAt(i+1)<123)) {
					
				}
				else {
					break;
				}
			}
		}
		if(i==str.length()&&b==0) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		scanner.close();
	}

}
