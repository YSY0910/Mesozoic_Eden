package dinosaur;

import java.util.*;

public class test4_6 {

	public static void main(String[] args) {

		boolean safeStatus = false;
		int safetyRating = 0;
		int safetyThreshold = 8;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("관람객에 대한 안전은 어떻습니까? 0~10점 --> ");
			int customer = sc.nextInt();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("공룡 우리의 상태는 어떻습니까? 0~10점 --> ");
			int dinoCage = sc.nextInt();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("통행로와 기타 시설물은 어떻습니까? 0~10점 --> ");
			int parkFacility = sc.nextInt();
			
			safetyRating = (customer + dinoCage + parkFacility) / 3;
			
			if(safetyRating > safetyThreshold) {
				safeStatus = true;
				System.out.println("공원은 안전합니다. 현재 상태를 유지하세요.");
				break;
			}else {System.out.println("공원에 대한 전반적인 점검과 보수가 필요합니다. 재평가를 요청합니다.");}
		}while(!safeStatus);
	}
}
