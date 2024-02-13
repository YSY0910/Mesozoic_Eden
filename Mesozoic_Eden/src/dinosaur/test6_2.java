package dinosaur;
import java.util.*;

public class test6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("공룡의 체중은 얼마입니까? : ");
		int dinoWeight = sc.nextInt();
		
		double calcFood = dinoNeedFood(dinoWeight);
		System.out.println("하루에 필요한 음식의 양은 " + calcFood + "kg 입니다.");
	}

	
	public static double dinoNeedFood(double weight) {
		double calcFood = (weight * 0.09);
		return calcFood;
		
	}
}
