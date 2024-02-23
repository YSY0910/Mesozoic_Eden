package DinoPark;
import java.util.Scanner;

public class Main {
	boolean keepMenu = true;
	Scanner sc = new Scanner(System.in);
	Dinosaur[] dinosaur = new Dinosaur[10];
	ParkStaff[] parkstaff = new ParkStaff[10];
	Ticket[] ticket = new Ticket[10];
	ParkStaff[] working = new ParkStaff[10];
	SafeTest safePark = new SafeTest(); //SafeTest라는 클래스를 정의하고 해당 클래스의 객체를 생성하여 safePark라는 변수에 할당.
	
	public static void main(String[]args) {
		Main main = new Main();
		main.alreadyData();
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
	            System.exit(0);
	        }else {System.out.println("오/탈자 주의해주세요.");}
	    } while (keepMenu);
	}
	
	public void displayMenu() {
		System.out.println("Mesozoic Eden Park에 오신 것을 환영합니다.");
		System.out.println("1. 공룡 관리");
		System.out.println("2. 직원 관리");
		System.out.println("3. 티켓 관리");
		System.out.println("4. 공원 상태 확인");
		System.out.println("5. 상황 컨트롤");
		System.out.println("6. 종료");
		System.out.print("번호를 입력하세요: ");
	}
	
	public void alreadyData() {
		dinosaur[0] = new LandDino("티노", 15, "큼", "티라노사우루스", "지룡", "육식", 2);
		dinosaur[1] = new LandDino("알로", 8, "큼", "알로사우루스", "지룡", "육식", 3);
		dinosaur[2] = new FlyDino("케찰", 15, "중간", "케찰코아틀", "익룡", "잡식", 2);
		dinosaur[3] = new FlyDino("프테", 25, "작음", "프테라노돈", "익룡", "잡식", 1);
		dinosaur[4] = new AquaDino("모사", 65, "큼", "모사사우루스", "수룡", "잡식", 2);
		dinosaur[5] = new AquaDino("모스", 35, "중간", "모스사우루스", "수룡", "잡식", 3);
		
		parkstaff[0] = new Security("윤선용", 27, "보안팀", 10);
		parkstaff[1] = new Security("이스마엘", 30, "보안팀", 5);
		parkstaff[2] = new Veterinarians("파우스트", 29, "수의팀", 7);
		parkstaff[3] = new Veterinarians("그레고르", 29, "수의팀", 5);
		parkstaff[4] = new Guide("로쟈", 28, "안내팀", 7);
		parkstaff[5] = new Guide("싱클레어", 22, "안내팀", 1);
		
        ticket[0] = new Ticket(20000, "롤랑", 20240223, false);
        ticket[1] = new Ticket(20000, "안젤리카", 20240223, false);
        ticket[2] = new Ticket(20000, "앤젤라", 20240223, false);
        ticket[3] = new Ticket(20000, "비나", 20240223, false);
        ticket[4] = new Ticket(20000, "말쿠트", 20240223, false);
	}
	
	public void handleMenuChoice(int choice) {
		String ans;
		switch (choice) {
		case 1:
			System.out.println("공룡: 등록? 수정? 삭제? 조회?: ");
			ans = sc.next();
			if (ans.equals("등록")) {
				addDinosaur();
			}
			else if (ans.equals("수정")) {
				editDinosaur();
			}
			else if (ans.equals("삭제")){
				removeDinosaur();
			}
			else if (ans.equals("조회")){
				infoDinosaur();
			}
			else {System.out.println("잘못된 입력입니다.");}
			break;
		case 2:
			System.out.println("직원: 등록? 수정? 삭제? 조회?: ");
			ans = sc.next();
			if (ans.equals("등록")) {
				addStaff();
			}
			else if (ans.equals("수정")){
				editStaff();
			}
			else if (ans.equals("삭제")){
				removeStaff();
			}
			else if (ans.equals("조회")){
				infoStaffs();
			}
			else {System.out.println("잘못된 입력입니다.");}
			break;
		case 3:
			System.out.println("티켓: 등록? 수정? 삭제? 조회?: ");
			ans = sc.next();
			if(ans.equals("등록")) {
				addTicket();
			}
			else if(ans.equals("수정")) {
				editTicket();
			}
			else if(ans.equals("삭제")) {
				removeTicket();
			}
			else if(ans.equals("조회")) {
				infoTickets();
			}
			else {System.out.println("잘못된 입력입니다.");}
			break;
		case 4:
			System.out.println("******************************");
			System.out.println("1. 간단 테스트");
			System.out.println("2. 공룡 우리 번호 확인");
			System.out.println("******************************");
			int ans1 = sc.nextInt();
			if(ans1 == 1) {
				System.out.println("간단 테스트를 시작합니다. ");
				
			}
			else if(ans1 == 2) {
				traceDino();
			}
			else {System.out.println("잘못된 입력입니다.");}
			break;
		case 5:
			System.out.println("******************************");
			System.out.println("1. VIP 고객 확인");
			System.out.println("2. 불꽃 놀이 안내");
			System.out.println("3. 직원 작업 명령");
			System.out.println("8. 비상벨 가동");
			System.out.println("******************************");
			int ans2 = sc.nextInt();
			if(ans2 == 1) {
				welcomeVIP();
			}
			else if(ans2 == 2) {
				fireWork();
			}
			else if(ans2 == 3) {

			}
			else if(ans2 == 8) {
				alertAlarm();
			}
			else {System.out.println("잘못된 입력입니다.");}
			break;
		case 6:
			System.out.println("프로그램 종료.");
			System.exit(0);
		}
	}
	
	public void addDinosaur() {
		int index = -1; //인덱스 값을 초기에 -1로 설정
		for(int i = 0; i < dinosaur.length; i++) {
			if(dinosaur[i] == null) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			System.out.println("공룡 정보를 등록합니다.");
			System.out.println("공룡 이름은? ");
			String name = sc.next();
			System.out.println("공룡 나이는? ");
			int age = sc.nextInt();
			System.out.println("공룡 크기는? ");
			String size = sc.next();
			System.out.println("공룡의 종은? ");
			String species = sc.next();
			System.out.println("공룡의 식성은? 초식/육식/잡식");
			String diet = sc.next();
			System.out.println("공룡 타입은? 지룡/수룡/익룡");
			String house = sc.next();
			if(house.equals("지룡")) {
				System.out.println("꼬리 길이는? ");
				int tailSize = sc.nextInt();
				Dinosaur newDino = new LandDino(name, age, size, species, diet, house, tailSize);
				dinosaur[index] = newDino;
			}
			else if(house.equals("수룡")) {
				System.out.println("지느러미 길이는? ");
				int finSize = sc.nextInt();
				Dinosaur newDino = new AquaDino(name, age, size, species, diet, house, finSize);
				dinosaur[index] = newDino;
			}
			else if(house.equals("익룡")) {
				System.out.println("날개 길이는? ");
				int wingSize = sc.nextInt();
				Dinosaur newDino = new FlyDino(name, age, size, species, diet, house, wingSize);
				dinosaur[index] = newDino;
			}else {System.out.println("오탈자 주의!");}
		}
		System.out.println("공룡 등록 완료");
}

	public void editDinosaur() {
	    System.out.println("수정할 공룡의 이름은?: ");
	    String name = sc.next();
	    // -1로 지정된 indexEdit값은 해당 이름의 공룡을 찾아내서 i로 변경 1번째에 있으면 1, indexEdit = 1.
	    int indexEdit = -1;
	    for (int i = 0; i < dinosaur.length; i++) {
	        if (dinosaur[i] != null && dinosaur[i].getName().equals(name)) {
	        	indexEdit = i;
	            break;
	        }
	    }

	    if (indexEdit != -1) {
	        System.out.println("새로운 공룡 정보를 입력하세요: ");
	        System.out.println("현재 이름: " + dinosaur[indexEdit].getName() + ", 바꿀 이름: ");
	        String newName = sc.next();
	        System.out.println("현재 나이: " + dinosaur[indexEdit].getAge() + ", 바꿀 나이: ");
	        int newAge = sc.nextInt();
	        System.out.println("현재 크기: " + dinosaur[indexEdit].getSize() + ", 바꿀 크기: ");
	        String newSize = sc.next();
	        System.out.println("현재 종족: " + dinosaur[indexEdit].getSpecies() + ", 바꿀 종족: ");
	        String newSpecies = sc.next();
	        System.out.println("현재 식성: " + dinosaur[indexEdit].getDiet() + ", 바꿀 식성: ");
	        String newDiet = sc.next();

	        if (dinosaur[indexEdit] instanceof LandDino) {
	            LandDino landDino = (LandDino) dinosaur[indexEdit]; // LandDino로 캐스트
	            System.out.println("꼬리 길이: " + landDino.getTailSize() + ", 새로운 꼬리 길이: ");
	            int newTailSize = sc.nextInt();
	            //앞에서 입력한 새로운 정보를 입력
	            landDino.setName(newName);
	            landDino.setAge(newAge);
	            landDino.setSize(newSize);
	            landDino.setSpecies(newSpecies);
	            landDino.setDiet(newDiet);
	            landDino.setTailSize(newTailSize);
	        }
	        else if (dinosaur[indexEdit] instanceof FlyDino) {
	        	FlyDino flydino = (FlyDino) dinosaur[indexEdit]; // FlyDino로 캐스트
	            System.out.println("날개 길이: " + flydino.getWingSize() + ", 새로운 날개 길이: ");
	            int newWingSize = sc.nextInt();
	            //앞에서 입력한 새로운 정보를 입력
	            flydino.setName(newName);
	            flydino.setAge(newAge);
	            flydino.setSize(newSize);
	            flydino.setSpecies(newSpecies);
	            flydino.setDiet(newDiet);
	            flydino.setWingSize(newWingSize);
	        }
	        else if (dinosaur[indexEdit] instanceof AquaDino) {
	        	AquaDino aquadino = (AquaDino) dinosaur[indexEdit]; // AquaDino로 캐스트
	            System.out.println("지느러미 길이: " + aquadino.getFinSize() + ", 새로운 지느러미 길이: ");
	            int newFinSize = sc.nextInt();
	            //앞에서 입력한 새로운 정보를 입력
	            aquadino.setName(newName);
	            aquadino.setAge(newAge);
	            aquadino.setSize(newSize);
	            aquadino.setSpecies(newSpecies);
	            aquadino.setDiet(newDiet);
	            aquadino.setFinSize(newFinSize);
	        }
	        else {System.out.println("잘못된 입력입니다.");}

	        System.out.println("공룡 정보 수정 완료.");
	        
	    } else {
	        System.out.println(name + " 라는 공룡은 없습니다.");
	    }
	}
	
	public void removeDinosaur() {
		System.out.println("삭제할 공룡의 이름은?: ");
		String ans = sc.next();
		
		int indexRemove = -1;
		for(int i = 0; i < dinosaur.length; i++) {
			if(dinosaur[i] != null && dinosaur[i].getName().equals(ans)) {
				indexRemove = i;
				break;
			}
		}
		if(indexRemove != -1) {
			System.out.println("공룡 삭제 완료.");
			dinosaur[indexRemove] = null;
		}
		else {System.out.println(ans + " 라는 공룡은 없습니다.");}

	}
	
	public void addStaff() {
		int index = -1; //인덱스 값을 초기에 -1로 설정
		for(int i = 0; i < dinosaur.length; i++) {
			if(dinosaur[i] == null) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			System.out.println("직원 정보를 등록합니다.");
			System.out.println("직원 이름은? ");
			String name = sc.next();
			System.out.println("직원 나이는? ");
			int age = sc.nextInt();
			System.out.println("직원 부서는? ");
			String position = sc.next();
			if(position.equals("보안팀")) {
				System.out.println("경력은? ");
				int yearOfWork = sc.nextInt();
				ParkStaff newStaff = new Security(name, age, position, yearOfWork);
				parkstaff[index] = newStaff;
			}
			else if(position.equals("수의팀")) {
				System.out.println("경력은? ");
				int yearOfWork = sc.nextInt();
				ParkStaff newStaff = new Security(name, age, position, yearOfWork);
				parkstaff[index] = newStaff;
			}
			else if(position.equals("안내팀")) {
				System.out.println("경력은? ");
				int yearOfWork = sc.nextInt();
				ParkStaff newStaff = new Security(name, age, position, yearOfWork);
				parkstaff[index] = newStaff;
			}
		}
		System.out.println("직원 등록 완료");
	}
	
	public void editStaff() {
	    System.out.println("수정할 직원의 이름은?: ");
	    String name = sc.next();
	    // -1로 지정된 indexEdit값은 해당 이름의 공룡을 찾아내서 i로 변경 1번째에 있으면 1, indexEdit = 1.
	    int indexEdit = -1;
	    for (int i = 0; i < parkstaff.length; i++) {
	        if (parkstaff[i] != null && parkstaff[i].getName().equals(name)) {
	        	indexEdit = i;
	            break;
	        }
	    }

	    if (indexEdit != -1) {
	        System.out.println("새로운 직원 정보를 입력하세요: ");
	        System.out.println("현재 이름: " + parkstaff[indexEdit].getName() + ", 바꿀 이름: ");
	        String newName = sc.next();
	        System.out.println("현재 나이: " + parkstaff[indexEdit].getAge() + ", 바꿀 나이: ");
	        int newAge = sc.nextInt();

	        if (parkstaff[indexEdit] instanceof Security) {
	        	Security security = (Security) parkstaff[indexEdit]; // LandDino로 캐스트
	            System.out.println("현재 경력: " + security.getYearOfWork() + ", 새로운 경력: ");
	            int newYearsOfWork = sc.nextInt();
	            //앞에서 입력한 새로운 정보를 가져오기
	            security.setName(newName);
	            security.setAge(newAge);
	            security.setYearOfWork(newYearsOfWork);
	        }
	        else if (parkstaff[indexEdit] instanceof Veterinarians) {
	        	Veterinarians doctor = (Veterinarians) parkstaff[indexEdit]; // LandDino로 캐스트
	            System.out.println("현재 경력: " + doctor.getYearOfWork() + ", 새로운 경력: ");
	            int newYearsOfWork = sc.nextInt();
	            //앞에서 입력한 새로운 정보를 가져오기
	            doctor.setName(newName);
	            doctor.setAge(newAge);
	            doctor.setYearOfWork(newYearsOfWork);
	        }
	        else if (parkstaff[indexEdit] instanceof Guide) {
	        	Guide guide = (Guide) parkstaff[indexEdit]; // LandDino로 캐스트
	            System.out.println("현재 경력: " + guide.getYearOfWork() + ", 새로운 경력: ");
	            int newYearsOfWork = sc.nextInt();
	            //앞에서 입력한 새로운 정보를 가져오기
	            guide.setName(newName);
	            guide.setAge(newAge);
	            guide.setYearOfWork(newYearsOfWork);
	        }
	        else {System.out.println("잘못된 입력입니다.");}

	        System.out.println("공룡 정보 수정 완료.");
	        
	    } else {
	        System.out.println(name + " 라는 직원은 없습니다.");
	    }
	}
	
	public void removeStaff() {
	System.out.println("삭제할 직원의 이름은? ");
	String ans = sc.next();
	
	int indexRemove = -1;
	for(int i = 0; i < parkstaff.length; i++) {
		if(parkstaff[i] != null && parkstaff[i].getName().equals(ans)) {
			indexRemove = i;
			break;
		}
	}
	if(indexRemove != -1) {
		System.out.println("직원 삭제 완료.");
		parkstaff[indexRemove] = null;
	}
	else {System.out.println(ans + "라는 직원은 없습니다.");}
	}
	
	
	public void infoDinosaur() {
		System.out.println("우리 공원의 공룡 목록입니다.");
		for(Dinosaur dino : dinosaur) {
			if(dino != null) {
	            if(dino instanceof LandDino) {
	            	LandDino landdino = (LandDino) dino;
					System.out.println("이름: " + dino.getName());
					System.out.println("나이: " + dino.getAge());
					System.out.println("크기: " + dino.getSize());
					System.out.println("종족: " + dino.getSpecies());
					System.out.println("식성: " + dino.getDiet());
					System.out.println("타입: " + dino.getHouse());
	                System.out.println("꼬리 길이: " + landdino.getTailSize());
	                System.out.println();
	            }
	            else if(dino instanceof FlyDino){
	            	FlyDino flydino = (FlyDino) dino;
					System.out.println("이름: " + dino.getName());
					System.out.println("나이: " + dino.getAge());
					System.out.println("크기: " + dino.getSize());
					System.out.println("종족: " + dino.getSpecies());
					System.out.println("식성: " + dino.getDiet());
					System.out.println("타입: " + dino.getHouse());
	                System.out.println("날개 길이: " + flydino.getWingSize());
	                System.out.println();
	            }
	            else if(dino instanceof AquaDino){
	            	AquaDino aquadino = (AquaDino) dino;
					System.out.println("이름: " + dino.getName());
					System.out.println("나이: " + dino.getAge());
					System.out.println("크기: " + dino.getSize());
					System.out.println("종족: " + dino.getSpecies());
					System.out.println("식성: " + dino.getDiet());
					System.out.println("타입: " + dino.getHouse());
	                System.out.println("지느러미 길이: " + aquadino.getFinSize());
	                System.out.println();
	            }
			}
		}
	}
	
	public void infoStaffs() {
	    System.out.println("우리 공원의 직원 목록입니다.");
	    for(ParkStaff staff : parkstaff) {
	        if(staff != null) {
	            System.out.println("이름: " + staff.getName());
	            System.out.println("나이: " + staff.getAge());

	            if(staff instanceof Security) {
	                Security sec = (Security) staff;
	                System.out.println("직위: " + sec.getPosition());
	                System.out.println("경력: " + sec.getYearOfWork());
	            } else if(staff instanceof Veterinarians) {
	                Veterinarians vet = (Veterinarians) staff;
	                System.out.println("직위: " + vet.getPosition());
	                System.out.println("경력: " + vet.getYearOfWork());
	            } else if(staff instanceof Guide) {
	                Guide guide = (Guide) staff;
	                System.out.println("직위: " + guide.getPosition());
	                System.out.println("경력: " + guide.getYearOfWork());
	            }

	            System.out.println();
	        }
	    }
	}
	
	
	public void infoTickets() {
		System.out.println("우리 공원의 티켓 목록입니다.");
		for(Ticket tick : ticket) {
			if(tick != null) {
				System.out.println("가격: " + tick.getPrice());
				System.out.println("방문객 이름: " + tick.getVisitorName());
				System.out.println("방문 일자: " + tick.getVisitDate());
				System.out.println("VIP 대상자: " + tick.getVip());
				if(tick instanceof SeasonTicket) {
					SeasonTicket seasonticket = (SeasonTicket) tick;
					System.out.println("시작일: " + seasonticket.getStartDate());
					System.out.println("종료일: " + seasonticket.getEndDate());
				}
				System.out.println();
			}
		}
	}

    public void traceDino() {
    	int i = 1;
    	System.out.println("공룡 우리 정보 입니다.");
        for (Dinosaur dino : dinosaur) {
            if (dino != null) {
            	System.out.println(dino.getName() + "은(는) " + i++ + "번 우리에 있습니다.");
            }
        }
    }
	
	public void simpleTest() {
		int sum = 0;
		double avg = 0;
		System.out.println("공룡 우리 상태를 채점하세요 1~10: ");
        int ans1 = sc.nextInt();
        System.out.println("공원 내 질서 상태를 채점하세요 1~10: ");
        int ans2 = sc.nextInt();
        System.out.println("공원 시설물 상태를 채점하세요 1~10: ");
        int ans3 = sc.nextInt();
        sum = ans1 + ans2 + ans3;
        avg = sum / 3.0;
        
        System.out.println("평균 점수: " + avg);
        safePark.setSafetyScore(avg);
	}


	public void addTicket() {
		int index = -1;
		for(int i = 0; i < ticket.length; i++ ) {
			if(ticket[i] == null) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			System.out.println("가격은 얼마입니까? ");
			int price = sc.nextInt();
			System.out.println("방문객의 이름은 무엇입니까? ");
			String visitorName = sc.next();
			System.out.println("방문날짜를 입력해주세요.");
			int visitDate = sc.nextInt();
			System.out.println("VIP 확인 네/아니오");
			String vip = sc.next();
			boolean VIP;
			if(vip.equals("네")) {
				VIP = true;
			}
			else if(vip.equals("아니오")) {
				VIP = false;
			}
			else {System.out.println("잘못된 입력입니다."); return;}
			
			System.out.println("시즌티켓 입니까? 네/아니오");
			String ans = sc.next();
			if(ans.equals("네")) {
				System.out.println("시작 날짜를 입력하세요.");
				int startDate = sc.nextInt();
				System.out.println("종료 날짜를 입력하세요.");
				int endDate = sc.nextInt();
				
				SeasonTicket seasonticket = new SeasonTicket(price, visitorName, visitDate, VIP, startDate, endDate);
				ticket[index] = seasonticket;
				System.out.println("시즌 티켓 등록 완료");
				}
			else if(ans.equals("아니오")) {
				Ticket newTicket = new Ticket(price, visitorName, visitDate, VIP);
				ticket[index] = newTicket;

                System.out.println("티켓 등록 완료");
				}else {
	                System.out.println("잘못된 입력입니다.");
	            }
			}

			}
			
	public void removeTicket() {
		System.out.println("삭제할 방문객 이름은? ");
		String ans = sc.next();
		
		int indexRemove = -1;
		for(int i = 0; i < ticket.length; i++) {
			if(ticket[i] != null && ticket[i].getVisitorName().equals(ans)) {
				indexRemove = i;
				break;
			}
		}
		if(indexRemove != -1) {
			System.out.println("티켓 삭제 완료");
			ticket[indexRemove] = null;
		}else {System.out.println(ans + "라는 방문객은 없습니다.");}
	}
	
	public void editTicket() {
	    System.out.println("수정할 티켓의 방문객 이름은? ");
	    String name = sc.next();

	    int indexEdit = -1;
	    for (int i = 0; i < ticket.length; i++) {
	        if (ticket[i] != null && ticket[i].getVisitorName().equals(name)) {
	            indexEdit = i;
	            break;
	        }
	    }

	    if (indexEdit != -1) {
	        System.out.println("새로운 티켓 정보를 입력하세요: ");
	        System.out.println("현재 가격: " + ticket[indexEdit].getPrice() + ", 새로운 가격: ");
	        int newPrice = sc.nextInt();
	        System.out.println("현재 이름: " + ticket[indexEdit].getVisitorName() + ", 새로운 이름: ");
	        String newName = sc.next();
	        System.out.println("현재 방문일자: " + ticket[indexEdit].getVisitDate() + ", 새로운 방문일자: ");
	        int newDate = sc.nextInt();
	        System.out.println("VIP: 예/아니오 " + ticket[indexEdit].getVip() + ", 새로운 VIP: 예/아니오");
	        String ans = sc.next();
	        boolean newVIP;

	        if (ans.equals("예")) {
	            newVIP = true;
	        } else if (ans.equals("아니오")) {
	            newVIP = false;
	        } else {
	            System.out.println("잘못된 입력 입니다.");
	            return;
	        }

	        ticket[indexEdit].setPrice(newPrice);
	        ticket[indexEdit].setVisitorName(newName);
	        ticket[indexEdit].setVisitDate(newDate);
	        ticket[indexEdit].setVip(newVIP);

	        System.out.println("티켓 정보 수정 완료.");
	    } else {
	        System.out.println(name + " 라는 방문객은 없습니다.");
	    }
	}
	

	
    public void welcomeVIP() {
    	boolean vipFound = false;
    	
    	for(Ticket tick : ticket) {
    		if(tick != null && tick.getVip()) {
    			vipFound = true;
    			System.out.println("환영합니다, VIP 고객 " + tick.getVisitorName() + "님! 행복한 하루 보내세요!");
    			System.out.println("안내팀 소속 직원분들은 VIP에게 환영과 성대한 환영을 부탁드립니다.");
    		}
    	}
		if(!vipFound) {
			System.out.println("VIP 고객이 없습니다. 다음에 다시 확인해봅시다.");
		}
    }
	    
    public void fireWork() {
    	System.out.println("공룡 이름을 입력해주세요.");
    	String name = sc.next();
    	int index = -1;
 	    for (int i = 0; i < dinosaur.length; i++) {
 	        if (dinosaur[i] != null && dinosaur[i].getName().equals(name)) {
 	        	index = i;
 	            break;
 	        }
 	    }
 	        if(index != -1) {
 	        	System.out.println("불꽃 놀이를 시작합니다. 장소는 " + dinosaur[index].getName() + "의 우리 앞 입니다. 많이 구경 와주세요~!");
 	        	
 	        }
 	    }
 	       
	public void alertAlarm(){ // do-while문을 이용해 상황종료가 될 때까지 계속 비상벨 화면을 출력, 공룡 우리에 격벽 작동, 직원은 관람객 대피안내, 고객들은 직원의 안내에 따라 대피
	    boolean CheckEM = true;
	    do {
	    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!비상 상황 발생!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	    System.out.println("---------------비상벨이 울립니다. 공원에 대피령을 선포합니다---------------");
		for(Dinosaur dino : dinosaur) {
			if(dino != null) {
				System.out.println("강화 격벽 폐쇄: " + dino.getName() + "이(가) 있는 우리에 강화 격벽을 작동합니다.");
					
			}
		}			System.out.println();
		for(ParkStaff worker : parkstaff) {
			if(worker != null) {
				System.out.println("대피 안내 시작: " + worker.getName() + " 직원은 즉시 관람객이 안전하게 대피 할 수 있도록 하세요.");

			}
		}			System.out.println();
		for(Ticket tick : ticket) {
			if(tick != null) {
				System.out.println("대피 시작: " + tick.getVisitorName() + " 고객님은 즉시 직원의 안내에 따라 신속히 대피하세요.");

			}
		}			System.out.println();
	    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!비상 상황 발생!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

	    System.out.println("상황이 종료 되었나요? 네/아니오");
	    String ans = sc.next();
	    if(ans.equals("네")) {
	    	CheckEM = false;
	    	System.out.println("상황종료. 비상벨을 종료합니다.");
	    }
	    else if(ans.equals("아니오")) {
	    	CheckEM = true;
	    }
	    }while (CheckEM);
	   }
}

