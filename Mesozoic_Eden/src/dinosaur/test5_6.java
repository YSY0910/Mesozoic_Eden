package dinosaur;

public class test5_6 {

	public static void main(String[] args) {
		String[][] parkMap = {{"대형공룡","육식공룡","익룡", "보안실"},{"초식공룡","포유류","수상공룡1","수상공룡2"},{"부화장","정문","안내소","스낵바"}};
	
		for(int i = 0; i < parkMap.length; i++) {
			for(int j = 0; j < parkMap[i].length; j++) {
				System.out.print(parkMap[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
