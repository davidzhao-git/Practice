package self.study.strings;

public class StringBuilderApp {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "There";
		char charArr[] = {'a', 'b', 'c'};
		
		System.out.println("String Builder...");

		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb.append(str2);
		System.out.println(sb.toString());
		
		sb.append(charArr);
		System.out.println(sb.toString());
		
		System.out.println("\nString Buffer...");
        StringBuffer strBuffer = new StringBuffer(); 
        strBuffer.append(str1);
        strBuffer.append(str2);
        System.out.println(strBuffer.toString());
        strBuffer.append(charArr);
		System.out.println(strBuffer.toString());
        
        

	}

}
