/*
 Help john to find new friends in social networkInput:
3
Mani 3 ram raj guna
Ram 2 kumar Kishore
Mughil 3 praveen Naveen Ramesh
Output:
Raj guna kumar Kishore praveen Naveen Ramesh
 */
package Smallcodes;
import java.util.HashSet;
import java.util.Scanner;

public class FindNewFriends {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of friends you have;");
		int num=scan.nextInt();
		scan.nextLine();
		HashSet<String>oldfriends=new HashSet<String>();
		HashSet<String>newfriends=new HashSet<String>();
		System.out.println("Enter the friends details in <friend name> <number of friends that friend have> <list the friends>");
		for(int i=0;i<num;i++) {
			oldfriends.add(scan.next());
			int n=scan.nextInt();
			while(n>0) {
				newfriends.add(scan.next());
				n--;
			}
		}
		System.out.println("New Friends are");
		for(String str:newfriends) {
			if(oldfriends.contains(str)) {
				
			}
			else {
				System.out.print(str+" ");
			}
				
		}
		scan.close();
	}

}
