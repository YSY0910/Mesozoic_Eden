package dinosaur;

public class test2_5 {
	public static void main(String[]args) {
		int dinoAge1 = 8, dinoAge2 = 6;
		
		int ageDifference = dinoAge1 - dinoAge2;
		// int ageDifference1 = Math.abs(dinoAge1 - dinoAge2); Math.abs를 통해 음수 구분 삭제 가능.
		
		System.out.println("두 공룡의 나이차는: " + ageDifference);
	}
}
