//Java Program to Display Fibonacci Series
package Core_javaPrograms;

import java.util.Scanner;

public class FibonanciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n1=0,n2=1,n3,count=10;
		System.out.println("n1 and n2 are: ");
		System.out.println(n1 +" "+n2);
		
		System.out.println("Fibonancii series is: ");

		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);

		}
	}

}
