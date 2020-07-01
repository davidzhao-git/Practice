package self.study.strings;

public class ConvertNum {

	public static void main(String[] args) {

		String num1 = "100";
		String num2 = "200";
		String str = addStrings(num1, num2);
		System.out.println(str);
	}

	public static String addStrings(String num1, String num2) {

//		int convertNum1 = Integer.parseInt(num1);
//		int convertNum2 = Integer.parseInt(num2);
//
//		int sum = convertNum1 + convertNum2;
//		return String.valueOf(sum);
		
		for (int i = 0; i < num1.length(); i++) {
			char c = num1.charAt(i);
			int num = c - '0';
			System.out.println(num);
		}
		
		return null;

	}
	
//	public static int doS(String str) {
//		try {
//			int i = Integer.parseInt(str);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		return i;
//	}
}
