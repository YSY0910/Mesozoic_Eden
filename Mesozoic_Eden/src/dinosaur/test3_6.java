package dinosaur;

public class test3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dinoWeight = 3500;
		
		if(dinoWeight >= 1000 && dinoWeight <= 2000) {
			System.out.println("하루 2번 급여");
		}
		else if(dinoWeight >= 2000 && dinoWeight <= 3000) {
			System.out.println("하루 3번 급여");
		}
		else if(dinoWeight >= 3000 && dinoWeight <= 4000) {
			System.out.println("하루 4번 급여");
		}
		else if(dinoWeight > 10000) {
			System.out.println("하루 5번 급여");
		}
		else	System.out.println("지휘팀에 문의");
	}
	
}
