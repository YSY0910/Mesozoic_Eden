package dinoProject;
import java.util.*;

class Dinosaur{
	private String name;
	private int age;
	private String species;
	
	Dinosaur(String name, int age, String species){
		this.name = name;
		this.age = age;
		this.species = species;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String aSpecies) {
		species = aSpecies;
	}
	public int getAge() {
		return age;
	}
	public void SetAge(int aAge) {
		age = aAge;
	}
}

class Employee{
	private String name;
	private int age;
	private String jobTitle;
	private int yearOfExperience;
	
	Employee(String name, int age, String jobTitle, int yearOfExperience){
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.yearOfExperience = yearOfExperience;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setSpecies(String aJobTitle) {
		jobTitle = aJobTitle;
	}
	public int getAge() {
		return age;
	}
	public void SetAge(int aAge) {
		age = aAge;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void SetYearOfExperience(int aYearOfExperience) {
		age = aYearOfExperience;
	}
}

public class Main{
	boolean keepMenu = true;
	Scanner sc = new Scanner(System.in);
	List<Dinosaur> dinosaurs = new ArrayList<>();
	public static void main(String[]args) {
		Main main = new Main();
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
	        }else {System.out.println("오/탈자 주의해주세요.");}
	    } while (keepMenu);
	}
	
	public void exitProgram() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void addDinosaur() {
		if(dinosaurs.size() < 5) {
			System.out.println("공룡 정보를 등록합니다. ");
			System.out.println("공룡 이름은? ");
			String name = sc.next();
			System.out.println("공룡의 나이는? " );
			int age = sc.nextInt();
			System.out.println("공룡의 종은? ");
			String species  = sc.next();
			
			Dinosaur newDino = new Dinosaur(name, age, species);
			dinosaurs.add(newDino);
			
			System.out.println("공룡 등록 완료: ");
			
			for(Dinosaur dino : dinosaurs) {
				System.out.println("이름 : " + dino.getName());
				System.out.println("나이 : " + dino.getAge());
				System.out.println("종족 : " + dino.getSpecies());
				System.out.println();
		}
	}
		else System.out.println("최대 5마리 까지만 저장할 수 있습니다. ");
		
	}
	
	public void removeDinosaur() {
			System.out.println("삭제할 공룡의 이름은?: ");
			String ans = sc.next();
			
			Dinosaur dinosaurToRemove = null;
			for (Dinosaur dino : dinosaurs) {
				if(dino.getName().equals(ans)) {
					dinosaurToRemove = dino;
					break;
				}
			}
			if(dinosaurToRemove != null) {
				dinosaurs.remove(dinosaurToRemove);
					System.out.println(ans + "공룡 정보 삭제 완료.");
					System.out.println();
					for(Dinosaur dino : dinosaurs) {
						System.out.println("이름 : " + dino.getName());
						System.out.println("나이 : " + dino.getAge());
						System.out.println("종족 : " + dino.getSpecies());
						System.out.println();
				}
			}
			else {System.out.println(ans + "라는 공룡은 없습니다.");}
	}
	public void displayMenu() {
		System.out.println("Welcome to Mesozoic Eden Park Manager!");
		System.out.println("1. Manage Dinosaurs");
		System.out.println("2. Manage Park Employees");
		System.out.println("3. Manage Tickets");
		System.out.println("4. Check Park Status");
		System.out.println("5. Handle Special Events");
		System.out.println("6. Exit");
		System.out.print("Enter your choice: ");
	}
	
	public void handleMenuChoice(int choice) {
		switch (choice) {
		case 1:
			System.out.println("공룡을 등록? 삭제?: ");
			String ans = sc.next();
			if (ans.equals("등록")) {
				addDinosaur();
			}
			else if (ans.equals("삭제")){
				removeDinosaur();
			}
			else {System.out.println("오/탈자를 주의해주세요.");}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			System.out.println("Exiting...");
			System.exit(0);
		}
	}
}
