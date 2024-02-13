package dinosaur;
import java.util.Scanner;

public class test6_7 {
	Scanner sc = new Scanner(System.in);
	String[] dinoNames = new String[10];
	int[] dinoAges = new int[10];
	int[] dinoWeight = new int[10];
	int dinoCount = 0;
	
	public static void main(String[]args) {
		test6_7 main = new test6_7();
		main.start();
	}
	public void start(){
		while(true) {
			displayMenu();
			int choice = sc.nextInt();
			handleMenuChoice(choice);
			
		}
	}
	public void displayMenu() {
		System.out.println("Welcome to Mesozoic Eden Assistant!");
		System.out.println("1. Add Dinosaur");
		System.out.println("2. Check Park Hourd");
		System.out.println("3. Greet Guest");
		System.out.println("4. Check Visiors Count");
		System.out.println("5. Manage Staff");
		System.out.println("6. Exit");
		System.out.println("Enter your choice: ");
	}
	public void handleMenuChoice(int choice) {
		switch (choice) {
        case 1:
            addDinosaur();
            break;
        case 2:
            checkParkHours();
            break;
        case 3:
            greetGuest();
            break;
        case 4:
            checkVisitorsCount();
            break;
        case 5:
            manageStaff();
            break;
        case 6:
            exitProgram();
            break;
    }
	}
	public void addDinosaur() {
			dinoInform();
		if(dinoCount < 10) {
			System.out.println("공룡 정보를 등록합니다. ");
			System.out.println("공룡 이름은? ");
			dinoNames[dinoCount] = sc.next();
			System.out.println("공룡의 나이는? " );
			dinoAges[dinoCount] = sc.nextInt();
			System.out.println("공룡의 무게는? ");
			dinoWeight[dinoCount] = sc.nextInt();
			
			dinoCount++;
		}
		else System.out.println("최대 10마리 까지만 저장할 수 있습니다. ");
	}
	public void dinoInform() {
		System.out.println("현재 공룡 정보: ");
		for(int i = 0; i < dinoCount; i++) {
			System.out.println((i + 1) + "번째 공룡:");
			System.out.println("이름 : " + dinoNames[i]);
			System.out.println("나이 : " + dinoAges[i]);
			System.out.println("무게 : " + dinoWeight[i]);
			System.out.println();
		}
	}
	public void checkParkHours() {
		System.out.println();
	}
	public void greetGuest() {
		System.out.println();
	}
	public void checkVisitorsCount() {
		System.out.println();
	}
	public void manageStaff() {
		System.out.println();
	}
	public void exitProgram() {
		System.out.println();
	}
}