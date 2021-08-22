//Java Program to Generate Multiplication Table
package Core_javaPrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n,number;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		number=sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			System.out.println(number + "x" +(i)+ "=" +(number*(i)));
		}
	}

}
