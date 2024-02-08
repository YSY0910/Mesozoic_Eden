package pack04;

public class test030 {

	public static void main(String[] args) {
		
		String[] names = {"이스마엘", "파우스트", "로쟈", "오티스"};
		int index = 1;
		
		if(index >= 0 && index < names.length) {
			System.out.println("Element at index " + index + ": " + names[index]);
		}else {
			System.out.println("Invaid index: " + index);
		}
		
		
		int[] result = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < result.length; i++) {
			System.out.println("Element at " + i + " is " + result[i]);
		}
	}

}
