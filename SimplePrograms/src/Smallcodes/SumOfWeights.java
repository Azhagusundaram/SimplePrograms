/*
  Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the 
following conditions
1. 5 if a perfect square
2. 4 if multiple of 4 and divisible by 6
3. 3 if even number
And sort the numbers based on the weight and print it as follows
<10,its_weight>,<36,its weight><89,its weight>
Should display the numbers based on increasing order.
*/
package Smallcodes;
import java.util.Scanner;
public class SumOfWeights {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		int weight=0;
		int []arr=new int[num];
		int []sum=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<num;i++) {
			if((Math.sqrt(arr[i])-Math.floor(Math.sqrt(arr[i])))==0) {
				weight=weight+5;
			}
			if(((arr[i]%4)==0)&&((arr[i]%6)==0)){
				weight=weight+4;
			}
			if((arr[i]%2)==0) {
				weight=weight+3;
			}
			sum[i]=weight;
			weight=0;
		}
		for(int i=0;i<num;i++) {
			for(int j=i;j<num;j++) {
				if(sum[i]<sum[j]) {
					int temp1=sum[i];
					sum[i]=sum[j];
					sum[j]=temp1;
					int temp2=arr[i];
					arr[i]=arr[j];
					arr[j]=temp2;
				}
			}
		}
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]+","+sum[i]);
		}
		scan.close();
	}
}

