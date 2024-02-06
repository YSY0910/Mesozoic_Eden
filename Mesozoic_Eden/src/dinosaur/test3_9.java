package dinosaur;

import java.util.*;

public class test3_9 {

	public static void main(String[] args) {
		int safetyHold = 6;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("직책을 선택하세요. 보안팀, 환경팀, 배급팀, 가이드팀 -> ");
		String role = sc.next();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("24시 단위로 현재 시간을 입력하세요. -> ");
		int time = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("현재 보안 등급을 입력하세요. -> ");
		int safetyRating = sc2.nextInt();
		System.out.println("현재 최소 보안 등급: " + safetyHold);
		
		switch(role) {
		case "보안팀":
			System.out.println("당신의 임무는 " + role + " 입니다.");
			if (safetyRating > safetyHold) {
				System.out.println("순찰을 시작하세요");
			}else System.out.println("순찰을 강화하세요");
			
			if(10 < time && time < 19) {
				System.out.println("순찰을 시작하세요");
			}else
				System.out.println("야간 순찰을 시작하세요");
			break;
			
/*			if(10 < time && time < 11) {
				System.out.println("출입문 관리 및 CCTV 감시");
			}
			else if(11 < time && time < 14) {
				System.out.println("교대 CCTV 감시 및 공원 순찰");
			}
			else if(14 < time && time < 17) {
				System.out.println("공룡 우리 및 통행로 집중 감시");
			}
			else if(17 < time && time < 19) {
				System.out.println("퇴장 관람객 확인 및 CCTV 감시");
			}
			else System.out.println("특이사항 보고 후 퇴근, 당직자는 경비실에서 상황대기");
			break;*/
			
		case "청소팀":
			System.out.println("당신의 임무는 " + role + " 입니다.");
			if (safetyRating > safetyHold) {
				System.out.println("청소를 하세요");
			}else System.out.println("비상 상황 종료 후 청소하세요");
			
			if(10 < time && time < 19) {
				System.out.println("공원 환경 관리");
			}else
				System.out.println("폐기물 수거 및 공원 전체 청소");
			break;
			
		case "가이드팀":
			System.out.println("당신의 임무는 " + role + " 입니다.");
			if (safetyRating > safetyHold) {
				System.out.println("관람객 가이드");
			}else System.out.println("대피소 안내");
			
			if(10 < time && time < 19) {
				System.out.println("안내소 운영");
			}else
				System.out.println("다음날 관광 경로 준비");
			break;
			
		case "급여팀":
			System.out.println("당신의 임무는 " + role + " 입니다.");
			if(10 < time && time < 19) {
				System.out.println("시간에 맞춰 먹이 급여");
			}else
				System.out.println("다음날 먹이 준비");
			break;
		default:
			System.out.println("정확한 팀을 입력해주세요.");
			break;
			};
		}
}
