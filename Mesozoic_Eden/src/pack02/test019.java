package pack02;

import java.util.Scanner;

public class test019 {

	public static void main(String[] args) {
		int sum = 0;
		
		boolean keepGoing = true;
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number (negative number to exit) -> ");
			int n = sc.nextInt();
			if(n < 0) {
				keepGoing = false;
			}else { sum = sum + n; }
		}while(keepGoing);
		System.out.println("Sum of numbers is: " + sum);
	}

}
