package pack03;

public class test026 {

	public static void main(String[] args) {
		int[] data = {9, 3, 5, 7};
		
		System.out.println("[]\t[n]\tHistogram");
		
		for (int i = 0; i<data.length; i++) {
			System.out.print(i + "\t" + data[i] + "\t");
			for (int j = 1; j<=data[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
