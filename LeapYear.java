//Java Program to Check Leap Year
package Core_javaPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		year=sc.nextInt();

		
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Year " + year + " is a leap year");
		
		else
            System.out.println("Year " + year + " is not a leap year");
		
	}

}
