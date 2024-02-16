package pack06;

class Tag{}

public class test044 {

	Tag tag;
	String country;
	
	public static void main(String[] args) {
		test044 test0441 = new test044();
		test044 test0442 = test0441;
		test0442.tagAnimal(test0441);
	}
	void tagAnimal(test044 test044) {
		tag = new Tag();
		test044.setCountry("France");
	}
	void setCountry(String country) {
		this.country = country;
	

	}
}
