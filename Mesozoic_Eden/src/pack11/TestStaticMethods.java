package pack11;

interface I{
	//static void m0(); 몸뚱이 없어서 에러
	static int m1() {return 3;}
	static String m2() {return "Hello";}
}
public class TestStaticMethods {

	public static void main(String[] args) {
		//System.out.println(m1()); 컴파일 오류
		System.out.println(I.m1());

		for(int i = 0; i < 8; i++) {
			System.out.println(i + I.m1() + " " + I.m2());
		}
	}

}
