package dinosaur;

import java.util.Scanner;

public class test6_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름은? : ");
		String name = sc.next();
		System.out.println("공룡의 이름은? : ");
		String dinoName = sc.next();
		
		System.out.println(sayHello(name, dinoName));
		
		sc.close();
	}
	
	public static String sayHello(String name, String dinoName) {
		return "안녕하세요, " + name  + "님! " + dinoName + "이(가) 당신을 기다리고 있습니다!";
	}
}
