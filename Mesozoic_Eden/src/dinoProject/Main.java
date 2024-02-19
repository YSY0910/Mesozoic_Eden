package dinoProject;
import java.util.*;

public class Main{
	boolean keepMenu = true;
	Scanner sc = new Scanner(System.in);
	Dinosaur[] dinosaur = new Dinosaur[10];
	Employee[] employee = new Employee[10];
	Ticket[] ticket = new Ticket[10];
	SafeTest safePark = new SafeTest();


    
	public static void main(String[]args) {
		Main main = new Main();
		main.alreadyData();
		main.start();
	}

	public void alreadyData() { //미리 정보를 넣어둠.
        dinosaur[0] = new Dinosaur("티라노", 15, "티라노사우루스");
        dinosaur[1] = new Dinosaur("스테고", 8, "스테고사우루스");
        dinosaur[2] = new Dinosaur("알로", 10, "알로사우루스");
        dinosaur[3] = new Dinosaur("안길로", 20, "안길로사우루스");
        
        employee[0] = new Employee("이스마엘", 28, "보안팀장", 8);
        employee[1] = new Employee("로쟈", 27, "보안팀원", 4);
        employee[2] = new Employee("오티스", 29, "보안팀원", 6);
        employee[3] = new Employee("료슈", 31, "보안팀원", 5);
        
        ticket[0] = new Ticket(15000, "롤랑", 20240219, false);
        ticket[1] = new Ticket(15000, "안젤리카", 20240219, true);
        ticket[2] = new Ticket(15000, "파피", 20240219, false);
        ticket[3] = new Ticket(15000, "이리스", 20240219, false);
        
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
	        }else {System.out.println("오/탈자 주의해주세요.");}
	    } while (keepMenu);
	}
	
	public void exitProgram() {
		System.out.println("프로그램을 종료합니다.");
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
			System.out.println("공룡의 종은? ");
			String species = sc.next();
			
			Dinosaur newDino = new Dinosaur(name, age, species);
			dinosaur[index] = newDino;
			
			System.out.println("공룡 등록 완료");
			for(Dinosaur dino : dinosaur) {
				if(dino != null) {
					System.out.println("이름: " + dino.getName());
					System.out.println("나이: " + dino.getAge());
					System.out.println("종족: " + dino.getSpecies());
					System.out.println();
				}
			}
		}
}
	
	public void addEmployee() {
		int index = -1;
		for(int i = 0; i < employee.length; i++) {
			if(employee[i] == null) {
				index = i;
				break;
			}
		}
		if(index != -1) {
		System.out.println("등록할 직원의 이름은? ");
		String name = sc.next();
		System.out.println("직원의 나이는? ");
		int age = sc.nextInt();
		System.out.println("직원의 근무지는? ");
		String jobTitle = sc.next();
		System.out.println("직원의 경력은? ");
		int yearOfExperience = sc.nextInt();
		
		Employee newEmployee = new Employee(name, age, jobTitle, yearOfExperience);
		employee[index] = newEmployee;
		
		System.out.println("직원 등록 완료");
		for(Employee worker : employee) {
			if(worker != null) {
				System.out.println("이름: " + worker.getName());
				System.out.println("나이: " + worker.getAge());
				System.out.println("근무지: " + worker.getJobTitle());
				System.out.println("경력: " + worker.getYearOfExperience());
				System.out.println();
			}
		}
	}
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
			System.out.println("VIP 확인 ");
			boolean VIP = sc.nextBoolean();
			
			Ticket newTicket = new Ticket(price, visitorName, visitDate, VIP);
			ticket[index] = newTicket;
			
			System.out.println("티켓 등록 완료");
			for(Ticket tick : ticket) {
				if(tick != null) {
					System.out.println("가격: " + tick.getPrice());
					System.out.println("이름: " + tick.getVisitorName());
					System.out.println("방문일자: " + tick.getVisitDate());
					System.out.println("VIP 확인: " + tick.getVip());
					System.out.println();
				}
			}
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
		for(Dinosaur dino : dinosaur) {
			if(dino != null) {
				System.out.println("이름: " + dino.getName());
				System.out.println("나이: " + dino.getAge());
				System.out.println("종족: " + dino.getSpecies());
				System.out.println();
			}
		}
	}
	
	public void removeEmployee() {
	System.out.println("삭제할 직원의 이름은? ");
	String ans = sc.next();
	
	int indexRemove = -1;
	for(int i = 0; i < employee.length; i++) {
		if(employee[i] != null && employee[i].getName().equals(ans)) {
			indexRemove = i;
			break;
		}
	}
	if(indexRemove != -1) {
		System.out.println("직원 삭제 완료.");
		employee[indexRemove] = null;
	}
	else {System.out.println(ans + "라는 직원은 없습니다.");}
	for(Employee worker : employee) {
		if(worker != null) {
			System.out.println("이름: " + worker.getName());
			System.out.println("나이: " + worker.getAge());
			System.out.println("근무지: " + worker.getJobTitle());
			System.out.println("경력: " + worker.getYearOfExperience());
			System.out.println();
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
		for(Ticket tick : ticket) {
			if(ticket != null) {
				System.out.println("가격: " + tick.getPrice());
				System.out.println("이름: " + tick.getVisitorName());
				System.out.println("방문일자: " + tick.getVisitDate());
				System.out.println("VIP: " + tick.getVip());
				System.out.println();
			}
		}
	}
	
	public void editDinosaur() {
	    System.out.println("수정할 공룡의 이름은?: ");
	    String name = sc.next();

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
	        String newName = sc.next(); // sc.next() 대신 sc.nextLine() 사용, next() 를 그냥 사용할시 엔터를 입력한거 자체를 값으로 이해 할 수 있음.
	        System.out.println("현재 나이: " + dinosaur[indexEdit].getAge() + ", 바꿀 나이: ");
	        int newAge = sc.nextInt();
	        System.out.println("현재 종: " + dinosaur[indexEdit].getSpecies() + ", 바꿀 종: ");
	        String newSpecies = sc.next();

	        dinosaur[indexEdit].setName(newName);
	        dinosaur[indexEdit].setAge(newAge);
	        dinosaur[indexEdit].setSpecies(newSpecies);

	        System.out.println("공룡 정보 수정 완료.");

	        // 수정 후의 정보 출력
	        for (Dinosaur dino : dinosaur) {
	            if (dino != null) {
	                System.out.println("이름: " + dino.getName());
	                System.out.println("나이: " + dino.getAge());
	                System.out.println("종족: " + dino.getSpecies());
	                System.out.println();
	            }
	        }
	    } else {
	        System.out.println(name + " 라는 공룡은 없습니다.");
	    }
	}
	
	public void editEmployee() {
	    System.out.println("수정할 직원의 이름은?: ");
	    String name = sc.next();

	    int indexEdit = -1;
	    for (int i = 0; i < employee.length; i++) {
	        if (employee[i] != null && employee[i].getName().equals(name)) {
	        	indexEdit = i;
	            break;
	        }
	    }

	    if (indexEdit != -1) {
	        System.out.println("새로운 직원 정보를 입력하세요: ");
	        System.out.println("현재 이름: " + employee[indexEdit].getName() + ", 새로운 이름: ");
	        String newName = sc.next(); // sc.next() 대신 sc.nextLine() 사용, next() 를 그냥 사용할시 엔터를 입력한거 자체를 값으로 이해 할 수 있음.
	        System.out.println("현재 나이: " + employee[indexEdit].getAge() + ", 새로운 나이: ");
	        int newAge = sc.nextInt();
	        System.out.println("현재 근무지: " + employee[indexEdit].getJobTitle() + ", 새로운 근무지: ");
	        String newJobTitle = sc.next();
	        System.out.println("현재 경력: " + employee[indexEdit].getYearOfExperience() + ", 새로운 경력: ");
	        int newYears = sc.nextInt();
	        
	        employee[indexEdit].setName(newName);
	        employee[indexEdit].setAge(newAge);
	        employee[indexEdit].setJobTitle(newJobTitle);
	        employee[indexEdit].setYearOfExperience(newYears);
	        
	        System.out.println("직원 정보 수정 완료.");

	        // 수정 후의 정보 출력
	        for (Employee worker : employee) {
	            if (worker != null) {
	                System.out.println("이름: " + worker.getName());
	                System.out.println("나이: " + worker.getAge());
	                System.out.println("근무지: " + worker.getJobTitle());
	                System.out.println("경력: " + worker.getYearOfExperience());
	                System.out.println();
	            }
	        }
	    } else {
	        System.out.println(name + " 라는 직원은 없습니다.");
	    }
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
	        System.out.println("VIP: " + ticket[indexEdit].getVip() + ", VIP: ");
	        boolean newVIP = sc.nextBoolean();
	        
	        ticket[indexEdit].setPrice(newPrice);
	        ticket[indexEdit].setVisitorName(newName);
	        ticket[indexEdit].setVisitDate(newDate);
	        ticket[indexEdit].setVip(newVIP);
	        

	        
	        System.out.println("티켓 정보 수정 완료.");

	        // 수정 후의 정보 출력
	        for (Ticket tick : ticket) {
	            if (tick != null) {
	                System.out.println("이름: " + tick.getPrice());
	                System.out.println("나이: " + tick.getVisitorName());
	                System.out.println("근무지: " + tick.getVisitDate());
	                System.out.println("경력: " + tick.getVip());
	                System.out.println();
	            }
	        }
	    } else {
	        System.out.println(name + " 라는 방문객은 없습니다.");
	    }
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
	
	public void handleMenuChoice(int choice) {
		String ans;
		switch (choice) {
		case 1:
			System.out.println("공룡을 등록? 수정? 삭제?: ");
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
			else {System.out.println("오/탈자를 주의해주세요.");}
			break;
		case 2:
			System.out.println("직원을 등록? 수정? 삭제?: ");
			ans = sc.next();
			if (ans.equals("등록")) {
				addEmployee();
			}
			else if (ans.equals("수정")){
				editEmployee();
			}
			else if (ans.equals("삭제")){
				removeEmployee();
			}
			else {System.out.println("오/탈자를 주의해주세요.");}
			break;
		case 3:
			System.out.println("티켓을 등록? 수정? 삭제?: ");
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
			else {System.out.println("오/탈자를 주의해주세요.");}
			break;
		case 4:
			System.out.println("******************************");
			System.out.println("1. 간단 테스트");
			System.out.println("2. 공룡 우리 번호 확인");
			System.out.println("******************************");
			int ans1 = sc.nextInt();
			if(ans1 == 1) {
				System.out.println("간단 테스트를 시작합니다. ");
				simpleTest();
				safePark.checkSafe();
			}
			else if(ans1 == 2) {
				displayDinosaurs();
			}
			else {System.out.println("다시 입력 해주세요.");}
			break;
		case 5:
			System.out.println("******************************");
			System.out.println("1. VIP 고객");
			System.out.println("4. 비상벨 가동"); // 오작동 사례가 있어 4번으로 변경.
			System.out.println("******************************");
			int ans2 = sc.nextInt();
			if(ans2 == 1) {
				welcomeVIP();
			}
			else if(ans2 == 4) {
				displayAlram();
			}
			else {System.out.println("다시 입력 해주세요.");}
			break;
		case 6:
			System.out.println("프로그램 종료.");
			System.exit(0);
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
	
    public void displayDinosaurs() {
    	int i = 0;
        System.out.println("우리 안의 공룡들:");
        for (Dinosaur dino : dinosaur) {
            if (dino != null) {
            	System.out.println("우리 번호: " + i++);
                System.out.println("이름: " + dino.getName());
                System.out.println("나이: " + dino.getAge());
                System.out.println("종 : " + dino.getSpecies());
                System.out.println();
            }
        }
    }
    
    public void welcomeVIP() {
    	boolean vipFound = false;
    	
    	for(Ticket tick : ticket) {
    		if(tick != null && tick.getVip()) {
    			System.out.println("환영합니다, VIP 고객 " + tick.getVisitorName() + "님!");
    			vipFound = true;
    		}
    	}
		if(!vipFound) {
			System.out.println("VIP 고객이 없습니다.");
		}
    }
    
    
    public void displayAlram(){
    	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!비상 상황 발생!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	System.out.println("비상벨이 눌렸습니다. 공원에 대피령을 발표합니다.");
		for(Dinosaur dino : dinosaur) {
			if(dino != null) {
				System.out.println("강화 격벽 폐쇄: " + dino.getName() + "이(가) 있는 우리에 강화 격벽을 작동합니다.");

			}
		}				System.out.println();
		for(Employee worker : employee) {
			if(worker != null) {
				System.out.println("대피 안내 시작: " + worker.getName() + " 직원은 즉시 관람객이 안전하게 대피 할 수 있도록 하세요.");

			}
		}				System.out.println();
		for(Ticket tick : ticket) {
			if(tick != null) {
				System.out.println("대피 시작: " + tick.getVisitorName() + " 고객님은 즉시 직원의 안내에 따라 신속히 대피하세요.");

			}
		}				System.out.println();
    	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!즉시 대피 바람!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}