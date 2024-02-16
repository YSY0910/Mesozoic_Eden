package dinosaur;
import java.time.LocalDateTime;
import java.util.*;

public class test6_7 {
	Scanner sc = new Scanner(System.in);
	String[] dinoNames = new String[10];
	int[] dinoAges = new int[10];
	int[] dinoWeights = new int[10];
	int dinoCount = 0;
	boolean keepMenu = true;

	String[][] parkStaffs = {//이름, 나이, 경력 순
			{"이스마엘","파우스트","로쟈","오티스","료슈","그레고르"},
			{"30","28","25","22","35","31"},
			{"10","8","5","3","7","6"}
			};
	
	String[] nameStaffs = new String[5];
	int[] ageStaffs = new int[5];
	int[] yearsStaffs = new int[5];
	int staffsCount = 0;
	
	public static void main(String[]args) {
		test6_7 main = new test6_7();
		main.start();
	}
	
	public void start() {
	    do {
	        displayMenu();
	        int choice = sc.nextInt();
	        handleMenuChoice(choice);

	        System.out.println("계속 진행 할까요? (네/아니오)");
	        String ans = sc.next();
	        if (ans.equals("네")) {
	            keepMenu = true;
	        } else if (ans.equals("아니오")) {
	            keepMenu = false;
	            exitProgram();
	            System.exit(0);
	        }
	    } while (keepMenu);
	}
	public void displayMenu() {
		System.out.println("Mesozoic Eden 지원 프로그램에 오신 것을 환영합니다.");
		System.out.println("1. 공룡 등록/삭제");
		System.out.println("2. 개장 시간 확인");
		System.out.println("3. 고객 환영 인사");
		System.out.println("4. 관람객 인원 확인");
		System.out.println("5. 직원 관리");	
		System.out.println("6. 종료");
		System.out.println("항목을 선택하세요: ");
	}
	public void handleMenuChoice(int choice) {
		switch (choice) {
        case 1:
        	System.out.println("공룡을 등록할까요? 삭제할까요? ");
        	String ans = sc.next();
        	if(ans.equals("등록")) {
        		addDinosaur();
        	}
        	else if(ans.equals("삭제")) {
        		removeDinosaur();
        	}else System.out.println("잘못된 입력 입니다.");
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
            System.exit(0);
            break;
    }
	}
	public void addDinosaur() {
		if(dinoCount < 10) {
			System.out.println("공룡 정보를 등록합니다. ");
			System.out.println("공룡 이름은? ");
			dinoNames[dinoCount] = sc.next();
			System.out.println("공룡의 나이는? " );
			dinoAges[dinoCount] = sc.nextInt();
			System.out.println("공룡의 무게는? ");
			dinoWeights[dinoCount] = sc.nextInt();
			dinoCount++;
			
			System.out.println("공룡 등록 완료: ");
			
			for(int i = 0; i < dinoCount; i++) {
				System.out.println((i + 1) + "번째 공룡:");
				System.out.println("이름 : " + dinoNames[i]);
				System.out.println("나이 : " + dinoAges[i]);
				System.out.println("무게 : " + dinoWeights[i]);
				System.out.println();
		}
	}
		else System.out.println("최대 10마리 까지만 저장할 수 있습니다. ");
		
	}
    public void removeDinosaur() {
        if (dinoCount > 0) {
            System.out.println("삭제할 공룡의 인덱스를 입력하세요 (1부터 " + dinoCount + "까지): ");
            int indexToDelete = sc.nextInt();

            if (indexToDelete >= 1 && indexToDelete <= dinoCount) {
                // 인덱스를 1 감소시켜서 배열에서 공룡 정보 삭제
                indexToDelete--;

                // 삭제하려는 인덱스 뒤의 공룡 정보를 앞으로 한 칸씩 이동
                for (int i = indexToDelete; i < dinoCount - 1; i++) {
                    dinoNames[i] = dinoNames[i + 1];
                    dinoAges[i] = dinoAges[i + 1];
                    dinoWeights[i] = dinoWeights[i + 1];
                }

                // 배열의 마지막 요소 초기화
                dinoNames[dinoCount - 1] = null;
                dinoAges[dinoCount - 1] = 0;
                dinoWeights[dinoCount - 1] = 0;

                dinoCount--;

                System.out.println("공룡 삭제 완료.");

                // 삭제 후의 배열 출력
                for (int i = 0; i < dinoCount; i++) {
                    System.out.println((i + 1) + "번째 공룡:");
                    System.out.println("이름 : " + dinoNames[i]);
                    System.out.println("나이 : " + dinoAges[i]);
                    System.out.println("무게 : " + dinoWeights[i]);
                    System.out.println();
                }
            } else {
                System.out.println("잘못된 인덱스입니다.");
            }
        } else {
            System.out.println("등록된 공룡이 없습니다.");
        }
    }



	public void checkParkHours() {
		int nowTime = LocalDateTime.now().getHour();
		
		System.out.println(getLifeStage(nowTime));
		System.out.println("현재 시간: " + nowTime +"시\n");
	}
	public static String getLifeStage(int Hour) {
		if(Hour >= 9 && Hour < 19) {
			return "공원은 지금 개장중입니다.";
		}
		else return "공원은 지금 개장중이 아닙니다.";
	}
	
	public void greetGuest() {

		System.out.println("당신의 이름은? : ");
		String name = sc.next();
		System.out.println("공룡의 이름은? : ");
		String dinoName = sc.next();
		
		System.out.println(sayHello(name, dinoName));
	}
	public static String sayHello(String name, String dinoName) {
		return "안녕하세요, " + name  + "님! " + dinoName + "이(가) 당신을 기다리고 있습니다!";
	}
	
	public void checkVisitorsCount() {

		System.out.println("현재 관람객 수는? : ");
		int groups = sc.nextInt();
		
		System.out.println(checkGroup(groups));
	}
	public static String checkGroup(int people) {
		int maximum = 5000;
		if(maximum < people) { 
			return "관람객 수가 너무 많습니다.";
		}
		else return "질서를 지켜 관람을 부탁드립니다.";
	}
	
	public void manageStaff() {
	    System.out.println("---------------직원 목록---------------");
	    for (int j = 0; j < parkStaffs[0].length; j++) {
	        System.out.println((j + 1 + "번직원 ") + parkStaffs[0][j] + "\t" + " 나이 : " + parkStaffs[1][j] + "세\t" + " 경력 : " + parkStaffs[2][j] + "년차..");
	    }
	    System.out.println("-------------------------------------");
	}
	
	public void exitProgram() {
		System.out.println("프로그램을 종료합니다.");
	}
}