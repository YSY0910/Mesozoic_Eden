package dinoClass;
// 공룡
class Dinosaur{ // 모든 공룡이 있는 우리는 보안등급을 1~3까지 표시할 것.
	private String name;
	private int age;
	Dinosaur(String name, int age){
		this.name = name;
		this.age = age;
	}@Override public String toString() {return "공룡 정보 => 이름: " + name + ", 나이: " + age + ", ";}
}
class WalkingDino extends Dinosaur{
	private String species;
	private String House;
	private String diet;
	WalkingDino(String name, int age, String species,String House, String diet){
		super(name, age);
		this.species = species;
		this.House = House;
		this.diet = diet;
	}@Override public String toString() {return super.toString() + "종족: " + species + ", 거주지: " + House + ", 식성: " + diet;}
}
class FlyingDino extends Dinosaur{
	private String species;
	private String House;
	private String diet;
	FlyingDino(String name, int age, String species,String House, String diet){
		super(name, age);
		this.species = species;
		this.House = House;
		this.diet = diet;
	}@Override public String toString() {return super.toString() + "종족: " + species + ", 거주지: " + House + ", 식성: " + diet;}
}
class AquaDino extends Dinosaur{
	private String species;
	private String House;
	private String diet;
	AquaDino(String name, int age, String species,String House, String diet){
		super(name, age);
		this.species = species;
		this.House = House;
		this.diet = diet;
	}@Override public String toString() {return super.toString() + "종족: " + species + ", 거주지: " + House + ", 식성: " + diet;}
}

// 직원
class ParkStaff{
	private String name;
	private int age;
	ParkStaff(String name, int age){
		this.name = name;
		this.age = age;
	}@Override public String toString() {return "직원 정보-> 이름: " + name + " 나이:" + age;}
}

class Security extends ParkStaff{
	private String Position;
	private int YearOfWork;
	private int SafeHold;
	Security(String name, int age, String Position, int YearOfWork){
		super(name, age);
		this.Position = Position;
		this.YearOfWork = YearOfWork;
		this.SafeHold = 3; //연습5
	}@Override public String toString() {return super.toString() + " 직위: " + Position + " 경력: " + YearOfWork + " 안전 등급: " + SafeHold;}
	public boolean canWorkinCage(int cageSafetyLevel) {// 연습5, 직원의 보안 등급과 우리의 안전 등급을 비교
		return this.SafeHold >= cageSafetyLevel;
	}
}
class Veterinarians extends ParkStaff{
	private String Position;
	private int YearOfWork;
	private int SafeHold;
	Veterinarians(String name, int age, String Position, int YearOfWork){
		super(name, age);
		this.Position = Position;
		this.YearOfWork = YearOfWork;
		this.SafeHold = 2;
	}@Override public String toString() {return super.toString() + " 직위: " + Position + " 경력: " + YearOfWork + " 안전 등급: " + SafeHold;}
	public boolean canWorkinCage(int cageSafetyLevel) {// 연습5, 직원의 보안 등급과 우리의 안전 등급을 비교
		return this.SafeHold >= cageSafetyLevel;
	}
}
class Guide extends ParkStaff{
	private String Position;
	private int YearOfWork;
	private int SafeHold;
	Guide(String name, int age, String Position, int YearOfWork){
		super(name, age);
		this.Position = Position;
		this.YearOfWork = YearOfWork;
		this.SafeHold = 1;
	}@Override public String toString() {return super.toString() + " 직위: " + Position + " 경력: " + YearOfWork + " 안전 등급: " + SafeHold;}
	public boolean canWorkinCage(int cageSafetyLevel) {// 연습5, 직원의 보안 등급과 우리의 안전 등급을 비교
		return this.SafeHold >= cageSafetyLevel;
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

//연습6
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



