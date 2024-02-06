package dinosaur;

public class test2_7 {
	public static void main(String[]args) {
		String name = "감자"; //공룡의 이름
		int dinoWeight =3500; //공룡 몸무게
		double eatPerWeight = 0.12; // 하루에 체중의 12퍼센트 만큼 먹어야한다.
		double totalEatFood = dinoWeight * eatPerWeight; // 무게와 퍼센트를 곱하면 하루 필요한 배급량이 나옴
		
		int eatFoodCount = 3; // 총 3번 급여. 아침, 점심, 저녁
		
		double eatFoodgive = totalEatFood / eatFoodCount; // 매끼 줘야 할 배급량
		
		System.out.println("우리 " + name + "는 " + dinoWeight + "kg이며, 매일 " 
								+ totalEatFood + "kg의 음식이 필요하고 매끼 "
										+ eatFoodgive + "kg 만큼 배급해야 한다.");
	}
}
