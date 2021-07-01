/*
 Write a program to sort the elements in odd positions in descending order and elements in 
ascending order 
Eg 1: Input: 13,2 4,15,12,10,5
 Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
 Output: 9,2,7,4,5,6,3,8,1
 */
package Smallcodes;

import java.util.ArrayList;
import java.util.Scanner;

public class AlternateSorting2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num=scan.nextInt();
		System.out.println("Enter the numbers");
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		for(int i=0;i<num;i++) {
			numbers.add(scan.nextInt());
		}
		for(int i=0;i<num;i++) {
			for(int j=i;j<num;j=j+2) {
				if(i%2==0) {
					if(numbers.get(i)<numbers.get(j)) {
						int temp1=numbers.get(i);
						numbers.set(i,numbers.get(j));
						numbers.set(j, temp1);
					}	
				}
				else {
					if(numbers.get(i)>numbers.get(j)) {
						int temp1=numbers.get(i);
						numbers.set(i,numbers.get(j));
						numbers.set(j, temp1);
					}	
				}
			}
		}
		System.out.println(numbers);
		scan.close();
	}
}
