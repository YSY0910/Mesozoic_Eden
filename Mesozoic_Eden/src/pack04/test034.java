package pack04;
import java.util.Arrays;
public class test034 {

	public static void main(String[] args) {
		int[] result = {10,20,30,40,50};
		int targer = 30;
		int index = Arrays.binarySearch(result, targer);
		//System.out.println("Index of " + targer + " => " + index);
	 	// 배열에 존재하는 인덱스를 명령어로 찾아서 위치를 알려준다.
		// int index = Arrays.binarySearch(result, targer);
		
		
		int[] result1 = new int[5];
		Arrays.fill(result1, 42);
		//System.out.println(Arrays.toString(result1));
		// 배열에 Arrays.fill(result1, 42);을 작성하여 5개의 배열 공간에 전부 42를 채워 넣었다.
		

		int[] copiedResult = Arrays.copyOf(result, result.length);
		System.out.println(Arrays.toString(copiedResult));
		
		int newLength = 7;
		int[] originalArray = {10,20,30,40,50};
		
		int[] resizedArray = Arrays.copyOf(originalArray, newLength);
		// originalArray에 newLength의 크기(7)을 적용함. 크기가 늘어남.
		System.out.println("Orginal array: " + Arrays.toString(originalArray));
		System.out.println("Resized array: " + Arrays.toString(resizedArray));
		//이미 지정되어있는 result 어레이의 크기를 7로 늘리고 출력을 해보았다.
		
		
		int[] resultA = {10,20,30,40,50};
		int[] resultB = {10,20,30,40,50};
		// 어레이A와 B에 값을 입력 입력된 인덱스가 같을수도 다를수도...
		boolean arrayEqual = Arrays.equals(resultA, resultB);
		// 참, 거짓을 판별하는 arrayEqual작성. (resultA, resultB)를 비교하라.
		System.out.println("Are the arrays equal? : " + arrayEqual);
		// 참이면 true, 거짓이면 false
	}
}
