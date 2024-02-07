package pack02;
import java.util.*;

public class test021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age --> ");
		int age = sc.nextInt();
		
		do {
			System.out.println("As you are " + age+ " years of age," + "you can purchase alcohol.");
			
			System.out.println("Please enter your age --> ");
			
			age = sc.nextInt();
		}while(age >= 18);
	}

}
