package dinosaur;

public class test2_2 {
	public static void main(String[]args) {
		int dinoWeight = 5000;
		int foodPerWeightUnit = 3;
		double foodNeed = (dinoWeight / foodPerWeightUnit);
		
		System.out.println("몸무게 1kg 당 먹이는 " + foodPerWeightUnit + " kg가 필요하다. " 
							+ dinoWeight + "인 공룡은 " + foodNeed + "kg 만큼 필요하다.");
	}
}
