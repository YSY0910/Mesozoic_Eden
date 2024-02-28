package Dinopark;

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