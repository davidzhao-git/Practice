package self.study.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateNum {

	public static void main(String[] args) {
	
		// Set<Integer> set = new HashSet<>(); 
		Map<Integer, Integer> map = new HashMap<>();
		
		
		int[] arr = {10,20,30,11,10,22,23,23,31};
		for (int i : arr) {
			if (!map.containsKey(i)) {
				map.put(i, i);
			}
			else {
				System.out.println(i + " is duplicate");
			}
		}
	}
}
