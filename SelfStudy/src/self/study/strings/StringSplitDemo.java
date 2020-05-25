package self.study.strings;

public class StringSplitDemo {

	public static void main(String[] args) {
		
		String str = "loveleetcode";
		String[] arr = str.split("e");
		for (String element : arr) {
			System.out.println(element);
		}

	}

}
