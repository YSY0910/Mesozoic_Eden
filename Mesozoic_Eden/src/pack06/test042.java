package pack06;

class Adult{
	private String name;
	
	private int age;
	
	Adult(String name, int age){
		if(isAgeOk(age)) {
		this.name = name;
		this.age = age;
		}
		else {
			this.name = "Error";
			this.age = 0;
			}
}
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name = name;
		}
	public int getAge() {
		return age;
		}
	public void setAge(int age) {
		this.age = age;
		}
	private boolean isAgeOk(int age) {
        return age >=18 ? true : false; //    ternary operator
    }


}

	public class test042{
		public static void main(String[]args) {
			Adult John = new Adult("John", 21);
			Adult Jully = new Adult("Jully", 22);
			Adult Alice = new Adult("Alice", 23);
			Adult Rony = new Adult("Rony", 24);
			Adult Talie = new Adult("Talie", 25);
			Adult Luna = new Adult("Luna", 17);
			//System.out.println(john.getName()+ " " + john.getAge());
			//john.age = 50; // age는 private라 여기서 설정이 불가능함.
			//john.setAge(50);
			//System.out.println(john.getName()+ " " + john.getAge());
			
			
			//Try 01
			//배열 초기화 Adult
			Adult[] adult = new Adult[6];
			int[] ages =  new int[6];
			
			//배열에 객체 값 넣기.
			adult[0] = John;
			adult[1] = Jully;
			adult[2] = Alice;
			adult[3] = Rony;
			adult[4] = Talie;
			adult[5] = Luna;
			
			for(int i = 0; i < adult.length; i++) {
				System.out.println(adult[i].getName() + ", " + adult[i].getAge() + "세");
			}
			System.out.println();
			
			//Try 02
			Adult[] adult1 = {John, Jully, Alice, Rony, Talie, Luna};
			
			for(int i = 0; i < adult1.length; i++) {
				System.out.println(adult1[i].getName() + ", " + adult1[i].getAge() + "세");
			}
			
		}
	}