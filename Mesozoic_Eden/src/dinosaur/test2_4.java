package dinosaur;

public class test2_4 {
	public static void main(String[]args) {
		int maxCapacity = 2500;
		int nowCapacity = 2000;
		
		String safeCheck = maxCapacity < nowCapacity ? "정원 초과" : "수용 가능";
		
		System.out.println(safeCheck);
		
	}
}
