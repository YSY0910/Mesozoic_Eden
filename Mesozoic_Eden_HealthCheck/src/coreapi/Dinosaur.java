package coreapi;

public class Dinosaur {
	private String name;
	private int age;
	private String species;
	private String healthstatus;
	
	public Dinosaur(String name, int age, String species, String healthstatus){
		this.name = name;
		this.age = age;
		this.species = species;
		this.healthstatus = healthstatus;
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
		public String getHealthstatus() {
			return healthstatus;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setSpecies(String species) {
			this.species = species;
		}
		public void setHealthstatus(String healthstatus) {
			this.healthstatus = healthstatus;
		}
}

