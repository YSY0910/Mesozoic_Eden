package pack05;

public class test040 {

	public static void main(String[] args) {
		int x = 19;
		int[] arr = {1,2};
		callByValue(x, arr);
		System.out.println(x);
		System.out.println(arr[0]);
		x = callByValue(x, arr);
		System.out.println(x);
	}

	public static int callByValue(int x, int[] arr) {
		x = -1;
		arr[0] = -1;
		return x;
	}
}
