package pack05;

public class test038 {
	
	
	public static void m1(int... args) {
		
		int sum = 0;
		
		for(int i:args) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) {
		m1();
		m1(1);
		m1(1,2);
		m1(1,2,3);
	}
	
}
 