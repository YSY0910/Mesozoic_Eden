package dinosaur;

public class test4_4 {

	public static void main(String[] args) {
		
		int[] dinoCage1 = {1500, 1000, 1100, 1500, 850, 1250, 1300};
		int sum = 0;
		
		for(int i = 0; i<dinoCage1.length; i++) {
			sum = sum + dinoCage1[i];
		}
		System.out.println("모든 공룡의 무게: " + sum);
	}
}
