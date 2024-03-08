//얘가 메인임 void main(String[]args)는 얘만이 가진다.
package Exception;
import java.time.LocalDate;
import java.util.*;
import coreapi.Dinosaur;
import coreapi.Activity;

public class DinosaurCareSystem {
	boolean keepMenu = true;
	Scanner sc = new Scanner(System.in);
	private List<Dinosaur> dinosaurs;
	private List<Activity> activities;
	public DinosaurCareSystem() {
		dinosaurs = new ArrayList<>();
		activities = new ArrayList<>();
		
		Dinosaur dino1 = new Dinosaur("티노", 5, "티라노사우르스", "양호");
        Dinosaur dino2 = new Dinosaur("트리", 3, "트리케라톱스", "양호");
        Dinosaur dino3 = new Dinosaur("스테", 7, "스테고사우루스", "양호");

        dinosaurs.add(dino1);
        dinosaurs.add(dino2);
        dinosaurs.add(dino3);
        
        Activity activity1 = new Activity("먹이주기", LocalDate.parse("2024-03-05"), dino1);
        Activity activity2 = new Activity("방황하기", LocalDate.parse("2024-03-05"), dino2);
        Activity activity3 = new Activity("낮잠자기", LocalDate.parse("2024-03-05"), dino3);
        
        activities.add(activity1);
        activities.add(activity2);
        activities.add(activity3);
	}
	
	public static void main(String[]args) {

		DinosaurCareSystem system = new DinosaurCareSystem();
		system.start();
	}
	
	public void addDinosaur(Dinosaur dinosaur) {
		dinosaurs.add(dinosaur);
		System.out.println("공룡 저장 완료");
	}

	public void logActivies(Activity activity) {
		activities.add(activity);
		System.out.println("행동 저장 완료");
	}
	
	public void handleDinosaurHealth() throws DinosaurIllException{
		//랜덤한 숫자를 생성하여 공룡의 건강 상태 시뮬레이션 하기
		Random random = new Random();
		int healthScore = random.nextInt(10); // 0부터 9사이의 랜덤한 숫자 생성.
		
		//건강이 나쁜경우 예외 던지기.
		if(healthScore < 5) {
			throw new DinosaurIllException("공룡이 많이 아픕니다.");
		}
		else {System.out.println("공룡이 건강합니다.");}
	}
	
	public void handleEnclosureSecurity() throws EnclosureBreachException{
		Random random = new Random();
		int securityScore = random.nextInt(10); // 0부터 9사이의 랜덤한 숫자 생성.
		
		//보안 상태가 나쁘면 예외 던지기
		if(securityScore < 5) {
			throw new EnclosureBreachException("공룡의 우리가 위험합니다.");
		}
		else {System.out.println("우리가 안전합니다.");}
	}
	
	public void start() {
	    do {
	    	Menu();
	        int choice = sc.nextInt();
	        handleMenuChoice(choice);

	        System.out.println("계속 진행 할까요? (네/아니오)");
	        String ans = sc.next();
	        if (ans.equals("네")) {
	            keepMenu = true;
	        } else if (ans.equals("아니오")) {
	            keepMenu = false;
	            System.exit(0);
	        }else {System.err.println("오/탈자 주의해주세요.");}
	    } while (keepMenu);
	}
	
	public void Menu() {
		System.out.println("공룡 관리 시스템");
		System.out.println("0. 나가기");
		System.out.println("1. 공룡 등록");
		System.out.println("2. 공룡 조회");
		System.out.println("3. 행동 등록");
		System.out.println("4. 행동 조회");
	}
	
	
	public void handleMenuChoice(int choice) {

		switch (choice) {
		case 1:
			System.out.println("공룡을 등록합니다.");

                // 사용자로부터 정보 입력 받아 Dinosaur 객체 생성
                System.out.println("이름: ");
                String name = sc.next();
                System.out.println("나이: ");
                int age = sc.nextInt();
                System.out.println("종: ");
                String species = sc.next();
                System.out.println("건강상태: ");
                String healthStatus = sc.next();

                // Dinosaur 객체 생성
                Dinosaur newDino = new Dinosaur(name, age, species, healthStatus);

                // 생성된 Dinosaur 객체를 addDinosaur 메서드에 전달
                addDinosaur(newDino);
			
			break;
		case 2:
			System.out.println("공룡 정보를 조회합니다.");
			for(Dinosaur dinos : dinosaurs) {
				System.out.println("이름: " + dinos.getName() + "  나이: " + dinos.getAge() + "  종: " + dinos.getSpecies() + "  상태: " + dinos.getHealthstatus());
			}
			break;
			
		case 3:
			System.out.println("공룡 행동을 등록합니다.");
			int i = 1;
			for(Dinosaur dinos : dinosaurs) {
				System.out.println(i++ + "번째 공룡 -> 이름: " + dinos.getName());
			}
			System.out.println("공룡 이름을 입력 해주세요.");
			String dinoName = sc.next();
			boolean findDino = false;
			Dinosaur selectedDino = null; // 선택된 Dinosaur 객체를 저장하기 위한 변수 추가
			for(Dinosaur dinos : dinosaurs) {
				if(dinoName.equals(dinos.getName())) {
					findDino = true;
					selectedDino = dinos; // 선택된 Dinosaur 객체 저장
					break;
				}
			}
			if(findDino) {
				System.out.println("날짜를 입력하세요 (YYYY-MM-DD) 11을 입력시 오늘 날짜로 자동으로 입력됩니다.");
				String dateString = sc.next();
				
				LocalDate date;
				if(dateString.equals("11")) {
					date = LocalDate.now();
					}
				else {
				try {
					date = LocalDate.parse(dateString);
				}catch (Exception e) {
					System.err.println("올바르지 않은 날짜입니다.");
					return;
				}
			}
				System.out.println("활동을 입력해주세요");
				String active = sc.next();
				
				Activity newAct = new Activity(active, date, selectedDino);
				logActivies(newAct);
			}
			else {System.err.println("해당 이름을 가진 공룡은 존재하지 않습니다.");}
			break;
		case 4:
			int j = 1;
			System.out.println("공룡 활동을 조회합니다.");
			for(Activity activ : activities) {
				System.out.println(j++ + "번 활동 이름: " + activ.getDinosaur().getName() + " 날짜: " + activ.getDate() + " 활동 내용: " + activ.getName());
			}
			break;
			
		case 0:
			System.out.println("프로그램 종료.");
			System.exit(0);
		}
	}
}

//난수를 받아 공룡 우리나 건강 상태 체크 하는 시뮬레이션
//DinosaurCareSystem cs = new DinosaurCareSystem();
//
//try {
//	cs.handleDinosaurHealth(); // 난수를 뽑아서 handleDinosaurHealth() 메서드 돌리기
//}catch (DinosaurIllException i) { // 만약에 5 미만이면? 해당 예외를 던지기.
//	System.out.println("공룡 건강 예외 발생: " + i.getMessage());
//}
//
//try {
//	cs.handleEnclosureSecurity(); // 난수를 뽑아서 EnclosureBreachException() 메서드 돌리기
//}catch (EnclosureBreachException b) { // 만약에 5 미만이면? 해당 예외를 던지기.
//	System.out.println("공룡 우리 예외 발생: " + b.getMessage());
//}
//if (dateString.equals("11")) {
//    date = LocalDate.now();
//} else {
//    try {
//        date = LocalDate.parse(dateString);
//    } catch (Exception e) {
//        System.err.println("올바르지 않은 날짜입니다.");
//        return;
//    }
//}
