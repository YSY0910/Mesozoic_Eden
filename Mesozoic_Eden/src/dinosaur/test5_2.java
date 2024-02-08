package dinosaur;

public class test5_2 {

	public static void main(String[] args) {
		
		int[] dinoWeight = {3000, 7500, 800, 4500, 4000};

		int maxWeight = dinoWeight[0];
		
		for(int i = 0; i < dinoWeight.length; i++) {
			if(dinoWeight[i] > maxWeight) {
				maxWeight = dinoWeight[i];
			}
		}
		System.out.println("가장 무거운 공룡의 무게는 " + maxWeight + " kg이다.");
	}

}
