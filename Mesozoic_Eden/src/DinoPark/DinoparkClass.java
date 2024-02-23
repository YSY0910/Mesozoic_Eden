package DinoPark;

//공룡
class Dinosaur{ // 모든 공룡이 있는 우리는 보안등급을 1~3까지 표시할 것.
	private String name;
	private int age;
	private String size;
	private String species;
	private String house;
	private String diet;
	Dinosaur(String name, int age, String size, String species, String house, String diet){
		this.name = name;
		this.age = age;
		this.size = size;
		this.species = species;
		this.house = house;
		this.diet = diet;
	}
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSize() {
		return size;
	}
	public String getSpecies(){
		return species;
	}
	public String getHouse(){
		return house;
	}
	public String getDiet(){
		return diet;
	}
	public void setName(String aName) {
		name = aName;
	}
	public void setAge(int aAge) {
		age = aAge;
	}
	public void setSize(String aSize) {
		size = aSize;
	}
	public void setSpecies(String aSpecies) {
		species = aSpecies;
	}
	public void setHouse(String aHouse) {
		house = aHouse;
	}
	public void setDiet(String aDiet) {
		diet = aDiet;
	}
}
class LandDino extends Dinosaur{
	private int tailSize;
	LandDino(String name, int age, String size, String species, String house, String diet, int tailSize){
		super(name, age, size, species, house, diet);
		this.tailSize = tailSize;
	}
	public int getTailSize() {
		return tailSize;
	}
	public void setTailSize(int aTailSize) {
		tailSize = aTailSize;
	}
}
class FlyDino extends Dinosaur{
	private int wingSize;
	FlyDino(String name, int age, String size, String species, String house, String diet, int wingSize){
		super(name, age, size, species, house, diet);
		this.wingSize = wingSize;
	}
	public int getWingSize() {
		return wingSize;
	}
	public void setWingSize(int aWingSize) {
		wingSize = aWingSize;
	}
}
class AquaDino extends Dinosaur{
	private int finSize;
	AquaDino(String name, int age, String size, String species, String house, String diet, int finSize){
		super(name, age, size, species, house, diet);
		this.finSize = finSize;
	}
	public int getFinSize() {
		return finSize;
	}
	public void setFinSize(int aFinSize) {
		finSize = aFinSize;
	}
}

//직원
class ParkStaff{
	private String name;
	private int age;
	ParkStaff(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String aName) {
		name = aName;
	}
	public void setAge(int aAge) {
		age = aAge;
	}
}
class Security extends ParkStaff{ // 보안 경비
	private String position;
	private int yearOfWork;
	Security(String name, int age, String position, int yearOfWork){
		super(name, age);
		this.position = position;
		this.yearOfWork = yearOfWork;
	}
	public String getPosition() {
		return position;
	}
	public int getYearOfWork() {
		return yearOfWork;
	}
	public void setPosition(String aPosition) {
		position = aPosition;
	}
	public void setYearOfWork(int aYearOfWork) {
		yearOfWork = aYearOfWork;
	}
}

class Veterinarians extends ParkStaff{ // 수의사
	private String position;
	private int yearOfWork;
	Veterinarians(String name, int age, String position, int yearOfWork){
		super(name, age);
		this.position = position;
		this.yearOfWork = yearOfWork;
	}
	public String getPosition() {
		return position;
	}
	public int getYearOfWork() {
		return yearOfWork;
	}
	public void setPosition(String aPosition) {
		position = aPosition;
	}
	public void setYearOfWork(int aYearOfWork) {
		yearOfWork = aYearOfWork;
	}
}
class Guide extends ParkStaff{ // 안내원
	private String position;
	private int yearOfWork;
	Guide(String name, int age, String position, int yearOfWork){
		super(name, age);
		this.position = position;
		this.yearOfWork = yearOfWork;
	}
	public String getPosition() {
		return position;
	}
	public int getYearOfWork() {
		return yearOfWork;
	}
	public void setPosition(String aPosition) {
		position = aPosition;
	}
	public void setYearOfWork(int aYearOfWork) {
		yearOfWork = aYearOfWork;
	}
}
//티켓
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

class SeasonTicket extends Ticket{
	private int startDate;
	private int endDate;
	SeasonTicket(int price, String visitorName, int visitDate, boolean VIP, int startDate, int endDate){
		super(price, visitorName, visitDate, VIP);
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getStartDate() {
		return startDate;
	}
	public int getEndDate() {
		return endDate;
	}
	public void setStartDate(int aStartDate) {
		startDate = aStartDate;
	}
	public void setEndDate(int aEndDate) {
		endDate = aEndDate;
	}
}

class SafeTest{ // 간단 안전 테스트
	private double Safetyscore;
	private int SafetyHold = 7; // 불변값.
	
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

