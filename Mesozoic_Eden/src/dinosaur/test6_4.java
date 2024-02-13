package dinosaur;

import java.time.LocalDateTime;

public class test6_4 {

	public static void main(String[] args) {
		int nowTime = LocalDateTime.now().getHour();
		
		System.out.println(getLifeStage(nowTime));
		System.out.println("현재 시간: " + nowTime +"시");
	}

	
	public static String getLifeStage(int Hour) {

		if(Hour > 10 && Hour < 19) {
			return "공원은 지금 개장중입니다.";
		}
		else return "공원은 지금 개장중이 아닙니다.";

	}
}
