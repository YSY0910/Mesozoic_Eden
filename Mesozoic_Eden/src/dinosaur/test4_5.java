package dinosaur;

import java.util.*;

public class test4_5 {

	public static void main(String[] args) {
		int totalTickets = 1000;
		int soldTickets = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(totalTickets > soldTickets) {
			System.out.println("남은 티켓: " + (totalTickets - soldTickets));
			System.out.println("구매하실 티켓 수를 입력하세요.");
			
			int buyTickets = sc.nextInt();
			
			if(buyTickets == 0) {
				System.out.println("티켓 판매를 종료합니다.");
				break;
			}
			if((totalTickets - soldTickets) >= buyTickets) {
				System.out.println("구매 완료: " + buyTickets);
				soldTickets += buyTickets;
			}
			else{
				System.out.println("재고보다 많이 구매 하실 수 없습니다.");
			}
			if((totalTickets - soldTickets) == 0){
				System.out.println("매진 되었습니다.");
				break;
			}
		}
		sc.close();
	}
}
