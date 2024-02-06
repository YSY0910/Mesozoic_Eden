package pack01;

public class test011 {
	public static void main(String[] args) {
		byte b = 12;
		
		switch(b) {
		case 127: case -128:
			System.out.println("Ok");
			break;
			
//		case 128:
//			System.out.println("Out of range of byte variable.");
			
		case 12:
			System.out.println("Ok");
		}
	}
}
