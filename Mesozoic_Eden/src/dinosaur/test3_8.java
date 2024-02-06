package dinosaur;
import java.util.*;

public class test3_8 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("요일을 입력하세요. ->");
		String week = sc1.next();
		
		switch(week) {
		case "월요일", "화요일", "수요일", "목요일", "금요일", "토요일":
			
			Scanner sc = new Scanner(System.in);
			System.out.println("시간을 입력하세요 (24시간 단위) -> ");
			int time = sc.nextInt();
		
		if(time >= 10 && time < 19) {
			System.out.println("공원이 개장중입니다.");
		}else System.out.println("공원이 폐장중입니다.");
		break;
		case "일요일":
			System.out.println("매주 일요일은 휴무일 입니다.");
		break;
		default: System.out.println("잘못된 요일입니다 '월요일'처럼 입력해야 합니다.");
		break;
		}
	}

}
