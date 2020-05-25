package self.study.two.dimensional.array;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		int[][] twoDimArr = new int[256][2];
		
		twoDimArr[0][0] = 10;
		twoDimArr[0][1] = 20;

		System.out.println(twoDimArr.length); 
		
		for (int i = 0; i < twoDimArr.length; i++) {
			System.out.println(Arrays.toString(twoDimArr[i]));
		}
		
//		for (int[] row : twoDimArr) {
//			System.out.println(Arrays.toString(row));
//		}
		
//		for (int[] row : twoDimArr) {
//			if (row != null) {
//				for (int column : row) {
//					System.out.print(column + " ");
//				}
//			}
//			System.out.println();
//		}
	
        
	}

}
