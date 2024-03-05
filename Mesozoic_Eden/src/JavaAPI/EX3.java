package JavaAPI;
import java.util.*;

final class EX3{
	
	private final String name;    //String is immitable.
	private final int numAnimals;
	private final List<String> animals; //mutable
	private EX3(final String name, final int numAnimals, final List<String> animals) {
		this.name  = name;
		this.numAnimals = numAnimals;
		this.animals = new ArrayList<String>(animals);
	}
	public static EX3 createNewInsatnce(String name, int numAnimals, List<String> animals) {
		return new EX3(name, numAnimals, animals);
	}
	public String getName() {return this.name;}
	public int getNumAnimals() {return this.numAnimals;}
	public List<String> getAnimals(){
		return new ArrayList<String>(animals); //return a new object.
	}
	@Override public String toString() {
		return "Farm{" + "name=" + name + ", numAnimals=" + numAnimals + ", animals=" + animals + "}";
	}
	
	public static void main(String[]args) {
		List<String>animals = Arrays.asList("Cow", "Chicken", "Sheep", "Dog", "Cat", "Duck");
	
		EX3 farm = EX3.createNewInsatnce("YSY", animals.size(), animals);
		
		System.out.println(farm);
	}
	
}