package self.study.two.dimensional.array;

import java.util.Arrays;

public class CountNegativeNum {

	public static void main(String[] args) {
		
		int[][] matrix = new int[2][2];
		
//		for (int i = 0; i < matrix.length; i++) {
//			System.out.println(Arrays.toString(matrix[i]));
//		}
		matrix[0][0] = 1;
		matrix[0][1] = -1;
		matrix[1][0] = -1;
		matrix[1][1] = -1;
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		int counter = 0; 
		for (int[] row : matrix) {
			if (row != null) {
				for (int column : row) {
					if (column < 0) {
						counter++; 
					}
					System.out.print(column + " ");
				}
			}
			
		}
		
		System.out.println("\ncounter " + counter);
		
	}
	
	

}
