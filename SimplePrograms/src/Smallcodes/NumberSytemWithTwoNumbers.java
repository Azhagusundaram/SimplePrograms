
/*
 *  Form a number system with only 3 and 4. Find the nth number of the number system.
Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 
3343, 3344, 3433, 3434, 3443, 3444 ….
 */
package Smallcodes;
import java.util.Scanner;

public class NumberSytemWithTwoNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n:");
		int n=scan.nextInt();
		System.out.println(nthNumber.find(n));
		scan.close();
	}
}
class nthNumber{
	public static String find(int n) {
		String arr[]=new String[n+1];
		arr[0]="";
		int size=1,p=1;
		while(size<=n) {
			for(int i=0;i<p&&size+i<=n;i++) {
				arr[size+i]="3"+arr[size-p+i];
			}
			for(int i=0;i<p&&size+p+i<=n;i++) {
				arr[size+p+i]="4"+arr[size-p+i];
			}
			p=p*2;
			size=size+p;
		}
		return arr[n];
	}
}
