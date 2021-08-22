//Java Program to Find All Roots of a Quadratic Equation

package Core_javaPrograms;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter value of a:");
		double a = sc.nextDouble();
		
		System.out.println("\n Enter value od b:");
		double b= sc.nextDouble();
		
		System.out.println("\n Enter value of c:");
		double c= sc.nextDouble();
		
		double result = b * b - 4.0 * a * c;
		
		if(result > 0)
		{
			double r= (-b + Math.pow(result, 0.5)) / (2.0 * a);
			double r1=(-b - Math.pow(result, 0.5)) / (2.0 * a);
			System.out.println("The roots are " + r + " and " + r1);
        }
		else if (result == 0.0) {
            double r = -b / (2.0 * a);
            System.out.println("The root is " + r);
        } else {
            System.out.println("The equation has no real roots.");
        }

		
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
