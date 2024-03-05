package JavaAPI;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class EX5 {

	public static void main(String[]args) {
		/*
		LocalDate nowDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		LocalDateTime nowDateTime2 = LocalDateTime.now();
		LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
		System.out.println(nowDateTime);
		System.out.println(nowDateTime2);
		//Setting St.Patricks Day, 2025
		LocalDate id1 = LocalDate.of(2025, 3, 17);
		LocalDate id2 = LocalDate.parse("2025-03-17");
		System.out.println(id2.getDayOfWeek());
		LocalDate id3 = id2.withMonth(5);
		System.out.println(id3);
		LocalDate id4 = id3.plusYears(1);
		System.out.println(id4);
		LocalDate id5 = id4.minusDays(5);
		System.out.println(id5);
		LocalDateTime idt1 = id5.atTime(13, 45, 10);
		System.out.println(idt1);
		
		
		LocalDate bday = LocalDate.of(1997, 9, 10);
		LocalDate now = LocalDate.of(2024, 3, 4);
		
		Period a1 = Period.between(bday, now);
		
		System.out.println(a1);
		*/
		LocalDate date  = LocalDate.now();
		DateTimeFormatter  isoDate = DateTimeFormatter.ISO_DATE;
		System.out.println(date.format(isoDate));                    
		DateTimeFormatter fullDateStyle =
		DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(date.format(fullDateStyle));
		  
		LocalTime time = LocalTime.now();
		DateTimeFormatter isoTime = DateTimeFormatter.ISO_TIME;
		System.out.println(time.format(isoTime));
		
		DateTimeFormatter shortTimeStyle = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(time.format(shortTimeStyle));
		
		ZonedDateTime zdt  = ZonedDateTime.now();
		System.out.println(zdt);      // 2024-03-04T14:14:56.783483483+09:00[Asia/Seoul]
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yy-MMM-dd E D");
		System.out.println(zdt.format(dateFormatter)); // 24-MAR-04 Mon 64
		
		DateTimeFormatter timeFormatter1 = DateTimeFormatter.ofPattern("hh:mm:ss a z G");
		System.out.println(zdt.format(timeFormatter1));
		 
		DateTimeFormatter dateFormatter2 = 
				DateTimeFormatter.ofPattern("'Year:'yyyy'.Month:'MMMM'.Day:'dd'.'");
		System.out.println(zdt.format(dateFormatter2));
		
		String dateTimeString = "2024-03-04 14:10";
		DateTimeFormatter timeFormatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime idt = LocalDateTime.parse(dateTimeString, timeFormatter3);
		System.out.println(idt);     
	}
}
