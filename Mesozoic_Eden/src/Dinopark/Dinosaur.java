package Dinopark;

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