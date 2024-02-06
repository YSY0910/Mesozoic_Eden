package dinosaur;

import java.util.*;

public class test3_7 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("직책을 선택하세요. 보안팀, 환경팀, 배급팀, 가이드팀 -> ");
		
		String jobTitle = sc.next();
		
		switch (jobTitle) {
		case "보안팀":
			System.out.println("당신의 임무는 " + jobTitle + " 입니다.");
			break;
		case "환경팀":
			System.out.println("당신의 임무는 " + jobTitle + " 입니다.");
			break;
		case "배급팀":
			System.out.println("당신의 임무는 " + jobTitle + " 입니다.");
			break;
		case "가이드팀":
			System.out.println("당신의 임무는 " + jobTitle + " 입니다.");
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
			break;
		}
	}
}
