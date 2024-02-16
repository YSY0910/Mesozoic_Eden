package pack06;

public class test047 {

	public static void main(String[] args) {

		WorkDay Monday = WorkDay.MONDAY;
		
		System.out.println(Monday.getHoursOfWork() + ", " + Monday.getWorkLocation());
		
		System.out.println(WorkDay.SATURDAY.getHoursOfWork() + ", " + WorkDay.SATURDAY.getWorkLocation());
	}

}
