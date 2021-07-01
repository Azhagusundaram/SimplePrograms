/*
 Group anagram words 
Given array of words, group the anagrams and print. Any word or phrase that exactly 
reproduces the letters in another order is an anagram. Arrive most efficient algorithm.
Examples :
Input: {tar,rat,banana,atr,nanaba}
Output: Anagrams:
rat atr tar
nanaba banana
Input: {abc, cde, xyz, dec}
Output: Anagrams:
cde dec
Others:
Abc
xyz
Input Format
N - no of words
get input words into array
Sample Input 1
5
tar rat banana atr nanaba
Sample Output 1rat atr tar
nanaba banana
 */
package Smallcodes;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<String>words=new ArrayList<String>();
		
		System.out.println("Enter the number of words:");
		int n=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++) {
			words.add(scan.nextLine());
		}
		while(words.size()>0) {
		LinkedHashSet<String>anagramword=new LinkedHashSet<String>();
		anagramword.add(words.get(0));
		
			for(int j=1;j<words.size();j++) {
				String str1=words.get(0);
				String str2=words.get(j);
				String str3=str2;
				for(int k=0;k<str2.length();k++) {
					if(str1.length()==str2.length()){
						if(str1.contains(""+(str2.charAt(k)))) {
							int l=str3.indexOf(str2.charAt(k));
							str3=str3.substring(0,l)+str3.substring(l+1);
						}
					}
				}
				if(str3.length()==0) {
					anagramword.add(str2);
				}
			}
		System.out.println(anagramword);
		words.removeAll(anagramword);
		}
		scan.close();
	}
}
