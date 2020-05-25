package self.study.stringchar.ascii;

public class App {

	public static void main(String[] args) {
		
		String str = "326#";

//		char ch = str.charAt(0);
//		System.out.println(ch);
//		System.out.println(Integer.valueOf(ch));
//		int i = 'a' - '1' + Integer.valueOf(ch);
//		System.out.println(i);
//		
//		
		String subStr = str.substring(1, 3);
//		System.out.println(subStr);
		System.out.println(Integer.valueOf("8"));
		System.out.println(Integer.valueOf('8'));
//		System.out.println(Integer.valueOf(subStr));
//	
//		char k = (char) (('a' + Integer.valueOf(subStr)) - 1);
//		System.out.println(k);

		
		
		/*
		int len = s.length();
        String res = "";
        int i=0;
        while(i < len){
            if(i+2 < len && s.charAt(i+2)=='#'){
                res += String.valueOf((char)('a' + Integer.valueOf(s.substring(i,i+2))- 1));
                i = i + 3;
            }else{
                res += String.valueOf((char)('a' + Integer.valueOf(s.charAt(i))- '1'));
                i++;
            }
            System.out.println(res);
        }
        return res;
        
        */
		
		
		String[] strArr = {"aba", "aaaiube", "anvz", "arkh"};
//		System.out.println(strArr.length);
//		
//		System.out.println(strArr[0].length());
		
		int[] countArray = new int[26];
		for (int i = 0; i < strArr[0].length(); i++) {
			char ch = strArr[0].charAt(i);
			int num = ch - 'a';
			
			++countArray[num];
			System.out.println(num + " " + countArray[num]);
		}
		
		System.out.println('l'-'a'); 

	}

}
