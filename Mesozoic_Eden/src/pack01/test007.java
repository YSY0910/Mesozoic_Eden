package pack01;
import java.util.*;

public class test007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Sport -> ");
		String sport = sc.next();
		
		switch(sport) {
		case "Soccer":
			System.out.println("I play soccer");
			break;
		case "Rugby":
			System.out.println("I play Rugby");
			break;
		case "Baseball":
			System.out.println("I play Baseball");
			break;
		case "Basketball":
			System.out.println("I play Basketball");
			break;
		case "Golf":
			System.out.println("I play Golf");
			break;
		}
	}
}
