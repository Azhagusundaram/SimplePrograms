/*
 To find the factors of the numbers given in an array and to sort the numbers in descending order 
according to the factors present in it.
Input:
Given array : 8, 2, 3, 12, 16
Output:
12, 16, 8, 2, 3
 */
package Smallcodes;

import java.util.Scanner;

public class ElementsinDescendingOrder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int num=scan.nextInt();
		int[] arr=new int[num];
		int[]factors=new int[num];
		System.out.println("Enter the elements in array:");
		for(int i=0;i<num;i++) {
			arr[i]=scan.nextInt();
			factors[i]=1;
			for(int j=1;j<=arr[i]/2;j++) {
				if(arr[i]%j==0) {
					factors[i]=factors[i]+1;
				}
			}
		}
		for(int i=0;i<num-1;i++) {
			for(int j=i+1;j<num;j++) {
				if(factors[i]<factors[j]) {
					int temp1=factors[i];
					factors[i]=factors[j];
					factors[j]=temp1;
					int temp2=arr[i];
					arr[i]=arr[j];
					arr[j]=temp2;
				}
			}
		}
		for(int i=0;i<num;i++) {
			System.out.print(+arr[i]+" ");
		}
	}

}
