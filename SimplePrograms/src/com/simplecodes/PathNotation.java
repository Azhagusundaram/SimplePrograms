package com.simplecodes;

import java.util.Scanner;

public class PathNotation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Row and Column size:");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int mat[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter the Element in"+(i+1)+","+(j+1));
				mat[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter the StartRow and StartColumn:");
		int startrow=scan.nextInt();
		int startcol=scan.nextInt();
		System.out.println("Enter the path String '>'-going right\t'<'-going left\t'v'-going down\t'^'-going up");
		scan.nextLine();
		String path=scan.nextLine();
		System.out.println();
		String output=""+mat[startrow-1][startcol-1];
		for(int i=0;i<path.length();i++) {
			if(path.charAt(i)=='>') {
				startcol++;
			}
			if(path.charAt(i)=='<') {
				startcol--;
			}
			if(path.charAt(i)=='v') {
				startrow++;
			}
			if(path.charAt(i)=='^') {
				startrow--;
			}	
			if(startrow<=row&&startcol<=col) {
				output=output+mat[startrow-1][startcol-1];
			}
		}
		if(startrow>row&&startcol>col) {
			System.out.println("Invalid Path");
		}
		else {
			System.out.println(output);
		}
		scan.close();
	}
}
/*
 Find the Path
Given an (m x n) matrix, write a program to traverse the cell and print the values 
present in the given path. Include necessary validation and proper error messages in 
case of given path is out of bounds.
5 x 5 matrix :
{1 2 3 4 5 } (row 1)
{6 7 8 9 0 } (row 2)
{1 2 3 4 5 } (row 3)
{6 7 8 9 0 } (row 4)
{1 2 3 4 5 } (row 5)
Path Notation : ‘’>” is going right, “v” going down, “<” is going left, “^” is going up.
Example Input 1:
Start at (Row, Column): 2,3
Path: v > > v < < ^ > > v v
Output 8 3 4 5 0 9 8 3 4 5 0 5
Example Input 2:
Start at(row, Column): 1 , 4
Path: > v > >
Output: Invalid Path
Input Format
N M - matrix row and col
input for matrix
startrow startcol
path string
Sample Input 1
5 5
1 2 3 4 5
6 7 8 9 0
1 2 3 4 5
6 7 8 9 0
1 2 3 4 52 3
v>>v<<^>>vv
Sample Output 1
8 3 4 5 0 9 8 3 4 5 0 5
*/
