package dinoClass;

public class App {
	public static void main(String[]args) {
		ParkStaff Staff1 = new Security("이스마엘", 30, "보안팀장", 10);
		ParkStaff Staff2 = new Veterinarians("파우스트", 28, "수의팀장", 8);
		ParkStaff Staff3 = new Guide("로쟈", 31, "안내팀장", 7);
		System.out.println(Staff1);
		System.out.println(Staff2);
		System.out.println(Staff3);
		
		//연습5
		boolean canWork = ((Security)Staff1).canWorkinCage(3);
		System.out.println("작업 가능 여부: " + canWork);
		boolean canWork1 = ((Veterinarians)Staff2).canWorkinCage(3);
		System.out.println("작업 가능 여부: " + canWork1);
		boolean canWork2 = ((Guide)Staff3).canWorkinCage(3);
		System.out.println("작업 가능 여부: " + canWork2);
	}
	
}