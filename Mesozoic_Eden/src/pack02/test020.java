package pack02;
import java.util.*;

public class test020 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age -->");
		
		int age = sc.nextInt();
		
		while(age >= 18) {
			System.out.println("As you are " + age + " years of age, " + "you can purchase alcohol.");
				
			System.out.println("Please enter your age -> ");
			
			age = sc.nextInt();
			
		}
	}
}
