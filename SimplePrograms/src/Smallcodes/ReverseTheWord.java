package Smallcodes;
public class ReverseTheWord {
		public static void reversing(String str)
		{
			String words[]=str.split(" ");
			String RevString="";
			for( String i:words){
				String word=i;
				String RevWord="";
				for(int j=word.length()-1;j>=0;j--){
					RevWord=RevWord+word.charAt(j);
				}
				RevString=RevString+RevWord+" ";
			}
			System.out.println(RevString);
		}
}
/*
Reverse words in a sentence without reversing the
whole sentence.
Input:
Input consist of one string.
Output:
Refer to the sample input and output for formatting specifications.
Sample Input 1:
Rotate the wheel through 180 degrees
Sample Output 1:
etatoR eht leehw hguorht 081 seerged
Sample Input 2:
ABCD FEGHI
Sample Output 2: 
DCBA IHGEF
*/