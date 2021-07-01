/*
 Permutation of string
A permutation, also called an “arrangement number” or “order,” is a rearrangement of the 
elements of an ordered list S into a one-to-one correspondence with S itself. A string of length 
n has n! permutation.
Below are the permutations of string ABC.
ABC ACB BAC BCA CBA CAB
Sample Input 1
ABC
Sample Output 1
ABC ACB BAC BCA CBA CAB
Sample Input 2
1234
Sample Output 2
1234 1243 1324 1342 1432 1423 2134 2143 2314 2341
 */
package Smallcodes;

import java.util.Scanner;

public class PermutationOfString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		scan.close();
		PermutationOfString permutation=new PermutationOfString();
		permutation.permute(str,0,str.length()-1);
	}
	public void permute(String str,int l,int r) {
		if(l==r) {
			System.out.println(str);
		}
		else {
			for(int i=l;i<=r;i++) {
				str=swap(str,l,i);
				permute(str,l+1,r);
				str=swap(str,l,i);
			}
		}
	}
	public String swap(String str,int l,int r) {
		char temp;
		char[]str1=str.toCharArray();
		temp=str1[l];
		str1[l]=str1[r];
		str1[r]=temp;
		return String.valueOf(str1);
	}

}
