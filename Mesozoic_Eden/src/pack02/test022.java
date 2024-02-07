package pack02;

public class test022 {

	public static void main(String[] args) {
		for(int i = 3; i >= 1; i--) {
			System.out.println(i);
		}
		for(int i = 1; i <= 3; i++) { //i++); 를 하면 한번만 동작함, 반복이 안 됨. 
			System.out.println("Looping");
		}
		for(int i = 10; i <= 50; i+= 10) {
			System.out.println(i);
		}
		for(int i = 0, j = 0; i < 1 && j < 1; i++, j++) {
			System.out.println(i + ", " + j);
		}
	}

}
