package Collections_Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Dinosaur implements eatable{
	private String name;
	private int age;
	private String species;
	Dinosaur(String name, int age, String species){
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
	String dinoType() {return "뭐냐";}
	public void eat() {System.out.println("뭘 먹지");}
	@Override public String toString() {
		return "이름: " + this.name + " " + "나이: " + this.age + " 종족: " + this.species;} // 이름, 나이, 종족을 출력함.
	@Override public int hashCode() {return Objects.hash(name, age, species);}
}

interface eatable{
	void eat();
}

class CarnivoreDino extends Dinosaur implements eatable{
	CarnivoreDino(String name, int age, String species){
		super(name, age, species);
	}
	String dinoType() {return "육식공룡";}
	@Override
	public void eat() {System.out.println("고기를 먹는다.");}

}
class HerbivorDino extends Dinosaur implements eatable{
	HerbivorDino(String name, int age, String species){
		super(name, age, species);
	}
	String dinoType() {return "초식공룡";}
	@Override
	public void eat() {System.out.println("풀을 먹는다.");}
	
}
class AquaDino extends Dinosaur	implements eatable{
	AquaDino(String name, int age, String species){
	super(name, age, species);
	}
	String dinoType() {return "바다공룡";}
	@Override
	public void eat() {System.out.println("물고기를 먹는다.");}

}

class DinosaurPark{
	private List<Dinosaur> dinosaurList;
	
	public DinosaurPark() {
		dinosaurList = new ArrayList<>();
	}
	
	public void addDinosaur(Dinosaur dinosaur) {
		dinosaurList.add(dinosaur);
	}
	public List<Dinosaur> getDinosaurList(){
		return dinosaurList;
	}
}

class PriorityQueue implements Comparable <PriorityQueue>{
	private String name;
	private int dangerLevel;
	
	public PriorityQueue(String name, int dangerLevel) {
		this.name = name;
		this.dangerLevel = dangerLevel;
	}
	public String getName() {
		return name;
	}
	public int getDangerLevel() {
		return dangerLevel;
	}
	@Override
	public String toString() {
		return "이름: " + name + " 레벨: " + dangerLevel; 
	}
	@Override
	public int compareTo(PriorityQueue other) {
		return Integer.compare(this.dangerLevel, other.dangerLevel);
	}
	
}

public class P3 {

	public static void main(String[] args) {
		
		// 공룡의 이름과 위험 레벨을 저장
		List<PriorityQueue> dinoLevel = new ArrayList<>();
		dinoLevel.add(new PriorityQueue("브라키오", 8));
		dinoLevel.add(new PriorityQueue("티라노", 10));
		dinoLevel.add(new PriorityQueue("스테고", 6));
		dinoLevel.add(new PriorityQueue("프테", 4));
		// Person에 대한 생성자가 없어서 오류가 발생함. 클래스 생성 필요.
		
		Collections.sort(dinoLevel); //위험 레벨이 작은 순서로 정렬 되어 출력
		
		for(PriorityQueue dino : dinoLevel) {
			System.out.println(dino.getName() + " " + dino.getDangerLevel());
		}
		
		List<Dinosaur> dinos = new ArrayList<>();
		dinos.add(new Dinosaur("티라노" , 25, "티라노사우루스"));
		
		
		
	}

}
		

//		DinosaurPark dinosaurPark = new DinosaurPark();
//		
//		HerbivorDino Herbi1 = new HerbivorDino("스테고",35, "스테고사우루스");
//		CarnivoreDino Carni1 = new CarnivoreDino("티노", 41, "티라노사우루스");
//		AquaDino Aqua1 = new AquaDino("모사",35, "T-REX");
//
//		dinosaurPark.addDinosaur(Herbi1);
//		dinosaurPark.addDinosaur(Carni1);
//		dinosaurPark.addDinosaur(Aqua1);
//		
//		List<Dinosaur> dinoPark = dinosaurPark.getDinosaurList();
//		
//		for(Dinosaur dinosaur : dinoPark) {
//			System.out.println("타입: " + dinosaur.dinoType());
//			System.out.println(dinosaur);
//			dinosaur.eat();
//			System.out.println();
//		}
