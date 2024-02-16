package dinosaur;

enum ParkType{
	OPEN, CLOSE
}

class Park{
	private Dinosaur[] dinosaur = new Dinosaur[5];
	private Employee[] employee = new Employee[5];
	private ParkType parkStatus = ParkType.OPEN;
	
	public ParkType getParkStatus() {
		return parkStatus;
	}
	public void setParkStatus(ParkType parkStatus) {
	        this.parkStatus = parkStatus;
	}
	 
    public void openPark() {
        setParkStatus(ParkType.OPEN);
        System.out.println("공원이 열렸습니다.");
    }

    public void closePark() {
        setParkStatus(ParkType.CLOSE);
        System.out.println("공원이 닫혔습니다.");
    }
    
    
	public void addDinosaur(String name, int age, String species) {
		Dinosaur newDinosaur = new Dinosaur(name, age, species);
		
		for(int i = 0; i < dinosaur.length; i++) {
			if(dinosaur[i] == null) {
				dinosaur[i] = newDinosaur;
				System.out.println(newDinosaur.getName() + "이(가) 등록 되었습니다.");
				return;
			}
		}
		System.out.println("더 이상 공룡을 추가 할 수 없습니다. 배열에 남은 공간이 없습니다.");
	}
	
	public void removeDinosaur(String name) {
		for(int i = 0; i < dinosaur.length; i++) {
			if(dinosaur[i] != null && dinosaur[i].getName().equals(name)) {
			System.out.println(dinosaur[i].getName() + "이(가) 공원에서 제거되었습니다.");
			dinosaur[i] = null;
            return;
			}
		}	System.out.println(name + "이(가) 공원에 존재하지 않습니다.");
	}
	
	public void addEmployee(String name, int age, String jobTitle, int yearOfExperience) {
		Employee newEmployee = new Employee(name, age, jobTitle, yearOfExperience);
		
		for(int i = 0; i < employee.length; i++) {
			if(employee[i] == null){
				employee[i] = newEmployee;
				System.out.println(newEmployee.getName() + " 직원이 등록 되었습니다.");
				return;
			}
		}
		System.out.println("더 이상 직원을 추가 할 수 없습니다. 배열에 남은 공간이 없습니다.");
	}
	
	public void removeEmployee(String name) {
		for(int i = 0; i < employee.length; i++) {
			if(employee[i] != null && employee[i].getName().equals(name)) {
			System.out.println(employee[i].getName() + " 직원을 제외합니다.");
			employee[i] = null;
            return;
			}
		}	System.out.println(name + " 직원은 존재하지 않습니다.");
	}
}


public class test7_2 {
	public static void main(String[]args) {
		
		Park park = new Park();
		
		park.closePark();
		System.out.println();
		park.addDinosaur("티라노", 10, "티라노사우루스");
		park.addDinosaur("티노", 10, "알로사우루스");
		System.out.println();
		park.addEmployee("이스마엘", 30, "보안팀장", 10);
		park.addEmployee("파우스트", 28, "보안팀원", 7);
		System.out.println();
		park.removeDinosaur("티노");
		park.removeEmployee("파우스트");
		System.out.println();
		park.openPark();
		
	}
}
