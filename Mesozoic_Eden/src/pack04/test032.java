package pack04;

public class test032 {

	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
		  
		for(int i = matrix.length - 1;  i >= 0; i--) {
			for(int j = matrix[i].length - 1; j >= 0; j--) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}