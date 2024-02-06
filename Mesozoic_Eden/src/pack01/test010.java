package pack01;
import java.util.*;

public class test010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int JAN = 1; final int FEB = 2; final int MAR = 3;
		final int APR = 4; final int MAY = 5; final int JUN = 6;
		final int JUL = 7; final int AUG = 8; final int SEP = 9;
		final int OCT = 10; final int NOV = 11; final int DEC = 12;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month -> ");
		
		int month = sc.nextInt();
		
		System.out.println(month);
		
		int numDays = 0;
		
		switch(month) {
		case JAN: case MAR: case MAY: case JUL: case AUG: case OCT: case DEC:
			numDays = 31;
			//System.out.println("NumDays = " + numDays);
			break;
		case APR: case JUN: case SEP: case NOV:
			numDays = 30;
			//System.out.println("NumDays = " + numDays);
			break;
		case FEB:
			System.out.println("Enter a Year -> ");
			int year = sc.nextInt();
			//if((A) || (B && C))
			if((year % 400 == 0) || (year % 4 == 0 && !(year % 100 == 0))){
				numDays =29;
				//System.out.println("NumDays = " + numDays);
			}else {
				numDays = 28;
				//System.out.println("NumDays = " + numDays);
			}
			break;
		default:
			System.out.println("Invaild month " + month);
		}
		if(numDays > 0) {
			System.out.println("Number of days is " + numDays);
		}
	}

}
