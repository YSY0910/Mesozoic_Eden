package pack03;

public class test028 {

	public static void main(String[] args) {
		System.out.println("i j");

		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 5; j++) {
				if (j == 3) {
					continue;
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("Here");
	}
}
