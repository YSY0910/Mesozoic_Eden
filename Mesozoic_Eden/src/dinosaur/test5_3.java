package dinosaur;

public class test5_3 {

	public static void main(String[] args) {
		
		int[] dinoWeight = {3000, 7500, 800, 4500, 4000};

		int minWeight = dinoWeight[0];
		
		for(int i = 0; i < dinoWeight.length; i++) {
			if(dinoWeight[i] < minWeight) {
				minWeight = dinoWeight[i];
			}
		}
		System.out.println("가장 무거운 공룡의 무게는 " + minWeight + " kg이다.");
	}

}
