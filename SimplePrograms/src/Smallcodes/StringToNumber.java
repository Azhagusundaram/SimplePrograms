/*
 convert to number from string
*/
package Smallcodes;
import java.util.Scanner;

public class StringToNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		int num=0,sign=1;
		String error="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>47&&str.charAt(i)<58) {
				num=num*10+sign*(str.charAt(i)-48);
			}
			if(str.charAt(i)=='-') {
				sign=-1;
				if(str.charAt(0)=='-') {
				}
				else {
					error="(error)";
				}
				
			}
			if(str.charAt(i)=='.') {
				break;
			}
		}
		System.out.println(num+error);
	}

}
