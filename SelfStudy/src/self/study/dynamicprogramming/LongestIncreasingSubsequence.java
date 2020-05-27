package self.study.dynamicprogramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	
	public static void main(String[] args) {
		
		int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };

		int[] arrTest = { 1, -1, 15, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 33, 11, 7, 25 };
		System.out.println("Length of Longest Increasing Subsequence is " + longestIncreSeq(arr));
		
		System.out.println("Testing... Find the largest number in an array");
		System.out.println(Arrays.stream(arrTest).max().getAsInt());

	}
	
	public static int longestIncreSeq(int[] arr) {
		
		// create an array to store sub-problem solution 
		int[] subArr = new int[arr.length];
		
		// longest increasing sub-sequence ending with arr[0] has length 1 
		subArr[0] = 1; 
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && subArr[j] > subArr[i]) {
					subArr[i] = subArr[j]; 
				}
			}
			subArr[i]++; 
		}
		
		return Arrays.stream(subArr).max().getAsInt();
	}

}
