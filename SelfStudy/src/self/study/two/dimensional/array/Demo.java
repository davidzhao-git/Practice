package self.study.two.dimensional.array;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		// 3 rows, 2 columns 
		int[][] twoDimArr = new int[3][2];
		
		twoDimArr[0][0] = 10;
		twoDimArr[0][1] = 20;
		twoDimArr[1][0] = 30;

		System.out.println("length " + twoDimArr.length); 

		for (int i = 0; i < twoDimArr.length; i++) {
			System.out.println(Arrays.toString(twoDimArr[i]));
		}
		
	
		
		
		int target = 10;
		for (int i = 0; i < twoDimArr.length; i++) {
			System.out.println("Row...");
			int length = twoDimArr[i].length;
			for (int j = 0; j < twoDimArr[i].length; j++) {
				if (target >= twoDimArr[i][0] && target <= twoDimArr[i][length-1]) {
					int k = j;
					for (int index = 0; index <= k; index++) {
						if (target == twoDimArr[i][index]) {
							System.out.println("TRUE"); 
						}
					}
				}
				else if (i < twoDimArr.length-1 && target >= twoDimArr[i+1][0]) {
					continue; 
				}
				
				
				System.out.print(twoDimArr[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("\nPrinting in a different format"); 

		for (int[] row : twoDimArr) {
			System.out.println(Arrays.toString(row));
		}
		
		System.out.println("Printing in a different format"); 

		for (int[] row : twoDimArr) {
			if (row != null) {
				for (int column : row) {
					System.out.print(column + " ");
				}
			}
			System.out.println();
		}
		
	}
}
