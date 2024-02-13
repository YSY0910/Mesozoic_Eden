package dinosaur;

import java.util.Scanner;

public class test6_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 명이 오셨나요? : ");
		int groups = sc.nextInt();
		
		System.out.println(checkGroup(groups));
	}

	
	public static String checkGroup(int people) {
		int maximumGruop = 30;
		if(maximumGruop < people) {
			return "관람객 수가 너무 많습니다. 인원 조정이 필요합니다.";
		}
		else return "어서오세요! 질서를 지켜 관람을 부탁드립니다.";
	}
}
