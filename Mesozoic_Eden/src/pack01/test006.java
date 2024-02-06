package pack01;

import java.util.*;

public class test006 {
	public static void main(String[]args) {
		final int JAN = 1; final int FEB = 2; final int MAR = 3;
		final int APR = 4; final int MAY = 5; final int JUN = 6;
		final int JUL = 7; final int AUG = 8; final int SEP = 9;
		final int OCT = 10; final int NOV = 11; final int DEC = 12;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month -> ");
		
		int month = sc.nextInt();
		
		System.out.println(month);
		
		int numDays=0;
		if(month == JAN || month == MAR || month == MAY || month  == JUL || month == AUG || month == OCT || month == DEC) {
		   numDays=31;
		} else if (month == APR || month == JUN || month == SEP || month == NOV) {
		   numDays=30;
		} else if(month== FEB) {
		   System.out.println("Enter year -> ");
		   int year = sc.nextInt();

		   if( (year % 400 == 0) || (year %4 == 0 && !(year %100 == 0)) ) {
		       numDays = 29;
		   }else {
		       numDays = 28;
		   }
		} else {
		      System.out.println("Invalid month: " + month);
		}
		if(numDays > 0) {
		    System.out.println("Number of days is: " + numDays);
		}
	}
}
