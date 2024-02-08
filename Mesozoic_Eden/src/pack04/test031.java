package pack04;

public class test031 {

	public static void main(String[] args) {
/*		double[] score = {7.0, 8.6, 9.0};
		double sum = 0;
		double avg = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		avg = sum / score.length;
	
		System.out.println("Average is " + avg);
*/
		
		int[] score1 = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < score1.length; i++) {
			score1[i] = score1[i] * 3 ;
		}
		
		for(int x : score1) { // 배열의 타입 + 배열의 이름(편한대로) : 배열의 이름
			System.out.println("Element: " + x);
		}
	}

}
