package JavaAPI;
import java.time.*;

public class P3 {
	public static void main(String[]args) {
		LocalDate lastCheckDate = LocalDate.of(2024, 3, 1);
		
		LocalDate nowDate = LocalDate.now();
		
		LocalDate nextCheckDate = lastCheckDate.plusDays(45);
		
		Period daysNextCheckLeft = Period.between(nowDate, nextCheckDate);
		
		System.out.println("현재 날짜: " + nowDate);
		System.out.println("최근 점검 날짜: " + lastCheckDate);
		System.out.println("다음 안전 점검 날짜: " + nextCheckDate);
		System.out.println("다음 안전 점검 까지 남은 날짜: " + daysNextCheckLeft);
		//P = Period, 1M = 한달, 10D = 10일.
		System.out.println();
	}
}
