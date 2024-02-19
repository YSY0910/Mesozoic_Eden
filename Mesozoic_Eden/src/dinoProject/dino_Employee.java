package dinoProject;

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
	public void setAge(int aAge) {
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
	public void setJobTitle(String aJobTitle) {
		jobTitle = aJobTitle;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int aAge) {
		age = aAge;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int aYearOfExperience) {
		yearOfExperience = aYearOfExperience;
	}
}

class Ticket{
	private int price;
	private String visitorName;
	private int visitDate;
	boolean VIP;
	
	Ticket(int price, String visitorName, int visitDate, boolean VIP){
		this.price = price;
		this.visitorName = visitorName;
		this.visitDate = visitDate;
		this.VIP = VIP;
		}
	public int getPrice() {
		return price;
	}
	public void setPrice(int aPrice) {
		price = aPrice;
	}
	public String getVisitorName() {
		return visitorName;
	}
	public void setVisitorName(String aVisitorName) {
		visitorName = aVisitorName;
	}
	public int getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(int aVisitDate) {
		visitDate = aVisitDate;
	}
	public boolean getVip() {
		return VIP;
	}
	public void setVip(boolean aVIP) {
		VIP = aVIP;
	}
}

class Food{
	private String name;
	private String nutritionalValue;
	private int cost;
	
	Food(String name, String nutritionalValue, int cost){
		this.name = name;
		this.nutritionalValue = nutritionalValue;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public String getNutritionalValue() {
		return nutritionalValue;
	}
	public void setNutritionalValue(String aNutritionalValue) {
		nutritionalValue = aNutritionalValue;
	}
	public int getcost() {
		return cost;
	}
	public void setCost(int aCost) {
		cost = aCost;
	}
}

class SafeTest{
	private double Safetyscore;
	private int SafetyHold = 7;
	
	public int getSafetyHold() {
		return SafetyHold;
	}

	public double getSafetyCheck() {
		return Safetyscore;
	}
	
	public void setSafetyScore(double aSafetyscore) {
		Safetyscore = aSafetyscore;
	}

	public void checkSafe() {
		if(Safetyscore > SafetyHold) {
			System.out.println("안전한 상태입니다.");
		}else System.out.println("주의가 필요합니다. 안전점검이 필요합니다.");
	}
}

