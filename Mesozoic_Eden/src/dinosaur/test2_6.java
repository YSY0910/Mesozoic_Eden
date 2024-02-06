package dinosaur;

public class test2_6 {
	public static void main(String[]args) {
		int safetyRatting = 94;
		int safetyThreshold = 70;
		
		String safeCheck = safetyRatting < safetyThreshold ? "공원에 대해 안전 점검을 해야합니다." : "공원은 안전합니다.";
		
		System.out.println(safeCheck);
	}
}
