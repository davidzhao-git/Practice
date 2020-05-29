package self.study.datastructures.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

//		int[] arr = {1,2,2,1,1,3};
		int[] arr = {1,2};
//		int[] arr = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int value = map.get(arr[i]);
				value++;
				map.put(arr[i], value);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		Set<Integer> set = new HashSet<>(); 
		for (int i : map.values()) {
			set.add(i); 
		}
		
		System.out.println("Map size: " + map.size());
		System.out.println("Set size: " + set.size());

	
	} 

}
