package dinosaur;

class Food{
	private String name;
	private String nutritionalValue;
	private int cost;
	
	Food(String name, String nutritionalValue, int cost){
		this.name = name;
		this.nutritionalValue = nutritionalValue;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public String getNutritionalValue() {
		return nutritionalValue;
	}
	public void setNutritionalValue(String aNutritionalValue) {
		nutritionalValue = aNutritionalValue;
	}
	public int getcost() {
		return cost;
	}
	public void setCost(int aCost) {
		cost = aCost;
	}
}

