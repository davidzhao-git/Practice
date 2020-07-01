package self.study.dynamicprogramming;

public class Fibonacci {
	
	public static void main(String[] args) {
		int num = 0;  	
		int num1 = 6; 
		System.out.println(result(num));
		System.out.println(result(num1));
	}
	
	public static int result(int num) {
		// The Fibonacci numbers are the numbers in the following integer sequence.
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
		int[] numArr = new int[num + 2];
		numArr[0] = 0; 
		numArr[1] = 1; 
		for (int i = 2; i < numArr.length; i++) {
			numArr[i] = numArr[i-1] + numArr[i-2]; 
		}
		return numArr[num];
	}
}
