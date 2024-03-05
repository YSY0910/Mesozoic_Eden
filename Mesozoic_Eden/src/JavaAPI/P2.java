package JavaAPI;
import java.util.*;
import java.time.*;

class EventKeeper{
	private HashMap<String, LocalDateTime> eventLog;
	private HashMap<String, DayOfWeek> eventWeekLog;
	public EventKeeper() {
		eventLog = new HashMap<>();
		eventWeekLog = new HashMap<>();
	}
	
	public void logEvent(String event, LocalDateTime evenTime) {
		eventLog.put(event, evenTime);
	}
	
	public LocalDateTime getLogEvent(String event) {
		return this.eventLog.get(event);
	}
	
	public void logEventWeek(String event, DayOfWeek dayofweek) {
		eventWeekLog.put(event, dayofweek);
	}
	public DayOfWeek getLogEventWeek(String event) {
		return this.eventWeekLog.get(event);
	}
}

	public class P2{
		
		public static void main(String[]args) {
		
			EventKeeper eventkeeper = new EventKeeper();
		
			eventkeeper.logEvent("먹이 시간", LocalDateTime.of(LocalDate.now(), LocalTime.of(12, 0)));
		
			System.out.println(eventkeeper.getLogEvent("먹이 시간"));
			
			eventkeeper.logEventWeek("비상 훈련", DayOfWeek.FRIDAY);
			
			System.out.println(eventkeeper.getLogEventWeek("비상 훈련"));
			
		}
		
}
