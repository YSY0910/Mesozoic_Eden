package dinosaur;

public class test5_7 {

	public static void main(String[] args) {
		int rows = 9;
		int cols = 5;
		
		String[][] Chair = new String[rows][cols];
		System.out.println("--------버스 좌석 현황--------");
		for(int i = 0; i < Chair.length; i++) {
			for(int j = 0; j < Chair[i].length; j++) {
				Chair[i][j] = "O";
				
				System.out.print(" " + Chair[i][j] + "    ");
			}
			System.out.println("");
		}

	}

}
