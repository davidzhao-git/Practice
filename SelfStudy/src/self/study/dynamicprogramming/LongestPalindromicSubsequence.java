package self.study.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubsequence {

	public static void main(String[] args) {

		String str = "ABBDCACB";
		int length = str.length();
		
		System.out.println("The length is " + longestPalindrome(str, 0, length-1));

	}
	
	public static int longestPalindrome(String str, int start, int end) {
		
		// base case 
		if (start > end) {
			return 0;
		}
		
		// the string only has one character
		if (start == end) {
			return 1; 
		}
		
		// create an unique map key 
		String key = start + "|" + end; 
		Map<String, Integer> lookup = new HashMap<>(); 
		
		if (!lookup.containsKey(key)) {
			
			if (str.charAt(start) == str.charAt(end)) {
				lookup.put(key, longestPalindrome(str, start+1, end-1) + 2);
			}
			else {
				/* if the last character is different from the first character

				1. Remove last char & recur for the remaining substring X[i, j-1]
				2. Remove first char & recur for the remaining substring X[i+1, j]
				3. Return maximum of the two values */
				
				lookup.put(key, Integer.max(longestPalindrome(str, start, end-1),
											longestPalindrome(str, start+1, end)));
			}
		}
		return lookup.get(key);
	}
}
