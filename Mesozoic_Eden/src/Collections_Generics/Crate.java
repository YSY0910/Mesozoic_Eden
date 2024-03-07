package Collections_Generics;

import java.util.ArrayList;
import java.util.List;

class Jeep{
	String name;
	int seat;
	Jeep(String name, int seat){
		this.name = name;
		this.seat = seat;
	}
	public String getName() {
		return name;
	}
	public int getSeat() {
		return seat;
	}
	@Override public String toString() {
		return "지프 이름- " + name + " 탑승정원- " + seat;
	}
}

class DinosaurFood{
	String name;
	int price;
	DinosaurFood(String name, int price){
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override public String toString() {
		return "먹이- " + name + " 가격- " + price;
	}
}
    
public class Crate<T> {
	
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
		}
	
	void remove(T item) {
		list.remove(item);
	}
	T get(int i) {
		return list.get(i);
		}
	
	ArrayList<T> getList(){
		return list;
		}
	
	int size() {
		return list.size();
		}
	
	public String toString() {
		return list.toString();
		}
	
	public static void main(String[]args) {
		
		Crate<Dinosaur> dino = new Crate<Dinosaur>();
		Dinosaur dino1 = new Dinosaur("Tno", 25, "Trex");
		Dinosaur dino2 = new Dinosaur("Ste", 33, "Sted");
		Dinosaur dino3 = new Dinosaur("Zeo", 33, "Zeor");
		dino.add(dino1); dino.add(dino2); dino.add(dino3);
		
		Crate<Jeep> jeep = new Crate<Jeep>();
		Jeep jeep1 = new Jeep("단단한", 6);
		Jeep jeep2 = new Jeep("빠른", 2);
		Jeep jeep3 = new Jeep("많은", 12);
		jeep.add(jeep1); jeep.add(jeep2); jeep.add(jeep3);
		
		Crate<DinosaurFood> food = new Crate<DinosaurFood>();
		DinosaurFood food1 = new DinosaurFood("고기", 10000);
		DinosaurFood food2 = new DinosaurFood("물고기", 8000);
		DinosaurFood food3 = new DinosaurFood("풀", 5000);
		food.add(food1); food.add(food2); food.add(food3);
		
		System.out.println(dino);
		System.out.println(jeep);
		System.out.println(food);

	}
}
