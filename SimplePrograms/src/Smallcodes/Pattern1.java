/*
Print the word with odd letters as 
P     M
 R   A
  O R
   G
  O R
 R   A
P     M
*/
package Smallcodes;

public class Pattern1 {

	public static void main(String[] args) {
		String str="PROGRAM";
		int len=str.length();
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(i==j) {
					System.out.print(str.charAt(i));
				}
				else if(j==len-i-1) {
					System.out.print(str.charAt(len-i-1));
				}
				else {
					System.out.print(" ");
				}
					
			}
			System.out.println("");
		}
	}
}
