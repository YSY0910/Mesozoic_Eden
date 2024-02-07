package pack02;
import java.util.*;

public class test018 {

	public static void main(String[] args) {
		int sum = 0;
		
		boolean keepGoing = true;
		
		while(keepGoing) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Number (negative number to exit) -> ");
			
			int n = sc.nextInt();
			
			if(n < 0) {
				keepGoing = false;
			}else { sum = sum + n; }
		}
		System.out.println("Sum of number is: " + sum);
	}
}
