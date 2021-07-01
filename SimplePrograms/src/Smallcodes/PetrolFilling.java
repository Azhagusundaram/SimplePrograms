/*
  A man his driving car from home to office with X petrol. There are N number of petrol bunks in 
the city with only few capacities and each petrol is located in different places For one km one liter 
will consume. So he fill up petrol in his petrol tank in each petrol bunks. Output the remaining 
petrol if he has or tell him that he cannot travel if he is out of petrol.
Input:
Petrol in car: 2 Liters
Petrol bunks: A B C
Distance from petrol each petrol bunks: 1, 5, 3
Capacities of each petrol bunk: 6, 4, 2
Output:
Remaining petrol in car is 5 liters

 */
package Smallcodes;

import java.util.Scanner;

public class PetrolFilling {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Petrol in Car:");
		int pet=scan.nextInt();
		System.out.println("Number of petrol bunks");
		int num=scan.nextInt();
		System.out.println("Distance from petrol each petrol bunks:");
		int[]dist=new int[num];
		int[]cap=new int[num];
		for(int i=0;i<num;i++) {
			dist[i]=scan.nextInt();
		}
		System.out.println("Capicities of each petrol bunk:");
		for(int i=0;i<num;i++) {
			cap[i]=scan.nextInt();
		}
		for(int i=0;i<num;i++) {
			pet=pet+cap[i]-dist[i];
		}
		System.out.println("Remaining Petrol in car is:"+pet);
		scan.close();
	}

}
