package InterfacePractice;

class Dinosaur implements Comparable<Dinosaur>{
	private String name;
	private int age;
	Dinosaur(String name, int age){
		this.name = name;
		this.age = age;
	}
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
	public int compareTo(Dinosaur aa) {
		if(this.age < aa.age) {
			return -1;
		}
		else if(this.age == aa.age) {
			return 0;
		}
		else {return 1;}
	}
	static void asd(Dinosaur[] dinosaurs) {
	    int size = dinosaurs.length;
	    for (int i = 0; i < size - 1; i++) {
	        for (int j = 0; j < size - i - 1; j++) {
	            if (dinosaurs[j].compareTo(dinosaurs[j + 1]) == 1) {
	                Dinosaur temp = dinosaurs[j];
	                dinosaurs[j] = dinosaurs[j + 1];
	                dinosaurs[j + 1] = temp;
	            }
	        }
	    }
	}
}


public class P4 {
	public static void main(String[]args) {
		 Dinosaur[] dinosaurs = {
	                new Dinosaur("dino1", 50),
	                new Dinosaur("dino2", 40),
	                new Dinosaur("dino3", 10),
	                new Dinosaur("dino4", 30),
	                new Dinosaur("dino5", 20)
	        };
		 System.out.println("Before");
		 for(Dinosaur dino : dinosaurs) {
			 System.out.println("Name: " + dino.getName() + ", " + dino.getAge());

		 }
		 Dinosaur.asd(dinosaurs);
		 System.out.println();
		 System.out.println("After");
		 for(Dinosaur dino : dinosaurs) {
			 System.out.println("Name: " + dino.getName() + ", " + dino.getAge());
		 }

	}
}
