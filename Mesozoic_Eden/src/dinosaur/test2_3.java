package dinosaur;

public class test2_3 {
	public static void main(String[]args) {
		int currentYear = 2024;
		boolean isLeapYear = currentYear % 4 == 0 && (currentYear % 100 !=0 || currentYear % 400 == 0);
		
		System.out.println("윤년 여부: " + isLeapYear);
	}
}
