package pack01;
import java.util.*;

public class test009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (1...10) -> ");
	//	int number = sc.nextInt();
	//	final int two = 2;
		int number = sc.nextInt();
		switch(number) {
		case 1: case 3: case 5: case 7: case 9:
			System.out.println(number + " is odd.");
			break;
			
		case 2: case 4: case 6: case 8: case 10:
			System.out.println(number + " is even.");
			break;
			
			default:
				System.out.println(number + " is outside range(1...10)." );
				break;
		}
	}
}
