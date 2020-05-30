package self.study.two.dimensional.array;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {

	public static void main(String[] args) {
	
		int[][] matrix = new int[3][4];
		matrix[0][0] = 1;
		matrix[0][1] = 10;
		matrix[0][2] = 4;
		matrix[0][3] = 2;
		
		matrix[1][0] = 9;
		matrix[1][1] = 3;
		matrix[1][2] = 8;
		matrix[1][3] = 7;
		
		matrix[2][0] = 15;
		matrix[2][1] = 16;
		matrix[2][2] = 17;
		matrix[2][3] = 12;
		
//		System.out.println("Matrix Length: " + matrix.length);
		
		List<Integer> result = luckyNumbers(matrix);
		

	}

	public static List<Integer> luckyNumbers(int[][] matrix) {

		List<Integer> list = new ArrayList<>();

		int min = 0;
		int minIndex = 0;
		for (int i = 0; i < matrix.length; i++) {
			min = matrix[i][0];
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					minIndex = j;
				}
			}
			System.out.println("print min: " + min);
			
			for (int k = 0; k < matrix.length; k++) {
				System.out.println("print k: " + k);
				if ((k == (matrix.length - 1)) && min >= matrix[k][minIndex]) {
					System.out.println("print k inside: " + k);
					list.add(min);
				} 			
				else if (min < matrix[k][minIndex]) {
					// if min is not the max number for that column
					break;
				}
			}
		}

		return list;

	}

}
