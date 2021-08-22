//Java Program to Calculate Sum of Natural Numbers
package Core_javaPrograms;

import java.util.Scanner;

public class SumofNaturalNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,last,sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a  last Natural number:");
		last = sc.nextInt();
		
		for(i=1;i<=last;i++){
			sum=sum+i;
		}
		System.out.println("Sum of Natural Number is: "+sum);

	}

}
