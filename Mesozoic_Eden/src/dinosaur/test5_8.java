package dinosaur;

public class test5_8 {
	public static void main(String[]args) {
		String[][] dinoData = {
				{"dino1","dino2","dino3","dino4","dino5","dino6","dino7","dino8","dino9","dino10"},
				{"Triceratops","T-rex","Stegosaurus","Brachiosaurus","Velociraptor",
					"Allosaurus","Apatosaurus","Velociraptor","Ankylosaurus","Pteranodon",},
				{"5","8","9","10","6","4","4","8","9","10"},
				{"NO.1","NO.2","NO.3","NO.4","NO.5","NO.6","NO.7","NO.8","NO.9","NO.10"}
		};
		
		for(int i = 0; i < dinoData[0].length; i++) {
			System.out.println(dinoData[0][i] + " 공룡은");
			System.out.println(dinoData[1][i] + " 종이며");
			System.out.println(dinoData[2][i] + "살이고");
			System.out.println(dinoData[3][i] + " 우리에 살고 있다.");
			System.out.println();
		}
		
		int allAges = 0;
		double avrAges = 0;
		
		for(int i = 0; i < dinoData[2].length; i++) {
			allAges += i;
			avrAges = (allAges / 10);
		}
		
		int[] dinoWeight = {1500, 3500, 4500, 5500, 2500, 3000, 800, 1250, 2000, 700};
		int allWeight = 0;
		double avrWeight = 0;
		
		for(int i = 0; i < dinoWeight.length; i++) {
			allWeight += i;
			avrWeight = (allWeight / 10);
		}
		
		System.out.println("공룡들의 평균 나이는: " + avrAges + "살 이다.");
		System.out.println("공룡들의 평균 무게는: " + avrWeight + "kg 이다.");
	}
}
