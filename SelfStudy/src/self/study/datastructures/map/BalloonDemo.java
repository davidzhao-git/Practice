package self.study.datastructures.map;

import java.util.HashMap;
import java.util.Map;

public class BalloonDemo {

	public static void main(String[] args) {
	
		String balloon = "balloon";
		Map<Character, Integer> map = new HashMap<>(); 

		for (int i = 0; i < balloon.length(); i++) {
			char key = balloon.charAt(i);
			
			if (map.containsKey(key)) {
				int value = map.get(key);
				value++; 
				map.put(key, value);
			}
			else {
				map.put(key, 1);
			}
		}
	
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
//		String text = "loonbalxballpoon";
		String text = "leetcode";

		
		Map<Character, Integer> otherMap = new HashMap<>(); 

		for (int i = 0; i < text.length(); i++) {
			char key = text.charAt(i);
			if (otherMap.containsKey(key)) {
				int value = otherMap.get(key);
				value++; 
				otherMap.put(key, value);
			}
			else {
				otherMap.put(key, 1);
			}
		}
		
		System.out.println("Other Map");
		
		for (Map.Entry<Character, Integer> entry : otherMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		int temp = 0;
		int result = text.length(); 
		 
		for (int j = 0; j < balloon.length(); j++) {
			char ch = balloon.charAt(j); 
			if (otherMap.containsKey(ch)) {
				temp = otherMap.get(ch) / map.get(ch);
				System.out.println("print temp " + temp);
				result = Math.min(result, temp);
				
				
				
//				result = Math.min(otherMap.get(ch) / map.get(ch), temp);
				System.out.println("print result " + result);

			}
			
		}

	}

}
