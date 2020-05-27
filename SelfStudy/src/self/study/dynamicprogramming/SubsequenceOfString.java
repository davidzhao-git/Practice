package self.study.dynamicprogramming;

public class SubsequenceOfString {

	public static void main(String[] args) {
	
		
		boolean result1 = isSubsequence("ace", "abcde");
		System.out.println(result1);
		
		boolean result2 = isSubsequence("aec", "abcde");
		System.out.println(result2);

	}

	public static boolean isSubsequence(String s, String t) {

		int subStringSize = s.length();
		int stringSize = t.length();
		
		// if the sub string is an empty string
		// it is still a sub-sequence 
		if (subStringSize == 0 || (subStringSize == 0 && stringSize == 0)) {
			return true;
		}

		if (subStringSize > stringSize) {
			return false;
		}

		int j = 0;
		for (int i = 0; i < stringSize; i++) {
			if (s.charAt(j) == t.charAt(i)) {
				j++;
			}
			if (j == subStringSize) {
				return true;
			}
		}
		return false;

	}

}
