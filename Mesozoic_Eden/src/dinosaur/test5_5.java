package dinosaur;

public class test5_5 {

	public static void main(String[] args) {
		int[] dinoAges = {9, 4, 7, 9, 13};
		int sum = 0;
		double avg = 0;

		for(int i = 0; i < dinoAges.length; i++) {
			sum = sum + dinoAges[i];
			avg = sum / 5;
		}
		System.out.println("현재 공룡들의 평균 나이는: " + avg + "세 이다.");
	}
}
