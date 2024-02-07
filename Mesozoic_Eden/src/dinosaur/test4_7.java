package dinosaur;
import java.util.Scanner;

public class test4_7 {

	public static void main(String[] args) {
		
		while(true) {
		int TrexEachfood = 100;
		int BrachioEachfood = 250;
		//티라노는 08시, 14시, 22시에 밥을 먹는다.
		//브라키오는 07시, 11시, 15시, 19시에 밥을 먹는다.
		

		Scanner sc1 = new Scanner(System.in);
		System.out.println("공룡을 입력하세요. 티라노, 브라키오 -> ");
		String dino = sc1.next();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("현재 시간을 입력하세요. 0~23(시)");
		int time = sc2.nextInt();
		
		if(time < 0 || time > 23) { // 시간을 이상하게 입력한 경우 다시 루프 처음으로 돌아가게 한다. 25시, 27시 33시는 존재 하지 않음.
			System.out.println("잘못된 시간 입니다. 0~23(시)");
			continue;
		}
		
		switch(dino) { // 티라노와 브라키오의 식사시간이 다르므로 스위치로 공룡 종류를 나눔.
		
		case "티라노":
		if(time == 8 || time == 14 || time == 22) {
			System.out.println("지금은 " + time + "시 " + "티라노사우루스에게 " + TrexEachfood + "kg만큼 먹이를 줘야 합니다.");
			}
		else System.out.println("지금 시간은 티라노의 식사시간이 아닙니다.");
		break;
	
		case "브라키오":
		if(time == 7 || time == 11 || time == 15 || time == 19) {
			System.out.println("지금은 " + time + "시 " + "브라키오사우루스에게 " + BrachioEachfood + "kg만큼 먹이를 줘야 합니다.");
		}
		else System.out.println("지금 시간은 브라키오의 식사시간이 아닙니다.");
		break;
		
		default:
			System.out.println("올바르지 않은 공룡이름 입니다.");
			break;
		
			}
		}
	}
}