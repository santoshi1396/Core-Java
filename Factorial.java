//Java Program to Find Factorial
package Core_javaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int i,n, fact=1;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a no: ");
		n= sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial is: "+fact);
		
		
	}

}
