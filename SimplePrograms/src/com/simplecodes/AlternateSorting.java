/*
Alternate sorting: Given an array of integers, rearrange the array in such a way that the first 
element is first maximum and second element is first minimum. 
 Eg.) Input : {1, 2, 3, 4, 5, 6, 7}
 Output : {7, 1, 6, 2, 5, 3, 4}
*/
package com.simplecodes;
import java.util.Arrays;
import java.util.Scanner;
public class AlternateSorting {
	public static void main(String[] args) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		num=scan.nextInt();
		int[]numbers=new int[num];
		for(int i=0;i<num;i++) {
			System.out.println("number "+(i+1));
			numbers[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		for(int i=0;i<num-1;i++) {
			for(int j=i+1;j<num;j++) {
				if(i%2==1) {
					if(numbers[i]>numbers[j]) {
						int temp=numbers[j];
						numbers[j]=numbers[i];
						numbers[i]=temp;
					}
				}
				else
				if(numbers[i]<numbers[j]) {
					int temp=numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		scan.close();
	}
}
