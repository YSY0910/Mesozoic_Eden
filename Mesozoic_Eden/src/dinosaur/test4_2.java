package dinosaur;
import java.util.*;

public class test4_2 {

	public static void main(String[] args) {
		
		boolean iNeedFood= true;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("공룡이 배가 고프나요? (0 , 1)");
			int ans = sc.nextInt();

			if(ans == 0) {
				iNeedFood= false;
				System.out.println("공룡이 배가 부릅니다.");
			}
			else if (ans == 1){
				System.out.println("공룡은 아직 배가 고픕니다.");
			}
			else System.out.println("잘못된 입력입니다.");
		}while(iNeedFood);
		
	}
}
