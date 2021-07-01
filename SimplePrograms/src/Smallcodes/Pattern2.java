/*
 Print the given pattern:
Input:
N= 3, M=3
Output:
X X X
X 0 X
X X X
Input:
N=4 M=5
Output:
X X X X
X 0 0 X
X 0 0 X
X 0 0 X
X X X X
Input:
N=6 M=7
X X X X X X
X 0 0 0 0 X
X 0 X X 0 X
X 0 X X 0 X
X 0 X X 0 X
X 0 0 0 0 X
X X X X X X
 */
package Smallcodes;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the row:");
		int row=scan.nextInt();
		System.out.println("Enter the column:");
		int col=scan.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if((i==1||j==1||i==row-2||j==col-2)&&(i!=0&&j!=0&&i!=row-1&&j!=col-1)) {
					System.out.print("O ");
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.print("\n");
		}
		scan.close();
	}

}
