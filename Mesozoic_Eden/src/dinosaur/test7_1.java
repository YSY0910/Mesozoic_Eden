package dinosaur;
//1번 클래스 생성
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

//2번 클래스 생성
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

public class test7_1{
	public static void main(String[]args) {
		
		Dinosaur dino1 = new Dinosaur("티노", 8, "티라노사우루스");
		Dinosaur dino2 = new Dinosaur("스테", 15, "스테고사우루스");
		Dinosaur dino3 = new Dinosaur("케찰", 20, "케찰코아틀");
		Dinosaur dino4 = new Dinosaur("기로", 11, "안길로사우루스");
		Dinosaur dino5 = new Dinosaur("알루", 6, "알로사우루스");
		
		Employee E001 = new Employee("이스마엘", 30, "보안팀장", 10);
		Employee E002 = new Employee("로쟈", 30, "보안팀원", 5);
		Employee E003 = new Employee("파우스트", 30, "보안팀원", 8);
		Employee E004 = new Employee("료슈", 30, "보안팀원", 3);
		Employee E005 = new Employee("오티스", 30, "보안팀원", 6);
		
		Dinosaur[] dinos = {dino1, dino2, dino3, dino4, dino5};
		Employee[] workers = {E001, E002, E003, E004, E005};
		
		for(int i = 0; i < dinos.length; i++) {
			System.out.println(dinos[i].getName() + ", " + dinos[i].getAge() + ", " + dinos[i].getSpecies());

		}System.out.println();
		for(int i = 0; i < workers.length; i++) {
			System.out.println(workers[i].getName() + ", " + workers[i].getAge() + ", " + workers[i].getJobTitle() + ", " + workers[i].getYearOfExperience());
		}

}
}