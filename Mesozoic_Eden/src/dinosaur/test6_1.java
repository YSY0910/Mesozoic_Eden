package dinosaur;
import java.util.*;

public class test6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("공룡은 나이는? : ");
		int dinoAge = sc.nextInt();
		
		System.out.println(getLifeStage(dinoAge));
	}

	public static String getLifeStage(int age) {

		
		if (age < 5) {
			return "해당 공룡은 현재 유아기 입니다.";
		}
		else if (age >= 5 && age < 15) {
			return "해당 공룡은 현재 청소년기 입니다.";
		}
		else  {
			return "해당 공룡은 현재 성체입니다.";
		}
		//return age;
	}
}
