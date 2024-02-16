package pack06;

import java.util.Arrays;

class Seniors{
	private int[] ages = new int[2];
	private int num;
	
	Seniors() {
		num = 2;
		ages[0] = 30;
		ages[1] = 40;
	}
	
	public int getNum() {
		return num;
	}
	public int[] getAges() {
		return Arrays.copyOf(ages, ages.length);
		// class Seniors에 저장된 private ages 배열의 복사본을 제공함 {30,40} 복사본을 변형해도 원본은 바뀌지 않음.
	}
}
public class test043 {
	public static void main(String[] args) {
		Seniors seniors = new Seniors();
		

		// 1. 기본형 반환은 문제없다.
		int num = seniors.getNum();
		System.out.println(num);
		num = -100;
		num = seniors.getNum();
		System.out.println(num);

		

		int[] copyAges = seniors.getAges();
		System.out.println(copyAges[0] + ", " + copyAges[1]);
		copyAges[0] = -9;
		copyAges[1] = -11;
		System.out.println(copyAges[0] + ", " + copyAges[1]); //변형된 복사본
		System.out.println(seniors.getAges()[0] + ", " + seniors.getAges()[1]); //원본 조회
		// 내부 배열 참조의 사본으로 private Seniors 배열을 바꿀 수 있다. 캡슐화 위배.

	}

}
