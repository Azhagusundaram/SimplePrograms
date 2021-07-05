package com.simplecodes;

import java.util.Scanner;

public class NumberOfGrandChildren {

	public static void main(String[] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of parent with child:");
		int num=scan.nextInt();
		String[] child=new String[num];
		String[] parent=new String[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter the child name:");
			child[i]=scan.next();
			System.out.println("Enter the parent name:");
			parent[i]=scan.next();
		}
		System.out.println("Enter the grandfather name:");
		String grand=scan.next();
		scan.close();
		for(int i=0;i<num;i++) {
			if(parent[i].equals(grand)) {
				for(int j=0;j<num;j++) {
					if(child[i].equals(parent[j])) {
						count++;
					}
				}
			}
		}
		System.out.println("Num of grand children is "+count);
	}
}
/*Enter the number of parent with child:
8
lava
rama
kusha
rama
rama
dasarathan
laxmanan
dasarathan
angad
laxmanan
dharamketu
laxmanan
abhisek
amithab
aaradhaya
abhisek
Enter the grandfather name:
dasarathan
Num of grand children is 4
*/
