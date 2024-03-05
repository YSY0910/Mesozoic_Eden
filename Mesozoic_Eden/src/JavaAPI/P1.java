package JavaAPI;
import java.time.LocalDate;

//공룡
class Dinosaur implements eatable{
	private String name;
	private int age;
	private String species;
	private LocalDate birthday;
	Dinosaur(String name, int age, String species, LocalDate birthday){
		this.name = name;
		this.age = age;
		this.species = species;
	}
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSpecies(){
		return species;
	}
	public void setName(String aName) {
		name = aName;
	}
	public void setAge(int aAge) {
		age = aAge;
	}
	public void setSpecies(String aSpecies) {
		species = aSpecies;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	String dinoType() {return "뭐";}
	public void eat() {System.out.println("뭘 먹지");}
}

interface eatable{
	void eat();
}

class CarnivoreDino extends Dinosaur implements eatable{
	CarnivoreDino(String name, int age, String species, LocalDate birthday){
		super(name, age, species, birthday);
	}
	String dinoType() {return "육식공룡";}
	@Override
	public void eat() {System.out.println("고기를 먹는다.");}

}
class HerbivorDino extends Dinosaur implements eatable{
	HerbivorDino(String name, int age, String species, LocalDate birthday){
		super(name, age, species, birthday);
	}
	String dinoType() {return "초식공룡";}
	@Override
	public void eat() {System.out.println("풀을 먹는다.");}
	
}
class AquaDino extends Dinosaur	implements eatable{
	AquaDino(String name, int age, String species, LocalDate birthday){
	super(name, age, species, birthday);
	}
	String dinoType() {return "바다공룡";}
	@Override
	public void eat() {System.out.println("물고기를 먹는다.");}

}
