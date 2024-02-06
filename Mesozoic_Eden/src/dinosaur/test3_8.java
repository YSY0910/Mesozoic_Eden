package dinosaur;
import java.util.*;

public class test3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 입력하세요 (24시간 단위) -> ");
		int time = sc.nextInt();

		if(10 < time && time < 19) {
			System.out.println("공원이 개장중입니다.");
		}else
			System.out.println("공원이 개장전입니다.");
	}

}
